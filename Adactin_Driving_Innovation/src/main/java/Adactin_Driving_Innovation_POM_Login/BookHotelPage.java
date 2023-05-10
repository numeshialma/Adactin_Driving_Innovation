package Adactin_Driving_Innovation_POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class BookHotelPage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property= new PropertyFileReader();
    String firstNameElement = property.getProperty("BookHotelPage","first.name.element");
    String lastNameElement = property.getProperty("BookHotelPage","last.name.element");
    String addressElement = property.getProperty("BookHotelPage","address.element");
    String cardNumberElement = property.getProperty("BookHotelPage","card.number.element");
    String cardTypeElement = property.getProperty("BookHotelPage","card.type.element");
    String monthElement = property.getProperty("BookHotelPage","month.element");
    String yearElement = property.getProperty("BookHotelPage","year.element");
    String cvvElement = property.getProperty("BookHotelPage","cvv.element");
    String bookButtonElement = property.getProperty("BookHotelPage","book.button.element");



    public BookHotelPage setFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(firstNameElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(firstNameElement)).sendKeys(firstName);
        return this;
    }

    public BookHotelPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(lastNameElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }

    public BookHotelPage setAddress(String address){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(addressElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(addressElement)).sendKeys(address);
        return this;
    }

    public BookHotelPage setCardNumber(String cardNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(cardNumberElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(cardNumberElement)).sendKeys(cardNumber);
        return this;
    }

    public BookHotelPage selectCardType(String cardType){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(cardTypeElement),
                Duration.ofSeconds(5));
        Select dropdownCardType = new Select(driver.findElement(By.name(cardTypeElement)));
        dropdownCardType.selectByVisibleText(cardType);
        return this;
    }

    public BookHotelPage selectMonth(String month){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(monthElement),
                Duration.ofSeconds(5));
        Select dropdownMonth = new Select(driver.findElement(By.name(monthElement)));
        dropdownMonth.selectByVisibleText(month);
        return this;
    }

    public BookHotelPage selectYear(String year){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(yearElement),
                Duration.ofSeconds(5));
        Select dropdownYear = new Select(driver.findElement(By.name(yearElement)));
        dropdownYear.selectByVisibleText(year);
        return this;
    }

    public BookHotelPage setCvv(String cvv){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(cvvElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(cvvElement)).sendKeys(cvv);
        return this;
    }

    public SuccessPage bookButton(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(bookButtonElement),
                Duration.ofSeconds(10));
        driver.findElement(By.name(bookButtonElement)).click();
        return new SuccessPage();
    }

}
