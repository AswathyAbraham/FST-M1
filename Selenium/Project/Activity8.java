import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.Random;

public class Activity8 extends BaseClass{
    @Test
    public void contactAdmin(){
        driver.findElement(By.linkText("Contact")).click();
        Random rnd = new Random();
        String generatedName = RandomStringUtils.randomAlphabetic(7);
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys(generatedName + " " + generatedName);
        String generatedEmail = RandomStringUtils.randomAlphabetic(9);
        String email = generatedEmail + "@gmail.com";
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys(email);
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Project Comments");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Project Comments added for contact test");
        driver.findElement(By.id("wpforms-submit-8")).click();
        String actualmessage = driver.findElement(By.id("wpforms-confirmation-8")).getText();
        String expectedmessage = "Thanks for contacting us! We will be in touch with you shortly.";
        Assert.assertEquals(actualmessage, expectedmessage, "Expected text message not generated");
    }
}
