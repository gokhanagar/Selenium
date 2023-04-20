import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert


class alerts:

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://the-internet.herokuapp.com/javascript_alerts")
    driver.find_element(By.XPATH,"//*[text()='Click for JS Alert']").click()

    alert = Alert(driver)
    print(alert.text)
    alert.accept()


    expected_result = "You successfully clicked an alert"
    actual_result = driver.find_element(By.XPATH,"//p[@id='result']")

    print(actual_result.text)
    assert expected_result == actual_result.text

    

































