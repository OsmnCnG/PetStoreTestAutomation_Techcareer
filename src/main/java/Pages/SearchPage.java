package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BaseTest {

    @Step("Arama butonuna tıklanır")
    public WebElement searchClickButton(){
        return driver.findElement(By.name("searchProducts"));
    }

    @Step("Input kısmına tıklanır")
    public WebElement searchInput(){
        return driver.findElement(By.name("keyword"));
    }
}
