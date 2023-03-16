from selenium import webdriver
import time

class navigate:

    driver = webdriver.Chrome()
    driver.maximize_window()

    driver.get("https://www.amazon.com")
    time.sleep(2)

    driver.get("https://www.facebook.com")
    time.sleep(2)

    # go back to amazon
    driver.back()
    time.sleep(2)

    # go to facebook
    driver.forward()

    driver.refresh()















