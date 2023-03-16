import time,unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert



class alert_base(unittest.TestCase):
    """
    TBD
    """

    @classmethod
    def setUpClass(self):
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()
        self.driver.implicitly_wait(10)

   


class TestHome(TestPyOrgBase):
    """
    TBD
    """
    
    def setUp(self):
        #super().setUp()
        self.home = HomePage(self.driver)

    @unittest.skip('demonstrating a skipping of a test case')
    def test_TC001_py3_doc_button(self):
        self.home.hover_to(CommonPageLocators.DOC)
        self.home.assert_elem_text(CommonPageLocators.PY3_DOC_BUTTON,"Python Docs")
        self.home.click(CommonPageLocators.PY3_DOC_BUTTON)
        assert self.driver.current_url == 'https://docs.python.org/3/'



    def test_TC002_blahblah_search(self):
        self.home.search_for("blahblah")
        self.home.assert_elem_text(CommonPageLocators.SEARCH_RESULT_LIST,"No results found.")

    def test_TC004_assert_title(self):
        self.assertEqual(self.home.driver.title, "Welcome to Python.org")
        



class TestAbout(TestPyOrgBase):
    """
    TBD
    """

    def setUp(self):
        #super().setUp()
        self.about = AboutPage(self.driver)

    def test_TC003_verify_upcoming_events_section_present(self):
        self.about.assert_elem_text(AboutPageLocators.UPCOMING_EVENTS,"Upcoming Events")
        element =self.driver.find_element(By.XPATH,"//*[text()='Upcoming Events']")
        print(element.text)

    def test_TC005_assert_url(self):
        self.assertTrue('about' in self.about.driver.current_url)


if __name__ == '__main__':
    unittest.main()     

