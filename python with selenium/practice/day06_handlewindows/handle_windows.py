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
    driver.get("https://www.amazon.com")

    first_handle = driver.current_window_handle
    print(first_handle)
    
    actual_url = driver.current_url
    assert 'amazon' in actual_url
    
    
    driver.switch_to.new_window()
    time.sleep(4)
    driver.get("https://www.bestbuy.com")
    second_handle = driver.current_window_handle
    
    actual_title = driver.title
    search_word = "Best Buy"
    assert search_word in actual_title
    
    driver.switch_to.window(first_handle)
    time.sleep(4)
    search_box = driver.find_element(By.ID,"twotabsearchtextbox")
    search_box.send_keys("Java",Keys.ENTER)
    
    text_result_element = driver.find_element(By.XPATH,"//div[@class='a-section a-spacing-small a-spacing-top-small']")
    text_result = text_result_element.text
    expected_search_word = "Java"
    assert expected_search_word in text_result
    
    driver.switch_to.window(second_handle)
    time.sleep(4)
    logo_element = driver.find_element(By.XPATH,"(//img[@class='logo'])[1]")
    assert logo_element.is_displayed()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    