import time, os, glob
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.common.action_chains import ActionChains
from faker import Faker

class hw:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(15)
    driver.get("https://the-internet.herokuapp.com/upload")
    
    choose_file_button = driver.find_element(By.CSS_SELECTOR,"input[id='file-upload']")
    time.sleep(3)
    python_with_selenium_folder = os.path.join(os.path.expanduser('~'),'python with selenium /requirements.txt')
    print(python_with_selenium_folder)
    
    choose_file_button.send_keys(python_with_selenium_folder)
    
    driver.find_element(By.XPATH,"//input[@id=\"file-submit\"]").click()
    
    #check file uploaded text is displayed
    text_element = driver.find_element(By.TAG_NAME,"h3")
    assert text_element.is_displayed()
    time.sleep(3)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    