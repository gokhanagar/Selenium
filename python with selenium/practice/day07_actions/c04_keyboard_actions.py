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
    driver.get("https://www.amazon.com")
    
    search_box = driver.find_element(By.ID,"twotabsearchtextbox")
    
    action = ActionChains(driver)
    action.click(search_box).key_down(Keys.SHIFT).send_keys("B").key_up(Keys.SHIFT).send_keys("i").send_keys("c").send_keys("y").send_keys(Keys.ENTER).perform()
    
    
    
    
    
    
    
    
    
    