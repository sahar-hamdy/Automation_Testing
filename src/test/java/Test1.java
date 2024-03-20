import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    HomePage homePage;
    WebDriver driver;
   @BeforeClass
    public void setUP(){
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
    }
    @Test
    public void checkPriceExist() {
        homePage.loadPage();
        DocumentPage getPaidPage= homePage.clickOnGetPaid();
        Assert.assertTrue(getPaidPage.getPrice().contains("$449"));
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
