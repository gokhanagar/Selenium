package tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utilities.ConfigReader;
import tests.utilities.Driver;
import tests.utilities.ReusableMethods;

public class Q13FakeEmail {
/*

    @Test
    public void test_US_09_TC_08(){

        // STEP: The code received via email should be entered in the verification code text box.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();

        //Enter invalid Re-Send Code in "Verification Code" box.
        String resendCode = ConfigReader.getProperty("re_send_invalid_code");
        vendorRegistrationPage.reSendCodeInput.sendKeys(resendCode);
        vendorRegistrationPage.registerButton.click();

        //Verify when user does not enter Re-Send Code "Email Verification Code: This field is required." text is  visible
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Email Verification Code: This field is required."));

        Driver.getDriver().close();

    }


    @Test
    public void test_US_09_TC_09(){

        // STEP: Password should be entered and it should contain uppercase, lowercase, digit and special char.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("strong_password"));

        //Verify "Good" or "Strong"  text is visible
        String passwordRules =  vendorRegistrationPage.passwordStrength.getText();
        Assert.assertTrue(passwordRules.contains("Good") || passwordRules.contains("Strong"));

        Driver.getDriver().close();
    }

    @Test
    public void test_US_09_TC_10(){

        // STEP: Password should be entered and it should contain uppercase, lowercase, digit and special char.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter invalid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("weak_password"));

        //Verify "Weak" or "Too short" text is visible
        String passwordRules =  vendorRegistrationPage.passwordStrength.getText();
        Assert.assertTrue(passwordRules.contains("Weak") || passwordRules.contains("Too short"));

        Driver.getDriver().close();
    }


    @Test
    public void test_US_09_TC_11(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the password again in the  "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));
        vendorRegistrationPage.registerButton.click();

        //Verify "Confirm Password: This field is required." text is not visible
        Assert.assertFalse(vendorRegistrationPage.errorMessage.getText().contains("Confirm Password: This field is required."));

    }
7:29

    @Test
    public void test_US_09_TC_12(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPage fakemailPage = new FakeMailPage();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter different password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("weak_password"));
        vendorRegistrationPage.registerButton.click();

        //Verify "Password and Confirm-password are not same." text is visible
        Assert.assertTrue(vendorRegistrationPage.errorMessage.isDisplayed());


    }



    @Test
    public void test_US_09_TC_13(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPage fakemailPage = new FakeMailPage();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(verificationCode);

        //Enter invalid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("weak_password"));

        //Enter the same invalid password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("weak_password"));
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPage.registerButton);

        //Verify "Password strength should be atleast "Good"." text is visible
        Assert.assertTrue(vendorRegistrationPage.passwordRules.isDisplayed());

        Driver.getDriver().close();

    }
7:29

    @Test
    public void test_US_09_TC_14(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPage fakemailPage = new FakeMailPage();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPage.registerButton);

        //Verify "Welcome to Allover Commerce!" text is visible
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://allovercommerce.com/vendor-register/"));



    }
7:29


    @Test
    public void test_US_09_TC_15(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPage fakemailPage = new FakeMailPage();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);


        //Enter invalid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_invalid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPage.registerButton);

        //Verify "Email verification code invalid." text is visible

        Assert.assertTrue(vendorRegistrationPage.errorMessage.isDisplayed());

    }


    @Test
    public void test_US_09_TC_16(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("strong_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("strong_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPage.registerButton);


        //Verify "This Email already exists. Please login to the site and apply as vendor." text is visible
        Assert.assertTrue(vendorRegistrationPage.errorMessage.getText().equals("This Email already exists. Please login to the site and apply as vendor."));


    }


    @Test
    public void test_US_09_TC_17(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePage.singInButton.click();


        //Click on "Sign up"
        homePage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePage.becomeAVendorButton.click();

        //Enter a valid not regestered email adress
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPage fakemailPage = new FakeMailPage();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPage.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPage.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        vendorRegistrationPage.registerButton.click();

        //Verify "This Email already exists. Please login to the site and apply as vendor." text is not visible
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("This Email already exists. Please login to the site and apply as vendor."));

    }
}

 */











}
