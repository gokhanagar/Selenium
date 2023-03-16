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
    expected_tag_name = "input"
    actual_tag_name = search_box.tag_name
    print(actual_tag_name)

    if(actual_tag_name == expected_tag_name):
        print("test is passed")
    else:
        print("test is failed")


    expected_name = "field-keywords"
    actual_name = search_box.get_attribute("name")

    print(actual_name)

    if(actual_name == expected_name):
        print("name atrribute test is passed")
    else:
        print("name attribute test is failed")























