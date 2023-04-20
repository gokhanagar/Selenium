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
    driver.get("http://webdriveruniversity.com/")
    
    action = ActionChains(driver)
    action.send_keys(Keys.ARROW_DOWN).perform()
    first_page_handle = driver.current_window_handle
    time.sleep(3)
    
    portal = driver.find_element(By.XPATH,"//*[text()='LOGIN PORTAL']")
    portal.click()
    
    second_page = ""
    list_handle = driver.window_handles
    for each in list_handle:
        second_page = each
        
    driver.switch_to.window(second_page)
        
        
    # Print sth into username and password boxes
    faker = Faker()
    driver.find_element(By.XPATH,"//input[@type='text']").send_keys(faker.name())
    driver.find_element(By.XPATH,"//input[@type='password']").send_keys(faker.password())
    
    driver.find_element(By.XPATH,"//button[@type='submit']").click()
    
    actual_text = driver.switch_to.alert.text
    expected_fail = "validation failed"
    print(actual_text)
    assert expected_fail in actual_text
    

    driver.switch_to.alert.accept()
    driver.switch_to.window(first_page_handle)
    time.sleep(2)
    
    driver.find_element(By.XPATH,"//div[@class='row']").is_displayed()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    