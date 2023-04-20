import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By


@pytest.fixture(scope="class")
def setup(request):
      driver = webdriver.Chrome()
      driver.maximize_window()
      driver.implicitly_wait(15)
      driver.get("https://demowebshop.tricentis.com/")
      request.cls.driver = driver 
      yield 
      driver.quit() 




































