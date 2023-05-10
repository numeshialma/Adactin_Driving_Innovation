package Adactin_Driving_Innovation_POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class SelectHotelPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property= new PropertyFileReader();
    String selectHotelElement = property.getProperty("SelectHotelPage","select.hotel.element");
    String continueButtonElement = property.getProperty("SelectHotelPage","continue.button.element");

    public SelectHotelPage selectHotel(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(selectHotelElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(selectHotelElement)).click();
        return this;
    }

    public BookHotelPage continueButton(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(continueButtonElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(continueButtonElement)).click();
        return new BookHotelPage();
    }

}
