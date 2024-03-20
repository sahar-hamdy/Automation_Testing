package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocumentPage {
    WebDriver driver;
    //locator
    By price= By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/div[1]/div[2]/div/div[3]/div[1]");
    public DocumentPage(WebDriver driver){
      this.driver=driver;

    }
    public String getPrice (){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(price));
        String findPrice= driver.findElement(price).getText();
        return findPrice;
    }
}
