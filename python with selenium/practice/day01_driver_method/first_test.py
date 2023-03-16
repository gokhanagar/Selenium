from selenium import webdriver
import time

class first_test:
    
    driver = webdriver.Chrome()
    driver.maximize_window()

    # go to amazon url
    driver.get("https://www.amazon.com")

    #check amazon title includes 'amazon'
    search_word = "Amazon"
    actual_title = driver.title

    if(search_word in actual_title):
        print("passed")
    else:
        print('failed')    

    #check url "https://www.amazon.com"
    actual_url = driver.current_url
    expected_url = "https://www.amazon.com"

    if(expected_url in actual_url):
        print("passed")
    else:
        print('failed')












