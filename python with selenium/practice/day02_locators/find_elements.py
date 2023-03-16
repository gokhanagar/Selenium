from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.common.keys import Keys


class find_elements:


    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://www.amazon.com");

    list = driver.find_elements(By.TAG_NAME,'a')
    print("number of link: " , len(list))


    





















