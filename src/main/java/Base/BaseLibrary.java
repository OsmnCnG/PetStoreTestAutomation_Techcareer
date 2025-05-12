package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

public class BaseLibrary extends Data{

    public static WebDriver driver;

    public int randomNumber(int length){
        Random rand = new Random();
        return rand.nextInt(length);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void wait(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateGoBack(){
        driver.navigate().back();
    }

    public void assertEqualsText(String actual, String expected){
        Assert.assertEquals(actual, expected);
        screenshot();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
