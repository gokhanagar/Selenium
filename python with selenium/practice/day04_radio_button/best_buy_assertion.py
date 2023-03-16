from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class best_buy:

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://www.bestbuy.com/")


    expectedUrl = "https://www.bestbuy.com/"
    actualUrl = driver.current_url
    assert actualUrl == expectedUrl

    unwwanted_word = "Rest"
    actual_title = driver.title
    assert unwwanted_word not in actual_title


    francais_elementi = driver.find_element(By.XPATH,"//*[text()='Français']")
    assert francais_elementi.is_displayed()








