import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity3 extends BaseClass{
    @Test
    public void getFirstInfo() {
        String firstInfoText = driver.findElement(By.xpath("(//section[contains(@id,'uagb-column')]//h3[contains(@class,'title')])[1]")).getText();
        Assert.assertEquals("Actionable Training", firstInfoText, "Title of first info box doesn't match with expected:Actionable Training");
    }

}
