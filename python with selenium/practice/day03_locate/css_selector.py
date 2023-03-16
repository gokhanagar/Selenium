from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class css_selector:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("http://a.testaddressbook.com/sign_in")

    # locate email textbox
    mail_text_box = driver.find_element(By.CSS_SELECTOR,"#session_email")

    #Locate password textbox
    password_text_box = driver.find_element(By.CSS_SELECTOR,"#session_password")

    #Locate signin button
    signIn_button = driver.find_element(By.CSS_SELECTOR,"input[value='Sign in']")

    mail_text_box.send_keys("gokhanagargmail.com")
    password_text_box.send_keys("test123")
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(signIn_button)).click()

















