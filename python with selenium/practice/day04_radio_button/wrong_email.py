from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class wrong_email:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("http://automationpractice.com/index.php")

    driver.find_element(By.XPATH,"//a[@class='login']").click()

    mail_box = driver.find_element(By.XPATH,"//input[@id='email_create']")
    mail_box.send_keys("test@gmail.com")
    mail_box.send_keys(Keys.ENTER)

    warning_text = driver.find_element(By.XPATH,"//*[text()='Invalid email address.']")
    assert warning_text.is_displayed()

    












































