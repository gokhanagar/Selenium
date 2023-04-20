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
    driver.implicitly_wait(10)
    driver.get("https://the-internet.herokuapp.com/download")
    
    dummy_link = driver.find_element(By.XPATH,"//a[text()='Certifications.pdf']")
    dummy_link.click()
    time.sleep(5)
    
    #Check file is downloaded
    assert os.path.exists("/Users/gokhanagar/Downloads/Certifications.pdf")
    
    os.remove("/Users/gokhanagar/Downloads/Certifications.pdf")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    