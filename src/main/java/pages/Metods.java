package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Metods {

    String userLogin = "testCuc13@mail.com"; //change email every run when create new user
    String userPassword = "123test123";

    private SelenideElement loginButton = $(By.className("login"));
    private SelenideElement emailFieldFoNewUser = $(By.cssSelector("#email_create"));
    private SelenideElement createNewUserButton = $(By.cssSelector("#SubmitCreate"));
    private SelenideElement genderButton = $(By.cssSelector("#uniform-id_gender1"));
    private SelenideElement firstNameField = $(By.cssSelector("#customer_firstname"));
    private SelenideElement lastNameField = $(By.cssSelector("#customer_lastname"));
    private SelenideElement passwordField = $(By.cssSelector("#passwd"));
    private SelenideElement firstNameField2 = $(By.xpath("//input[@id = 'firstname']"));
    private SelenideElement lastNameField2 = $(By.xpath("//input[@id = 'lastname']"));
    private SelenideElement addresField = $(By.cssSelector("#address1"));
    private SelenideElement cityField = $(By.cssSelector("#city"));
    private SelenideElement statelist = $(By.cssSelector("#id_state"));
    private SelenideElement state = $(By.cssSelector("#id_state > option:nth-child(34)"));
    private SelenideElement postcodeField = $(By.xpath("//input[@id = 'postcode']"));
    private SelenideElement countryfield = $(By.cssSelector("#id_country"));
    private SelenideElement countryName = $(By.cssSelector("#id_country > option:nth-child(2)"));
    private SelenideElement mobilyPhoneField = $(By.cssSelector("#phone_mobile"));
    private SelenideElement addresField2 = $(By.cssSelector("#alias"));
    private SelenideElement submitButton = $(By.cssSelector("#submitAccount"));
    private SelenideElement logo = $(By.cssSelector("#header_logo"));
    private SelenideElement emailFieldSingInForm = $(By.cssSelector("#email"));
    private SelenideElement passwordFieldSingInForm = $(By.cssSelector("#passwd"));

    public void openLoginPage(){
        loginButton.click();
    }

    public void createNewUser(){
        emailFieldFoNewUser.sendKeys(userLogin);
        createNewUserButton.click();
        genderButton.click();
        firstNameField.sendKeys("testUser");
        lastNameField.sendKeys("lastName");
        passwordField.sendKeys(userPassword);
        firstNameField2.sendKeys("firstname");
        lastNameField2.sendKeys("lastname");
        addresField.sendKeys("test addresr");
        cityField.sendKeys("city1");
        statelist.click();
        state.click();
        postcodeField.sendKeys("12345");
        countryfield.click();
        countryName.click();
        mobilyPhoneField.sendKeys("375333029610");
        addresField2.sendKeys("addresr2");
        submitButton.click();
        screenshot("firstscreen");
    }

    public void openStartPage(){
        screenshot("userHomePage");
        logo.click();
        screenshot("userHomePage");
    }

    public void login(){
        loginButton.click();
        emailFieldSingInForm.sendKeys(userLogin);
        passwordFieldSingInForm.sendKeys(userPassword + '\n');
    }
}
