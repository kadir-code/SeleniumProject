package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageObjects;
import pages.RegisterPageObjects;

public class HomeTest extends BaseTest{

    @Test
    public void simpleHomeTests(){

        HomePageObjects homePageObjects=new HomePageObjects(driver);
        RegisterPageObjects registerPageObjects=new RegisterPageObjects(driver);

        //landing pahe elementleri
        homePageObjects.setTextToEmailTextbox("testmail@gmail.com");
        homePageObjects.clickEnterButton();

        //register sayfa elementleri
        registerPageObjects.setTextToFirstNameTextbox("Kadir");
        registerPageObjects.setTextToLastNameTextbox("Erat");


    }


}
