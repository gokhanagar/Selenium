from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC



class web_element:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://amazon.com")

    search_box = driver.find_element(By.ID,'twotabsearchtextbox')
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(search_box)).send_keys("city bike")
    search_box.send_keys(Keys.ENTER)

    element_list = driver.find_elements(By.CLASS_NAME,"sg-col-inner")
    result_text = element_list[0].text
    print(result_text)


    #product_image_list = driver.find_elements(By.CLASS_NAME,"s-image")
    product_image_list = driver.find_elements(By.CSS_SELECTOR,"div[class='a-section aok-relative s-image-fixed-height']")


    WebDriverWait(driver, 20).until(EC.element_to_be_clickable(product_image_list[0])).click()









































































