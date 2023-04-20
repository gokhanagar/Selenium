import unittest,time
from selenium import webdriver
from page import HomePage
from page import AboutPage
from locators import CommonPageLocators
from locators import AboutPageLocators
from selenium.webdriver.common.by import By

class TestPyOrgBase(unittest.TestCase):
    """
    TBD
    """

    @classmethod
    def setUpClass(cls):
        chrome_options = webdriver.ChromeOptions()
        # chrome_options.add_argument('headless')
        chrome_options.add_argument('window-size=1920x1080')
        cls.driver = webdriver.Chrome(options=chrome_options)

    @classmethod
    def tearDownClass(cls):
        #cls.driver.close()
        time.sleep(2)


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

















