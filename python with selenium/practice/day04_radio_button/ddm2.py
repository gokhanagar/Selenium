from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class drop_down:

    driver = webdriver.Chrome()
    driver.implicitly_wait(10)
    driver.maximize_window()
    driver.get("https://www.amazon.com")

    el = driver.find_element(By.XPATH,"//select[@id='searchDropdownBox']")
 

    for option in el.find_elements(By.TAG_NAME,'option'):
        if option.text == 'Books':
             option.click() # select() in earlier versions of webdriver
             time.sleep(2)
             break


    search_box = driver.find_element(By.ID,"twotabsearchtextbox")
    search_box.send_keys("Java")
    search_box.send_keys(Keys.ENTER)

    time.sleep(3)
    text_result = driver.find_element(By.XPATH,"(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    expected_result = "Java"

    assert expected_result in text_result.text
    























