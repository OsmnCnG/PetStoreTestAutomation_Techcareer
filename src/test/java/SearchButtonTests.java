import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchButtonTests extends SearchPage {

    @Test(description = "Başarılı ürün search kontrolü")
    public void searchSuccessful(){
        String searchTerm = "dog";

        searchInput().sendKeys(searchTerm);
        searchClickButton().click();
        screenshot();

        List<WebElement> productRows = driver.findElements(By.cssSelector("table"));

        boolean isMatch = false;

        for (WebElement row : productRows) {
            List<WebElement> tdElements = row.findElements(By.tagName("td"));

            for (WebElement td : tdElements) {
                if (td.getText().toLowerCase().contains(searchTerm.toLowerCase())){
                    isMatch = true;
                    break;
                }
            }
            Assert.assertTrue(isMatch);
            screenshot();
        }



    }

}
