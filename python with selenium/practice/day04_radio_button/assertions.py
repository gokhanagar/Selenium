from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class assertions:

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://www.amazon.com")

    actualUrl = driver.current_url
    assert "amazon" in actualUrl

    actual_title = driver.title
    assert "facebook" not in actual_title

    time.sleep(5)
    logo_element = driver.find_element(By.CSS_SELECTOR,"a[href='/ref=nav_logo']")
    print(logo_element.is_displayed() == True)
   
    if(logo_element.is_enabled()):
         print('element is found')
    else:
        print('element not found') 
   
    assert logo_element.is_enabled() == True
   
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(logo_element)).click()
    
    

    


    














