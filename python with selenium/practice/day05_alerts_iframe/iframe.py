import time,unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert



class irfame:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://the-internet.herokuapp.com/iframe")

    title = driver.find_element(By.XPATH,"//h3")
    assert title.is_enabled()
    print(title.text)

    driver.switch_to.frame("mce_0_ifr")

    text_box = driver.find_element(By.XPATH,"//body[@id='tinymce']") 
    text_box.clear()

    text_box.send_keys("Hello World")
    time.sleep(3)

    driver.switch_to.parent_frame()
    link_text = driver.find_element(By.LINK_TEXT,"Elemental Selenium")
    assert link_text.is_displayed()
    print(link_text.text)























