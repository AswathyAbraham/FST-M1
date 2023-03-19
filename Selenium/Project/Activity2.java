import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity2 extends BaseClass {
    @Test
    public void getHeading(){
        String headerText = driver.findElement(By.xpath("//h1[contains(@class,'title')]")).getText();
        Assert.assertEquals("Learn from Industry Experts", headerText, "Website Heading doesn't match with expected:Learn from Industry Experts");
    }
}
