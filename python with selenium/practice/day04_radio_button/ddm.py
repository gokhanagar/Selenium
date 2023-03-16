from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select


class drop_down_menu:

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://the-internet.herokuapp.com/dropdown")

    el = driver.find_element(By.XPATH,"//select[@id='dropdown']")
 

    # for option in el.find_elements(By.TAG_NAME,'option'):
    #    if option.text == 'Option 1':
    #         option.click() # select() in earlier versions of webdriver
    #         time.sleep(2)
    #         break



    driver.find_element(By.XPATH,"//select[@id='dropdown']/option[text()='Option 2']").click()
    time.sleep(2)




















