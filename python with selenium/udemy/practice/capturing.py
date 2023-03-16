from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://hepsiburada.com")
driver.maximize_window()

driver.save_screenshot('homepage.png')
driver.get_screenshot_as_file('home.png')









