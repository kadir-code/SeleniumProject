package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

//Webdriver için bir base class oluşturuldu
public class HomePageObjects extends BasePageObjects{

    public HomePageObjects(WebDriver driver){
        this.driver=driver;
    }

    //browserde elementleri id ile yakaladım
    By email_textbox= By.id("email");
    By email_enter_button=By.id("enterimg");

    //yakalanan idleri bilinen elementler metotlarla işleniyor
    public void setTextToEmailTextbox(String text){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(email_textbox).sendKeys(text);
    }

    public void clickEnterButton(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(email_enter_button).click();
    }
}
