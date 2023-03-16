from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC



class xpath:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)

    driver.get("https://the-internet.herokuapp.com/add_remove_elements/")

    # click add element button
    add_button = driver.find_element(By.XPATH,"//button[@onclick='addElement()']")
    WebDriverWait(driver,10).until(EC.element_to_be_clickable(add_button)).click()
    

    # check delete button is visible
    delete_button = driver.find_element(By.XPATH,"//button[@class='added-manually']")

    if(delete_button.is_displayed):
        print("test is passed")
    else:
        print("test is failed")    


































