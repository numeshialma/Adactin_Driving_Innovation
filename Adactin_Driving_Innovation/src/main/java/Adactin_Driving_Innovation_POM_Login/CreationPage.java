package Adactin_Driving_Innovation_POM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class CreationPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property= new PropertyFileReader();

    String locationElement = property.getProperty("CreationPage","location.element");
    String hotelsElement = property.getProperty("CreationPage","hotels.element");
    String roomTypeElement = property.getProperty("CreationPage","room.type.element");
    String noOfRoomsElement = property.getProperty("CreationPage","noOf.rooms.element");
    String checkInDateElement = property.getProperty("CreationPage","in.date.element");
    String checkOutDateElement = property.getProperty("CreationPage","out.date.element");
    String adultsRoomElement = property.getProperty("CreationPage","adults.room.element");
    String childrenRoomElement = property.getProperty("CreationPage","children.room.element");
    String searchButtonElement = property.getProperty("CreationPage","search.button.element");

    public CreationPage selectLocation(String location){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(locationElement),
                Duration.ofSeconds(5));
        Select dropDownLocation = new Select(driver.findElement(By.name(locationElement)));
        dropDownLocation.selectByVisibleText(location);
        return this;
    }

    public CreationPage selectHotels(String hotels){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(hotelsElement),
                Duration.ofSeconds(5));
        Select dropdownHotels = new Select(driver.findElement(By.name(hotelsElement)));
        dropdownHotels.selectByVisibleText(hotels);
        return this;
    }

    public CreationPage selectRoomType(String roomType){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(roomTypeElement),
                Duration.ofSeconds(5));
        Select dropDownRoomType = new Select(driver.findElement(By.name(roomTypeElement)));
        dropDownRoomType.selectByVisibleText(roomType);
        return this;
    }

    public CreationPage selectNoOfRooms(String noOfRooms){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(noOfRoomsElement),
                Duration.ofSeconds(5));
        Select dropdownNoOfRooms = new Select(driver.findElement(By.name(noOfRoomsElement)));
        dropdownNoOfRooms.selectByVisibleText(noOfRooms);
        return this;
    }

    public CreationPage setCheckInDate(String checkInDate){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(checkInDateElement),
                Duration.ofSeconds(5));
        driver.findElement(By.name(checkInDateElement)).sendKeys(checkInDate);
        return this;
    }

    public CreationPage setCheckOutDate(String checkOutDate){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(checkOutDateElement),
                Duration.ofSeconds(5));
        driver.findElement(By.name(checkOutDateElement)).sendKeys(checkOutDate);
        return this;
    }

    public CreationPage selectAdultsRoom(String adultsRoom){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(adultsRoomElement),
                Duration.ofSeconds(5));
        Select dropDownAdultsRoom = new Select(driver.findElement(By.name(adultsRoomElement)));
        dropDownAdultsRoom.selectByVisibleText(adultsRoom);
        return this;
    }

    public CreationPage selectChildrenRoom(String childrenRoom){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(childrenRoomElement),
                Duration.ofSeconds(5));
        Select dropDownChildrenRoom = new Select(driver.findElement(By.name(childrenRoomElement)));
        dropDownChildrenRoom.selectByVisibleText(childrenRoom);
        return this;
    }

    public SelectHotelPage search(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(searchButtonElement),
                Duration.ofSeconds(5));
        driver.findElement(By.name(searchButtonElement)).click();
        return new SelectHotelPage();
    }
}
