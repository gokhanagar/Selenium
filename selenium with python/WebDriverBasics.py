from selenium import webdriver
from selenium.webdriver.common.by import By


driver =webdriver.Chrome(executable_path="C:\\Users\\gokha\\selenium with python\\selenium with python\\driver\\chromedriver.exe")


driver.get("http://www.hepsiburada.com")

optionList = driver.find_elements(By.CSS_SELECTOR,"li[class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP']")
print(len(optionList))
print(driver.title)

for ele in optionList:
  print(ele.text)

  if ele.text == 'Moda':
   ele.click()
   break
  
  

driver.quit()


