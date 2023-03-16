from selenium import webdriver

driver = webdriver.Chrome()
driver.get("http://python.org")
assert 'python' in driver.title.lower()
driver.close()



















































