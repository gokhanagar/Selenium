from selenium import webdriver
import time


class driver_method:

    driver = webdriver.Chrome()
    driver.get("https://www.amazon.com")
    driver.maximize_window()

    print("actual title: " , driver.title )
    print("actual url: " , driver.current_url )


















