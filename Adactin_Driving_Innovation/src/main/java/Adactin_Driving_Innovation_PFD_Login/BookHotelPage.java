package Adactin_Driving_Innovation_PFD_Login;

import Adactin_Driving_Innovation_POM_Login.SuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;
public class BookHotelPage {

    @FindBy(name="first_name")
    private WebElement firstNameElement;

    @FindBy(name="last_name")
    private WebElement lastNameElement;

    @FindBy(name="address")
    private WebElement addressElement;

    @FindBy(name="cc_num")
    private WebElement cardNumberElement;

    @FindBy(name="cc_type")
    private WebElement cardTypeElement;

    @FindBy(name="cc_exp_month")
    private WebElement monthElement;

    @FindBy(name="cc_exp_year")
    private WebElement yearElement;

    @FindBy(name="cc_cvv")
    private WebElement cvvElement;

    @FindBy(name="book_now")
    private WebElement bookButtonElement;

    public BookHotelPage setFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("first_name"),
                Duration.ofSeconds(10));
        firstNameElement.sendKeys(firstName);
        return this;
    }

    public BookHotelPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("last_name"),
                Duration.ofSeconds(10));
        lastNameElement.sendKeys(lastName);
        return this;
    }

    public BookHotelPage setAddress(String address){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("address"),
                Duration.ofSeconds(10));
        addressElement.sendKeys(address);
        return this;
    }

    public BookHotelPage setCardNumber(String cardNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("cc_num"),
                Duration.ofSeconds(10));
        cardNumberElement.sendKeys(cardNumber);
        return this;
    }

    public BookHotelPage selectCardType(String cardType){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("cc_type"),
                Duration.ofSeconds(5));
        cardTypeElement.sendKeys(cardType);
        return this;
    }

    public BookHotelPage selectMonth(String month){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("cc_exp_month"),
                Duration.ofSeconds(5));
        monthElement.sendKeys(month);
        return this;
    }

    public BookHotelPage selectYear(String year){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("cc_exp_year"),
                Duration.ofSeconds(5));
        yearElement.sendKeys(year);
        return this;
    }

    public BookHotelPage setCvv(String cvv){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("cc_cvv"),
                Duration.ofSeconds(10));
        cvvElement.sendKeys(cvv);
        return this;
    }

    public SuccessPage bookButton(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("book_now"),
                Duration.ofSeconds(10));
        bookButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                SuccessPage.class);
    }
}
