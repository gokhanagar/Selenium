from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class radio_button:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://www.facebook.com")


    # click create an account
    create_account_button = driver.find_element(By.XPATH,"//*[text()='Yeni hesap oluştur']")
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(create_account_button)).click()


    female_button = driver.find_element(By.XPATH,"//input[@value='1']")
    male_button = driver.find_element(By.XPATH,"//input[@value='2']")
    custom_button = driver.find_element(By.XPATH,"//input[@value='-1']")

    time.sleep(2)

    if(male_button.is_selected != True):
        WebDriverWait(driver,10).until(EC.element_to_be_clickable(male_button)).click()

    





















