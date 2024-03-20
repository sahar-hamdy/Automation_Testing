package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import  org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage{
    WebDriver driver;
    // variables
    String levelSetURL="https://www.levelset.com/?_ga=2.169081697.1753866971.1710938337-2127584788.1710677423";
    // locator
    By getPaid = By.xpath("//*[@id='header']/div/div/div[2]/nav/ul/li[8]/a");

    public HomePage(WebDriver driver){
     this.driver =driver;
    }
    public void loadPage (){
        driver = new ChromeDriver();
        driver.get(levelSetURL);

         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(getPaid));
    }
    public DocumentPage clickOnGetPaid(){
        WebElement getPaidButton =driver.findElement(getPaid);
        getPaidButton.click();
        getPaidButton.click();
        return new DocumentPage(driver);
    }
}