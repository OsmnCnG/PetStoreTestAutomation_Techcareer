import Pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCartTests extends ShoppingCartPage {



    @Test(description = "Tüm ürünlerin sepete başarılı bir şekilde eklenme kontrolü")
    public void AddToCartSuccessful(){

        for (int i = 0; i < categoryPage.categories.length; i++) {
            homePage.getSelectCategoryButton(categories[i]).click();
            List<WebElement> productLinks = driver.findElements(By.cssSelector("[href*='productId']"));
            for (int j = 0; j < productLinks.size(); j++) {
                productLinks.get(j).click();
                addToCartButton().click();
                screenshot();
                navigateGoBack();
                navigateGoBack();
            }
            categoryPage.getCurrentUrl().contains(categories[i]);
        }
    }

}
