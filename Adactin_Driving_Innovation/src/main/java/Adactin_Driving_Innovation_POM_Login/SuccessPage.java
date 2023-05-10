package Adactin_Driving_Innovation_POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class SuccessPage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property= new PropertyFileReader();
    String messageElement = property.getProperty("SuccessPage","message.element");


    public SuccessPage getSalutationMessage(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(messageElement),
                Duration.ofSeconds(10));
        driver.findElement(By.xpath(messageElement)).getText();
        return this;

    }
}
