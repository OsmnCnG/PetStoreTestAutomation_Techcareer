package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BaseTest {

    @Step("username bölümü doldurulur")
    public RegisterPage fillUserName(String username){
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        return this;
    }

    @Step("password bölümü doldurulur")
    public RegisterPage fillPassword(String password){
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }
    @Step("repeatedPassword bölümü doldurulur")
    public RegisterPage fillRepeatedPassword(String password){
        driver.findElement(By.name("repeatedPassword")).clear();
        driver.findElement(By.name("repeatedPassword")).sendKeys(password);
        return this;
    }
    @Step("firstName bölümü doldurulur")
    public RegisterPage fillFirstName(String firstName){
        driver.findElement(By.name("account.firstName")).clear();
        driver.findElement(By.name("account.firstName")).sendKeys(firstName);
        return this;
    }
    @Step("lastName bölümü doldurulur")
    public RegisterPage fillLastName(String lastName){
        driver.findElement(By.name("account.lastName")).clear();
        driver.findElement(By.name("account.lastName")).sendKeys(lastName);
        return this;
    }
    @Step("email bölümü doldurulur")
    public RegisterPage fillEmail(String email){
        driver.findElement(By.name("account.email")).clear();
        driver.findElement(By.name("account.email")).sendKeys(email);
        return this;
    }
    @Step("phone bölümü doldurulur")
    public RegisterPage fillPhone(String phone){
        driver.findElement(By.name("account.phone")).clear();
        driver.findElement(By.name("account.phone")).sendKeys(phone);
        return this;
    }
    @Step("address1 bölümü doldurulur")
    public RegisterPage fillAddress1(String address1){
        driver.findElement(By.name("account.address1")).clear();
        driver.findElement(By.name("account.address1")).sendKeys(address1);
        return this;
    }
    @Step("address2 bölümü doldurulur")
    public RegisterPage fillAddress2(String address2){
        driver.findElement(By.name("account.address2")).clear();
        driver.findElement(By.name("account.address2")).sendKeys(address2);
        return this;
    }
    @Step("city bölümü doldurulur")
    public RegisterPage fillCity(String city){
        driver.findElement(By.name("account.city")).clear();
        driver.findElement(By.name("account.city")).sendKeys(city);
        return this;
    }
    @Step("State bölümü doldurulur")
    public RegisterPage fillState(String state){
        driver.findElement(By.name("account.state")).clear();
        driver.findElement(By.name("account.state")).sendKeys(state);
        return this;
    }
    @Step("Zip bölümü doldurulur")
    public RegisterPage fillZip(String zip){
        driver.findElement(By.name("account.zip")).clear();
        driver.findElement(By.name("account.zip")).sendKeys(zip);
        return this;
    }
    @Step("Country bölümü doldurulur")
    public RegisterPage fillCountry(String country){
        driver.findElement(By.name("account.country")).clear();
        driver.findElement(By.name("account.country")).sendKeys(country);
        return this;
    }
    @Step("Kayıt ol formu gönderilir")
    public WebElement registerSubmitButton(){
        screenshot();
        return driver.findElement(By.name("newAccount"));
    }
}
