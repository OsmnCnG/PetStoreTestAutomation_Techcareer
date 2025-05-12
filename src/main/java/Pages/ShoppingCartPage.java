package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BaseTest {

    @Step("Karta ekle butonuna tıklanır")
    public WebElement addToCartButton(){
        return driver.findElement(By.cssSelector("[href*='addItemToCart']"));
    }


}
