package Adactin_Driving_Innovation_POM_Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class LoginTest {

    LoginPage loginPage;
    CreationPage creationPage;
    SelectHotelPage selectHotelPage;
    BookHotelPage bookHotelPage;
    SuccessPage successPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();

        loginPage= new LoginPage();
        creationPage=loginPage.loginSuccess("NumeshiAlmaPiyasiri","numeshi123");

    }

    @Test
    public void testCreation() {
        selectHotelPage=creationPage
                .selectLocation("London")
                .selectHotels("Hotel Creek")
                .selectRoomType("Double")
                .selectNoOfRooms("4 - Four")
                .setCheckInDate("04/11/2022")
                .setCheckOutDate("05/11/2022")
                .selectAdultsRoom("3 - Three")
                .selectChildrenRoom("3 - Three")
                .search();

        bookHotelPage=selectHotelPage.selectHotel()
                .continueButton();

        successPage=bookHotelPage
                .setFirstName("Numeshi")
                .setLastName("Piyasiri")
                .setAddress("Main Rd,Big City")
                .setCardNumber("1234567891234567")
                .selectCardType("VISA")
                .selectMonth("April")
                .selectYear("2021")
                .setCvv("123")
                .bookButton();

//        Assert.assertEquals(
//                "Welcome to Adactin Group of Hotels",
//                "Welcome to Adactin Group of Hotels");

//        Assert.assertEquals(successPage.getSalutationMessage(),
//                "Welcome to Adactin Group of Hotels",
//                "Failed to book a hotel");


    }

    @AfterMethod
    public void tearDown() {
        //TestApp.getInstance().closeBrowser();
    }
}
