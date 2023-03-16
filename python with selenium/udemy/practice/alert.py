from selenium import webdriver
from selenium.webdriver.common.by import By
import time
driver = webdriver.Chrome()
driver.get("http://python.org")
time.sleep(1)

driver.maximize_window()
driver.find_element(By.CSS_SELECTOR,"a[title='Python Package Index']").click()
time.sleep(1)

# driver.switch_to_alert().accept()
driver.back()
time.sleep(1)




























