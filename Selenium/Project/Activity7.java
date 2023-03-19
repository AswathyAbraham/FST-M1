import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity7 extends BaseClass{
    @Test
    public void allCourses() {
        driver.findElement(By.linkText("All Courses")).click();

        boolean allCoursesFlag = driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).isDisplayed();
        Assert.assertTrue(allCoursesFlag, "User is not navigated to All Courses page");

        List<WebElement> allCourses = driver.findElements(By.xpath("//h1[contains(text(),'All Courses')]//following::h3"));
        System.out.println("Number of courses:" + allCourses.size());
        for (WebElement allCourse:allCourses) {
            String courseName = allCourse.getText();
            System.out.println(courseName);
        }
    }

}
