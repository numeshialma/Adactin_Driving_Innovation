package Adactin_Driving_Innovation_POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class LoginPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property= new PropertyFileReader();

    String userNameElement= property.getProperty("LoginPage","user.name.element");
    String passwordElement=property.getProperty("LoginPage","password.element");
    String loginButtonElement= property.getProperty("LoginPage","login.button.element");

    public CreationPage loginSuccess(String userName, String password){
        loginAs(userName,password);
        return new CreationPage();
    }

    public CreationPage loginUnSuccess(String userName, String password){
        loginAs(userName,password);
        return new CreationPage();
    }

    private void loginAs(String userName,String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(userNameElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(userNameElement)).sendKeys(userName);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        driver.findElement(By.id(loginButtonElement)).click();
    }
}
