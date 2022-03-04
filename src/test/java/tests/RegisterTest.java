package tests;

import org.testng.annotations.Test;
import pages.RegisterPageObjects;

public class RegisterTest extends BaseTest{

    @Test
    public void simpleRegisterTest(){

        RegisterPageObjects registerPageObjects=new RegisterPageObjects(driver);
        registerPageObjects.setTextToFirstNameTextbox("Kadir");
        registerPageObjects.setTextToFirstNameTextbox("Erat");

    }
}
//test sayfaları arasında geçiş yapılamadığı için tüm metotlar hometest clasında devam etirildi