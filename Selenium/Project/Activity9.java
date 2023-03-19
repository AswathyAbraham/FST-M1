import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 extends BaseClass{
    @Test
    @Parameters({"UserName","Password"})
    public void simpleLesson(String UserName,String Password){
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_login")).sendKeys(UserName);
        driver.findElement(By.id("user_pass")).sendKeys(Password);
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.linkText("All Courses")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();
        String expectedtitle = "Developing Strategy – Alchemy LMS";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Expected title not captured");
    }
}
