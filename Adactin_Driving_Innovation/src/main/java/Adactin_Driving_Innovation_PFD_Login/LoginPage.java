package Adactin_Driving_Innovation_PFD_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class LoginPage {

    @FindBy(name="username")
    private WebElement userNameElement;

    @FindBy(name="password")
    private WebElement passwordElement;

    @FindBy(name="login")
    private WebElement loginButtonElement;

    public LoginPage setUserName(String userName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("username"),
                Duration.ofSeconds(5));
        userNameElement.sendKeys(userName);
        return this;
    }

    public LoginPage setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("password"),
                Duration.ofSeconds(5));
        passwordElement.sendKeys(password);
        return this;
    }

    public CreationPage search(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("login"),
                Duration.ofSeconds(5));
        loginButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                CreationPage.class);
    }

}
