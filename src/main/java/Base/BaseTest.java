package Base;

import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{

    public static RegisterPage registerPage = new RegisterPage();
    public static LoginPage loginPage = new LoginPage();
    public static HomePage homePage = new HomePage();
    public static ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    public static CategoryPage categoryPage = new CategoryPage();

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void afterBrowser(){
        driver.quit();
    }

}
