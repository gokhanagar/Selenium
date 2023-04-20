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
    driver.get("https://the-internet.herokuapp.com/context_menu")
    
    action = ActionChains(driver)
    striped_line_element = driver.find_element(By.ID,"hot-spot")
    action.context_click(striped_line_element).perform()
    
    # accept alert “You selected a context menu”
    expected_text = "You selected a context menu"
    actual_text = driver.switch_to.alert.text
    print(actual_text)
    assert expected_text in actual_text
    driver.switch_to.alert.accept()
    
    #Click elemental selenium link
    first_handle = driver.current_window_handle
    time.sleep(3)
    driver.find_element(By.XPATH,"//*[text()='Elemental Selenium']").click()
    
    handle_list = driver.window_handles
    second_handle = ""
    for each in handle_list:
        second_handle = each
        
    # Check “Elemental Selenium” on h1 tag on new window
    driver.switch_to.window(second_handle)
    text_element = driver.find_element(By.TAG_NAME,"h1")
    expected_text_iki = "Elemental Selenium"
    actual_text_iki = text_element.text
    assert expected_text_iki in actual_text_iki
    
    print(actual_text_iki)
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    