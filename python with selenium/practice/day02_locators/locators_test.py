from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC



class locators_test:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("http://a.testaddressbook.com")

    # Click sign in button
    signin = driver.find_element(By.LINK_TEXT,'Sign in')
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(signin)).click()

    email_text_box = driver.find_element(By.ID,"session_email")
    password_text_box = driver.find_element(By.NAME,"session[password]")
    






























