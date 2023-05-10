package Adactin_Driving_Innovation_PFD_Login;

import Adactin_Driving_Innovation_POM_Login.BookHotelPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class SelectHotelPage {

    @FindBy(name="radiobutton_0")
    private WebElement selectHotelElement;

    @FindBy(name="continue")
    private WebElement continueButtonElement;

    public SelectHotelPage selectHotel(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("radiobutton_0"),
                Duration.ofSeconds(10));
        selectHotelElement.click();
        return this;
    }

    public BookHotelPage continueButton(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("continue"),
                Duration.ofSeconds(10));
        continueButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                BookHotelPage.class);
    }

}
