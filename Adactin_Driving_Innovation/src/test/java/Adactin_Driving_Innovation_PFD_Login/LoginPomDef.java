package Adactin_Driving_Innovation_PFD_Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TestApp;


public class LoginPomDef {

    LoginPage loginPage;
    CreationPage creationPage;
    SelectHotelPage selectHotelPage;
    BookHotelPage bookHotelPage;
    SuccessPage successPage;

    @Given("User is on Login Page --> Creation Page")
    public void userIsOnLoginPageCreationPage() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        loginPage= PageFactory.initElements
                (TestApp.getInstance().getDriver(), LoginPage.class);

        //creationPage=loginPage.loginSuccess("NumeshiAlmaPiyasiri","numeshi123");

    }


    @Given("User enter user name as {string}")
    public void setUserName(String userName) {
        loginPage.setUserName(userName);
    }

    @And("User enter password as {string}")
    public void setPassword(String password) {
        loginPage.setPassword(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.search();
    }
    @And("User enter location as {string}")
    public void selectLocation(String location) {
        creationPage.selectLocation(location);
    }

    @And("User enter hotels as {string}")
    public void selectHotels(String hotels) {
        creationPage.selectHotels(hotels);
    }

    @And("User enter room type as {string}")
    public void selectRoomType(String roomType) {
        creationPage.selectRoomType(roomType);
    }

    @And("User enter number of rooms as {string}")
    public void selectNumberOfRooms(String numberOfRooms) {
        creationPage.selectNoOfRooms(numberOfRooms);
    }

    @And("User enter check in date as {string}")
    public void setCheckInDate(String checkInDate) {
        creationPage.setCheckInDate(checkInDate);
    }

    @And("User enter check out date as {string}")
    public void setCheckOutDate(String checkOutDate) {
        creationPage.setCheckOutDate(checkOutDate);
    }

    @And("User enter adults per room as {string}")
    public void selectAdultsPerRoom(String adultsPerRoom) {
        creationPage.selectAdultsRoom(adultsPerRoom);
    }

    @And("User enter children per rooms as {string}")
    public void selectChildrenPerRooms(String childrenPerRooms) {
        creationPage.selectChildrenRoom(childrenPerRooms);
    }

    @And("User clicks on search button")
    public void SearchButton() {
        creationPage.search();
    }

    @And("User select hotel")
    public void selectSelectHotel() {
        selectHotelPage.selectHotel();
    }

    @And("User clicks continue button")
    public void ContinueButton() {
        selectHotelPage.continueButton();
    }

    @And("User enter first name as {string}")
    public void setFirstName(String firstName) {
        bookHotelPage.setFirstName(firstName);
    }

    @And("User enter last name as {string}")
    public void setLastName(String lastName) {
        bookHotelPage.setLastName(lastName);
    }

    @And("User enter address as {string}")
    public void setAddress(String address) {
        bookHotelPage.setAddress(address);
    }

    @And("User enter card number as {string}")
    public void setCardNumber(String cardNumber) {
        bookHotelPage.setCardNumber(cardNumber);
    }

    @And("User enter card type as {string}")
    public void selectCardType(String cardType) {
        bookHotelPage.selectCardType(cardType);
    }

    @And("User enter month as {string}")
    public void selectMonth(String month) {
        bookHotelPage.selectMonth(month);
    }

    @And("User enter year as {string}")
    public void selectYear(String year) {
        bookHotelPage.selectYear(year);
    }

    @And("User enter cvv as {string}")
    public void setCvv(String cvv) {
        bookHotelPage.setCvv(cvv);
    }

    @When("User clicks book now button")
    public void BookButton() {
        bookHotelPage.bookButton();
    }

    @Then("Salutation message will display as {string}")
    public void verifySalutationMessage(String expectedMessage ) {
        Assert.assertEquals(successPage.getSalutationMessage(),
                expectedMessage,
                "Failed to book a hotel ");
    }


}
