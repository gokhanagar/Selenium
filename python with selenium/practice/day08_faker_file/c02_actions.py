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
    driver.get("https://html.com/tags/iframe/")
    
    action = ActionChains(driver)
    action.send_keys(Keys.PAGE_DOWN).perform()
    
    # click play button
    iframe = driver.find_element(By.XPATH,"//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']") 
    driver.switch_to.frame(iframe)
    driver.find_element(By.XPATH,"//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']").click()
    
    # check video is played
    time.sleep(1)
    youtube_link = driver.find_element(By.XPATH,"//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']")
    assert youtube_link.is_displayed()
    
    print(youtube_link.is_displayed())
    time.sleep(5)
    
    driver.switch_to.parent_frame()
    code_example = driver.find_element(By.XPATH,"//*[text()='Code Example']")
    assert code_example.is_displayed()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    