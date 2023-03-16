from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class check_box:

    driver= webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(10)
    driver.get("https://the-internet.herokuapp.com/checkboxes")

    check_box1 = driver.find_element(By.XPATH,"(//input[@type='checkbox'])[1]")
    check_box2 = driver.find_element(By.XPATH,"(//input[@type='checkbox'])[2]")


    if (check_box1.is_selected != True ):
        WebDriverWait(driver,10).until(EC.element_to_be_clickable(check_box1)).click()
        

    time.sleep(3)
 
    if (check_box2.is_selected != True):
        WebDriverWait(driver,10).until(EC.element_to_be_clickable(check_box2)).click()


    time.sleep(3)



    

















