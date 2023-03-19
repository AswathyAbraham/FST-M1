import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 extends BaseClass{
    @Test
    public void LMSLogin() {
        driver.findElement(By.linkText("My Account")).click();

        boolean myAccountFlag = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).isDisplayed();
        String pageTitle = driver.getTitle();
        boolean pageFlag = pageTitle.contains("My Account");

        Assert.assertTrue(pageFlag, "User is not navigated to My Account page");
        Assert.assertTrue(myAccountFlag, "User is not navigated to My Account page");

    }

}
