import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert


class hw:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://www.amazon.com")

    first_handle = driver.current_window_handle
    print(first_handle)
    
    
    
    search_box = driver.find_element(By.ID,"twotabsearchtextbox")
    search_box.send_keys("Bicycle")
    search_box.send_keys(Keys.ENTER)

    first_picture = driver.find_element(By.XPATH,"(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    

    driver.switch_to.new_window()
    time.sleep(4)

    driver.get("https://www.amazon.com")
    search_box = driver.find_element(By.ID,"twotabsearchtextbox")
    search_box.send_keys("Bicycle")
    search_box.send_keys(Keys.ENTER)
    first_picture_ = driver.find_element(By.XPATH,"(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    first_picture_.click()

    product_title = driver.find_element(By.XPATH,"//span[@id=\"productTitle\"]")
    print(product_title.text)
    print(driver.current_url)

    time.sleep(4)
    driver.switch_to.window(first_handle)
    time.sleep(4)
    print(driver.current_url)














