import time, os, glob
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
    
    print(os.path.exists("/Users/gokhanagar/Downloads/Gokhan+AGAR.pdf"))
    
    #it gives us file's directory address
    f = open(os.path.expanduser("~/Downloads/Gokhan+AGAR.pdf"))
    # print(f.name)
    
    print(os.getcwd())    # find directory
    
    
    
    downloads_folder = os.path.join(os.path.expanduser('~'),'Downloads')
    print("download path: ",downloads_folder)
    
    
    os.chdir(downloads_folder) #change directory
    print(os.getcwd())
    
    
    # for file in os.listdir(downloads_folder):
    #      print(file)
    
    # Get a list of all files in the Downloads folder
    files_list = glob.glob(downloads_folder + '/*')
    
    # for file_path in files_list:
    #     file_name = os.path.basename(file_path)
    #     if(file_name.__contains__("crane")):
    #         print(file_name)
    
    files_list_iki = os.listdir(downloads_folder)
    # sorted_files_list = sorted(files_list,)
    # print(sorted_files_list[1])
     
    
   
    
    
    
    
    
    
    
    
    
    