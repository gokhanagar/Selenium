
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
    
    
    # Access the values in the worksheet
    cell = worksheet.cell (row=1, column=1)
    print(cell.value)
    
    # Close the workbook    
    workbook.close()
    
    
    
    
    '''
    def getRowCount (file,sheetName):
    workbook = openpyxl.load_workbook(file)
    sheet = workbook.get_sheet_by_name(sheetName)
    return(sheet.max_row)

    def getColumnCount(file,sheetName):
    workbook = openpyxl.load_workbook(file)
    sheet = workbook.get_sheet_by_name(sheetName)
    return(sheet.max_column)

    def readData(file,sheetName,rownum,columnno):
    workbook = openpyxl.load_workbook(file)
    sheet = workbook.get_sheet_by_name(sheetName)
    return sheet.cell(row=rownum, column=columnno).value
    
    def writeData(file,sheetName,rownum,columnno,data):
    workbook = openpyxl.load_workbook(file)
    sheet = workbook.get_sheet_by_name(sheetName)
    sheet.cell(row = 2, column = 8).value = "Python"
    workbook.save(file)

    
    '''
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    