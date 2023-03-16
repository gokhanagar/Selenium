from selenium.webdriver.common.by import By

class CommonPageLocators:

    SEARCH_BAR = (By.ID,"id-search-field")
    SEARCH_GO_BUTTON = (By.ID,"submit")
    DOC = (By.ID,"documentation")
    PY3_DOC_BUTTON = (By.XPATH,"//*[@id='documentation']/ul/li[10]/p[2]/a")
    SEARCH_RESULT_LIST =(By.XPATH,"//h3[text()='Results']/following-sibling::ul")



class AboutPageLocators:
    UPCOMING_EVENTS = (By.XPATH,"//*[text()='Upcoming Events']")
                      




















































