package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutoExPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AutoExStepDefinitions {
    AutoExPage autoExPage = new AutoExPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    String fakerName = faker.name().fullName();
    String fakerEmail = faker.internet().emailAddress();
    String fakerPassword = faker.internet().password();

    @Given("Launch browser and Navigate to url {string}")
    public void launchBrowserAndNavigateToUrl(String autoExUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("autoExUrl"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        autoExPage.signupLoginButton.click();
    }

    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(autoExPage.newUserSignupTextElement.isDisplayed());
    }

    @Given("Enter name and email address")
    public void enter_name_and_email_address() {
        actions.click(autoExPage.newUserSignupNameBox)
                .sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerEmail).perform();
    }

    @Given("Click Signup button")
    public void click_signup_button() {
        autoExPage.signupButton.click();
    }

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String enterAccountInfoText = autoExPage.enterAccountInfoTextElement.getText();
        Assert.assertTrue(enterAccountInfoText.contains("ENTER ACCOUNT INFORMATION"));
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        actions.click(autoExPage.acountInfoMrRadioButton)
                .sendKeys(Keys.TAB).sendKeys(fakerName)
                .sendKeys(Keys.TAB).sendKeys(fakerPassword)
                .sendKeys(Keys.TAB).sendKeys("20")
                .sendKeys(Keys.TAB).sendKeys("May")
                .sendKeys(Keys.TAB).sendKeys("2001")
                .sendKeys(Keys.TAB).perform();
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

        actions.click(autoExPage.newsletterCheckbox).sendKeys(Keys.TAB).perform();
    }

    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        actions.click(autoExPage.newsletterCheckbox2).sendKeys(Keys.TAB).perform();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(faker.company().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.country().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .perform();
    }

    @Given("Click Create Account button")
    public void click_create_account_button() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(autoExPage.acountCreatedTextBox.isDisplayed());
    }

    @Given("Click Continue button")
    public void click_continue_button() {
        autoExPage.acountCreatedContinueButton.click();
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(autoExPage.userNameElement.isDisplayed());
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        autoExPage.deleteAccountElement.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        //not found
    }

    @And("Close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(autoExPage.loginYourAccountTextBox.isDisplayed());
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        autoExPage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
        autoExPage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExValidPassword"));
    }

    @Given("Click login button")
    public void click_login_button() {
        autoExPage.loginButton.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
    }

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        autoExPage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail"));
        autoExPage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExInvalidPassword"));
    }

    @Given("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(autoExPage.emailOrPasswordIncorrectText.isDisplayed());
    }

    @Given("Click Logout button")
    public void click_logout_button() {
        autoExPage.logoutButton.click();
    }

    @Given("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(autoExPage.signupLoginButton.isDisplayed());
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        autoExPage.newUserSignupNameBox.sendKeys(ConfigReader.getProperty("autoExValidFullName"));
        autoExPage.newUserSignupEmailBox.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(autoExPage.emailAdressExistTextElement.isDisplayed());
    }

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        autoExPage.contactUsButton.click();
    }

    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertTrue(autoExPage.getInTouchTextElement.isDisplayed());
    }

    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        actions.click(autoExPage.contactUsNameBox).sendKeys(fakerName)
                .sendKeys(Keys.TAB).sendKeys(fakerEmail)
                .sendKeys(Keys.TAB).sendKeys("Invoice")
                .sendKeys(Keys.TAB).sendKeys("This is my first article on this page")
                .perform();
    }

    @Given("Upload file")
    public void upload_file() {
        //Passed olmasi icin Dosya yolunda "AutoEx.docx" isimli dosya olmalidir
        String filePath = System.getProperty("user.home") + "\\Desktop\\TechProEd\\Dokumanlar\\Selenium\\AutoEx.docx";
        autoExPage.uploadFileButton.sendKeys(filePath);
    }

    @Given("Click Submit button")
    public void click_submit_button() {
        autoExPage.contactUsSubmitButton.click();
    }

    @Given("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(autoExPage.contactUsAlertSuccessText.isDisplayed());
    }

    @Given("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        autoExPage.contactUsSuccessHomeButton.click();
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        autoExPage.testCasesButton.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(autoExPage.testCasesTitleText.isDisplayed());
    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(autoExPage.allProductsTextElement.isDisplayed());
    }

    @Given("Click on Products button")
    public void click_on_products_button() {
        autoExPage.productsButton.click();
    }

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(autoExPage.productsListElements.size() != 0);
    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        autoExPage.firstViewProduct.click();
    }


    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl = ConfigReader.getProperty("autoExFirstProductDetails");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("exp = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(autoExPage.productDetails.getText().contains("Category"));
    }

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        autoExPage.searchProduct.sendKeys(ConfigReader.getProperty("autoExValidProductName"));
        autoExPage.searchProductSubmit.click();
    }

    @Given("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        String searchedProductText = autoExPage.searchedProduct.getText();
        System.out.println("searchedProductText = " + searchedProductText);
        Assert.assertTrue(searchedProductText.contains(ConfigReader.getProperty("autoExValidProductName")));
    }

    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertTrue(autoExPage.searchedProduct.isDisplayed());
    }

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", autoExPage.subscriptionTitle);

    }

    @Given("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        Assert.assertTrue(autoExPage.subscriptionTitle.isDisplayed());
    }

    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        autoExPage.subscriptionTextBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail") + Keys.ENTER);
    }

    @Given("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        Assert.assertTrue(autoExPage.footerElement.getText().contains("You have been successfully subscribed!"));
    }
}
