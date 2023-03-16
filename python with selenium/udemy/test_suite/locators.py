from selenium.webdriver.common.by import By

class CommonPageLocators:
    admin = (By.ID,'menu_admin_viewAdminModule')



class LoginPageLocators:
    login_panel = (By.ID,'logInPanelHeading')
    username = (By.ID,'txtUsername')
    password = (By.ID,'txtPassword')
    login_button = (By.ID,'btnLogin')
    span_msg = (By.ID,'spanMessage')



class AdminPageLocators:
    job = (By.ID,'menu_admin_Job')
    job_titles = (By.ID,'menu_admin_viewJobTitleList')
    job_title_add_btn = (By.ID, 'btnAdd')
    job_title_jd_field = (By.ID, 'jobTitle_jobTitle')
    job_title_save_btn = (By.ID,'btnSave')
    job_title_table = (By.ID,'resultTable')
    job_workshift = (By.ID,'menu_admin_workShift')
    job_workshift_add_btn = (By.ID,'btnAdd')
    job_workshift_name = (By.ID,'workShift_name')
    job_workshift_to_hour = (By.ID, 'workShift_workHours_to')
    job_workshift_save_btn = (By.ID,'btnSave')
    job_workshift_table = (By.Id,'resultTable') 

























