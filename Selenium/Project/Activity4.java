import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity4 extends BaseClass{

    @Test
    public void getSecondPopular() {
        String secondPopularText = driver.findElement(By.xpath("(//h2[text()=' Our Most Popular Courses ']//following::h3[@class='entry-title'])[2]")).getText();
        Assert.assertEquals("Email Marketing Strategies", secondPopularText, "Second Popular Course doesn't match with expected:Email Marketing Strategies");

    }

}
