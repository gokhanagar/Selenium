from locators import CommonPageLocators
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from locators import LoginPageLocators


class BasePage:
    """
    Base Page class that hold common elements
    and functionalities to all pages in app
    """

    def __init__(self, driver):
        self.driver = driver

    def click(self, by_locator):
        WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator)).click()

    def hover_to(self, by_locator):
        element = WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator))   
        ActionChains(self.driver).move_to_element(element).perform()

    def assert_elem_text(self, by_locator, elem_text):
        element = WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator))
        assert element.text == elem_text
        

    def search_for(self,search_string):
        WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(CommonPageLocators.SEARCH_BAR)).send_keys(search_string)
        WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(CommonPageLocators.SEARCH_GO_BUTTON)).click()

    def is_clickable(self,by_locator):
        return WebDriverWait(self.driver,10).until(EC.element_to_be_clickable(by_locator))
    
    def send_text(self, by_locator, text):
        return WebDriverWait(self.driver, 10).until(EC.invisibility_of_element_located(by_locator)).send_keys(text)
    
    def get_elem(self,by_locator, waitFor=20):
        return WebDriverWait(self.driver, waitFor).until(EC.visibility_of_element_located(by_locator))
    
    def choose(self, drop_down_sel, value):
        ddm = WebDriverWait(self.driver, 10).until(EC.invisibility_of_element_located(drop_down_sel))
        ddm.find_element(By.CSS_SELECTOR,"[value='{}']".format(value)).click()




class LoginPage(BasePage):
    """
    Login page of OHRM
    """
    def __init__(self, driver):
        super().__init__(driver)
        self.driver.get("https://opensource-demo.orangehrmlive.com")
        self.default_username = 'Admin'
        self.default_password = 'admin123'


    def login(self):
        self.send_text(LoginPageLocators.username, self.default_username)
        self.send_text(LoginPageLocators.password, self.default_password)
        self.click(LoginPageLocators.login_button)



















