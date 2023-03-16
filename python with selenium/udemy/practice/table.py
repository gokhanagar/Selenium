from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("http://localhost/se/table.html")
time.sleep(3)

driver.find_element(By.XPATH,"//*[text()='Apple']/preceding-sibling::td/input").click()

driver.execute_script("document.body.style.zoom = '1.5")






























