import time
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
    driver.get("https://demoqa.com/droppable")
    
    action = ActionChains(driver)
    drag_element = driver.find_element(By.XPATH,"//div[@id='draggable']")
    target_element = driver.find_element(By.XPATH,"(//div[@id='droppable'])[1]")
    action.drag_and_drop(drag_element,target_element).perform()
    
    # check if it is dropped
    result_text_element = driver.find_element(By.XPATH,"//*[text()='Dropped!']") 
    expected_text = "Dropped!"
    actual_text = result_text_element.text
    assert expected_text in actual_text
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    