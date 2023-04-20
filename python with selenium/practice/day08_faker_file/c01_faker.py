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
    driver.get("https://www.facebook.com")
    
    # click register button
    driver.find_element(By.XPATH,"//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']").click()
    
    #locate name box
    name_box = driver.find_element(By.XPATH,"//input[@name='firstname']")
    
    action = ActionChains(driver)
    faker = Faker()
    fake_mail = faker.email()
    
    action.click(name_box).send_keys(faker.name()).send_keys(Keys.TAB).send_keys(faker.name()).send_keys(Keys.TAB).send_keys(fake_mail).send_keys(Keys.ENTER).perform()
    time.sleep(2)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    