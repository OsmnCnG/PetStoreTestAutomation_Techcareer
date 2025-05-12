package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {

    @Step("Çıkış yap butonu")
    public WebElement getSignOutButton() {
        return driver.findElement(By.cssSelector("[href*='signoff']"));
    }

    @Step("Çıkış yap butonuna tıklanır")
    public HomePage clickSignOutButton() {
        driver.findElement(By.cssSelector("[href*='signoff']")).click();
        return this;
    }

    @Step("Giriş yap sayfasına ait butona tıklanır")
    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector("[href*='signon']"));
    }

    @Step("Seçilen kategoriye gidilir")
    public WebElement getSelectCategoryButton(String categoryName){
        return driver.findElement(By.cssSelector("[href*='"+categoryName.toUpperCase()+"']"));
    }

    /*
    public HomePage goToLoginPage(){
        driver.findElement(By.cssSelector("[href*='signonForm']")).click();
        return this;
    }

     */

}
