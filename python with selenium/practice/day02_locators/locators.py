from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.common.keys import Keys



class locators:

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://www.amazon.com")

    search_box = driver.find_element(By.NAME,'field-keywords')

    search_box.send_keys("bicycle")
    search_box.send_keys(Keys.ENTER)























