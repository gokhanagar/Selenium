import time,unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert



class irfame_hw:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("http://webdriveruniversity.com/IFrame/index.html")

    iframe = driver.find_element(By.XPATH,"//iframe[@id='frame']")
    driver.switch_to.frame(iframe)

    pop_up_element = driver.find_element(By.XPATH,"//div[@class='modal-body']")
    print(pop_up_element.text)

    driver.find_element(By.CSS_SELECTOR,"button[id='button-find-out-more']").click()
    time.sleep(2)
    driver.find_element(By.XPATH,"(//button[@data-dismiss='modal'])[3]").click()

    driver.switch_to.parent_frame()
    driver.find_element(By.XPATH,"//a[@class='navbar-brand']").click()

    expected_url = "http://webdriveruniversity.com/index.html"
    actual_url = driver.current_url
    print("Actual url " ,actual_url)

    assert actual_url == expected_url













