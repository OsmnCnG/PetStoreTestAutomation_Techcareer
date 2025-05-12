import Pages.CategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class CategoryTests extends CategoryPage {


    @Test(description = "Seçilen kategoriye ait sayfaya gitme kontrolü")
    public void GoToCategorySuccessful(){

        for (int i = 0; i < categoryPage.categories.length; i++) {
            homePage.getSelectCategoryButton(categories[i]).click();
            screenshot();
            categoryPage.getCurrentUrl().contains(categories[i]);
        }
    }

    @Test(description = "Kategori sayfasında ürün detaylarına gitme kontrolü")
    public void GoToCategoryDetailSuccessful(){

        for (int i = 0; i < categoryPage.categories.length; i++) {
            homePage.getSelectCategoryButton(categories[i]).click();
            List<WebElement> productLinks = driver.findElements(By.cssSelector("[href*='productId']"));
            for (int j = 0; j < productLinks.size(); j++) {
                productLinks.get(j).click();
                navigateGoBack();
            }
            categoryPage.getCurrentUrl().contains(categories[i]);
        }
    }
}
