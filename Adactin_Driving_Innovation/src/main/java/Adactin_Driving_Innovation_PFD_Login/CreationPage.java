package Adactin_Driving_Innovation_PFD_Login;

import Adactin_Driving_Innovation_POM_Login.SelectHotelPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class CreationPage {
    @FindBy(name="location")
    private WebElement locationElement;

    @FindBy(name="hotels")
    private WebElement hotelsElement;

    @FindBy(name="room_type")
    private WebElement roomTypeElement;

    @FindBy(name="room_nos")
    private WebElement noOfRoomsElement;

    @FindBy(name="datepick_in")
    private WebElement checkInDateElement;

    @FindBy(name="datepick_out")
    private WebElement checkOutDateElement;

    @FindBy(name="adult_room")
    private WebElement adultsRoomElement;

    @FindBy(name="child_room")
    private WebElement childrenRoomElement;

    @FindBy(name="Submit")
    private WebElement searchButtonElement;

    public CreationPage selectLocation(String location){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("location"),
                Duration.ofSeconds(5));
        locationElement.sendKeys(location);
        return this;
    }

    public CreationPage selectHotels(String hotels){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("hotels"),
                Duration.ofSeconds(5));
        hotelsElement.sendKeys(hotels);
        return this;
    }

    public CreationPage selectRoomType(String roomType){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("room_type"),
                Duration.ofSeconds(5));
        roomTypeElement.sendKeys(roomType);
        return this;
    }

    public CreationPage selectNoOfRooms(String noOfRooms){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("room_nos"),
                Duration.ofSeconds(5));
        noOfRoomsElement.sendKeys(noOfRooms);
        return this;
    }

    public CreationPage setCheckInDate(String checkInDate){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("datepick_in"),
                Duration.ofSeconds(5));
        checkInDateElement.sendKeys(checkInDate);
        return this;
    }

    public CreationPage setCheckOutDate(String checkOutDate){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("datepick_out"),
                Duration.ofSeconds(5));
        checkOutDateElement.sendKeys(checkOutDate);
        return this;
    }

    public CreationPage selectAdultsRoom(String adultsRoom){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("adult_room"),
                Duration.ofSeconds(5));
        adultsRoomElement.sendKeys(adultsRoom);
        return this;
    }

    public CreationPage selectChildrenRoom(String childrenRoom){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("child_room"),
                Duration.ofSeconds(5));
        childrenRoomElement.sendKeys(childrenRoom);
        return this;
    }

    public SelectHotelPage search(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("Submit"),
                Duration.ofSeconds(5));
        searchButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                SelectHotelPage.class);
    }

}
