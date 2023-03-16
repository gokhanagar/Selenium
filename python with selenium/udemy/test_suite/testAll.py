import unittest,time
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from locators import LoginPageLocators
from locators import CommonPageLocators
from locators import AdminPageLocators
from page import LoginPage


class TestHRMBase(unittest.TestCase):
    """
    TBD
    """

    @classmethod
    def setUp(cls):
        chrome_options = webdriver.ChromeOptions()
        # chrome_options.add_argument('headless')
        chrome_options.add_argument('window-size=1920x1080')
        cls.driver = webdriver.Chrome(options=chrome_options)

    @classmethod
    def tearDownClass(cls):
        #cls.driver.close()
        time.sleep(2)


class TestLogin(TestHRMBase):
    """
    TBD
    """
    
    def setUp(self):
        #super().setUp()
        self.login = LoginPage(self.driver)

    
    def test_TC_L_001(self):
        self.login.assert_elem_text(LoginPageLocators.login_panel, 'LOGIN Panel')
        user_name_input = self.login.driver.find_element(*LoginPageLocators.username)
        self.assertEqual(user_name_input.tag_name, 'input')
        password_input = self.login.driver.find_element(*LoginPageLocators.password)
        self.assertEqual(password_input.tag_name, 'input')
        self.login.is_clickable(LoginPageLocators.login_button)




    def test_TC_L_002(self):
        self.login.send_text(LoginPageLocators.username, self.login.default_username)
        self.login.send_text(LoginPageLocators.password, self.login.default_password)
        self.login.click(LoginPageLocators.login_button)
        self.assertTrue('dashboard' in self.driver.current_url)
        self.assertTrue('<h1>Dashboard</h1>' in self.login.driver.page_source)



    def test_TC_L_003(self):
       self.login.send_text(LoginPageLocators.username, self.login.default_username)
       self.login.send_text(LoginPageLocators.password, 'password') 
       self.login.click(LoginPageLocators.login_button)
       self.login.assert_elem_text(LoginPageLocators.span_msg, 'Invalid credentials')


class TestAdmin(TestHRMBase):

    @classmethod
    def setUpClass(cls):
        super().setUp(cls)
        cls.login = LoginPage(cls.driver)
        cls.login.login()
        cls.page = cls.login


    def test_TC_A_001(self):

        job_title = 'QA automation developer'
        job_description = 'Automating tests in Python and Selenium Webdriver.'
        self.page.hover_to(CommonPageLocators.admin)
        self.page.hover_to(AdminPageLocators.job)
        self.page.click(AdminPageLocators.job_titles)    
        self.page.click(AdminPageLocators.job_title_add_btn)
        self.page.send_text(AdminPageLocators.job_title_jd_field,job_title)
        self.page.click(AdminPageLocators.job_title_save_btn)
        table = self.page.get_elem(AdminPageLocators.job_title_table)
        assert job_title in table.get_attribute('innerHTML')

























if __name__ == '__main__':
    unittest.main()     
