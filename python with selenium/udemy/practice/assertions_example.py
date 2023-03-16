from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("http://localhost/se/table.html")
time.sleep(3)

try:
    assert '404 Not Found' not in driver.page_source
except AssertionError:
    print('Error: page not found, check URL')    





