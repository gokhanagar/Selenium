
import time, os, glob, openpyxl
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.common.action_chains import ActionChains
from faker import Faker

class hw:
    
    # Load the Excel workbook
    workbook = openpyxl.load_workbook("/Users/gokhanagar/python with selenium /dunyada_ulkeler_listesi.xlsx")
    
    # Select the active worksheet
    worksheet = workbook.get_sheet_by_name("Dünyada Ülkeler Listesi")
    #worksheet = workbook.active
    
    
    # Get the last row of the worksheet
    last_row = worksheet.max_row
    
    data = ""
    for each in range(1,last_row):
        data = worksheet.cell (row=each, column=1)
        print(data.value)
    
    
    # Close the workbook    
    workbook.close()