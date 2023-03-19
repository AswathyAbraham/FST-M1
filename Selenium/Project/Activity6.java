import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 extends BaseClass{
    @Test
    @Parameters({"UserName","Password"})
    public void loginLMS(String UserName,String Password){
        driver.findElement(By.linkText("My Account")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals("My Account – Alchemy LMS", pageTitle, "Page Title not matching with expected title");

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_login")).sendKeys(UserName);
        driver.findElement(By.id("user_pass")).sendKeys(Password);
        driver.findElement(By.id("wp-submit")).submit();

        boolean profileFlag = driver.findElement(By.xpath("//a[text()='Howdy, ']")).isDisplayed();

        Assert.assertTrue(profileFlag, "User is not logged in to LMS page");
    }

}
