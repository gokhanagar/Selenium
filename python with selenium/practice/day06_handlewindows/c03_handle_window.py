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
    driver.get("https://the-internet.herokuapp.com/windows")
    
    text_element = driver.find_element(By.XPATH,"//h3")
    expected_text = "Opening a new window"
    actual_text = text_element.text
    assert expected_text in actual_text
    
    expected_title = "The Internet"
    actual_title = driver.title
    assert expected_title in actual_title
    
    current_handle = driver.current_window_handle
    print(current_handle)
    
    driver.find_element(By.LINK_TEXT,"Click Here").click()
    
    hande_list = driver.window_handles
    second_handle = ""
    for each in hande_list:
        if(each not in current_handle):
            second_handle = each
            
    driver.switch_to.window(second_handle)
    time.sleep(3)
    expected_second_title ="New Window"
    actual_second_title = driver.title
    assert expected_second_title in actual_second_title
    
    second_text_element = driver.find_element(By.XPATH,"//h3")
    expected_second_text = "New Window"        
    actual_second_text = second_text_element.text
    assert expected_second_text in actual_second_text
    
    driver.switch_to.window(current_handle)
    time.sleep(3)
    expected_title2 = "The Internet"
    actual_title2 = driver.title
    assert expected_title2 in actual_title2 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    