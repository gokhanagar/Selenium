import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert


class hw:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    
    #Open google on window 1
    driver.get("https://www.google.com")
    print("google title",driver.title)
    google_window_handle = driver.current_window_handle
    
    
    #Open amazon on window 2
    driver.switch_to.new_window()
    driver.get("https://www.amazon.com")
    print("Amazon title", driver.title)
    amazon_window_handle = driver.current_window_handle
    
    
    #Open linkedin on window 3
    driver.switch_to.new_window()
    driver.get("https://www.linkedin.com")
    print("Linkedin title", driver.title)
    linkedin_window_handle = driver.current_window_handle
    
    
    # Switch between windows
    # Switch to amazon
    time.sleep(2)
    driver.switch_to.window(amazon_window_handle)
    
    # Switch to Google
    time.sleep(2)
    driver.switch_to.window(google_window_handle)
    
     # Switch back to Linkedin
    time.sleep(2)
    driver.switch_to.window(linkedin_window_handle)  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    