from selenium import webdriver
import time

class get_page_source:
    
    driver = webdriver.Chrome()
    driver.get("https://www.amazon.com")
    driver.maximize_window()

    page_source = driver.page_source    
    search_word = "amazon"

    if(search_word in page_source):
        print("page_source is passed")

    else:
        print("search_word is absent test is failed")


    



