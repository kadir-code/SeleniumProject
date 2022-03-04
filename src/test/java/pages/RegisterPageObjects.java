package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPageObjects extends BasePageObjects{

    public RegisterPageObjects(WebDriver driver){
        this.driver=driver;
    }

    By refresh_button_id=By.id("Button1");
    String actualPageName;

    //Assertionu gelen ssayfa Register mi diye yapmak için xpath kullandım ve textini döndürdüm
    public String getActualPage(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actualPageName=driver.findElement(By.xpath("/html/body/section/div/h2")).getText();
        return actualPageName;
    }

    public void setTextToFirstNameTextbox(String string){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys(string);
    }
    public void setTextToLastNameTextbox(String string){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys(string);
    }

    public void clickRefreshButton(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(refresh_button_id).click();
    }

}
