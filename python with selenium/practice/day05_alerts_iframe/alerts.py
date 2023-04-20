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
    def setUpClass(cls):
        cls.driver = webdriver.Chrome()
        cls.driver.maximize_window()
        cls.driver.implicitly_wait(10)
        cls.driver.get("https://the-internet.herokuapp.com/javascript_alerts")
   


class TestHome(alert_base):
    """
    TBD
    """
        
    def test_TC001_accept_alert(self):
        self.driver.find_element(By.XPATH,"//*[text()='Click for JS Alert']").click()
        alert = Alert(self.driver)
        print(alert.text)
        alert.accept()

        expected_result = "You successfully clicked an alert"
        actual_result = self.driver.find_element(By.XPATH,"//p[@id='result']")

        print(actual_result.text)
        assert expected_result == actual_result.text    
        time.sleep(3)

    def test_TC002_dismiss_alert(self):
        self.driver.find_element(By.XPATH,"//*[text()='Click for JS Confirm']").click()
        alert = Alert(self.driver)
        alert.dismiss()

        expected_result = "successfully"
        result_element = self.driver.find_element(By.ID,"result")

        assert expected_result not in result_element.text
        time.sleep(3)


    def test_TC003_send_keys_alert(self):
        self.driver.find_element(By.XPATH,"//*[text()='Click for JS Prompt']").click()
        alert = Alert(self.driver)
        alert.send_keys("Defne")
        time.sleep(3)
        alert.accept()
        time.sleep(3)
        expected_result = "Defne"
        actual_result = self.driver.find_element(By.XPATH,"(//p)[2]")
        print(actual_result.text)

        assert expected_result in actual_result.text
        time.sleep(3)


if __name__ == '__main__':
    unittest.main()     

