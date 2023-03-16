from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://hepsiburada.com")


# implicit wait
driver.implicitly_wait(3)
elem = driver.find_element(By.CSS_SELECTOR,"span[data-test-id='account']")

# explicit wait
# from selenium.webdriver.common.by import By
# from selenium.webdriver.support.ui import WebDriverWait
# from selenium.webdriver.support.ui import expected_conditions as EC
# elem = WebDriverWait(driver,10).until(EC.presence_of_element_located(By.CSS_SELECTOR,"span[data-test-id='account']"))


print('Found element with text: {}'.format(elem.get_attribute('innerHTML')))























