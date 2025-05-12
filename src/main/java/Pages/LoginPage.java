package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {


    @Step("username alanı doldurulur")
    public LoginPage fillUserName(String username){
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        return this;
    }

    @Step("password alanı doldurulur")
    public LoginPage fillPassword(String password){
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Giriş yap butonuna tıklanır")
    public LoginPage clickLoginButton(){
        driver.findElement(By.name("signon")).click();
        return this;
    }

    @Step("Error mesajı alınır")
    public String getLoginErrorMessage(){
        String actualLoginError = driver.findElement(By.cssSelector("[class='messages']")).getText();
        screenshot();
        return actualLoginError;
    }

    @Step("Kayıt ol butonuna tıklanır")
    public LoginPage clickRegisterButton(){
        driver.findElement(By.cssSelector("[href*='newAccountForm']")).click();
        return this;
    }


}
