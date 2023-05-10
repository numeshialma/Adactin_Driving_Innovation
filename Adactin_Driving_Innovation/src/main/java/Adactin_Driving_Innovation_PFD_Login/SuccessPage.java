package Adactin_Driving_Innovation_PFD_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

import java.time.Duration;

public class SuccessPage {
    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    private WebElement salutationMessageElement;

    public String getSalutationMessage(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),'Welcome')]"),
                Duration.ofSeconds(10));

        return salutationMessageElement.getText();
    }
    //"Welcome to Adactin Group of Hotels"
}
