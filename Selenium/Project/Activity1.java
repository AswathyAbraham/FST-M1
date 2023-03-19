    import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 extends BaseClass {
    @Test
    public void getTitle(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Alchemy LMS – An LMS Application", pageTitle, "Page Title doesn't match with expected:Alchemy LMS – An LMS Application");
    }

}
