import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends LoginPage {


    @Test(description = "Başarılı login kontrolü ardından logout")
    public void LoginSuccessful(){
        homePage.getSignInButton().click();
        loginPage.fillUserName("testabc")
                .fillPassword("123654")
                .clickLoginButton();

        //WebElement signOutLink = driver.findElement(By.linkText("Sign Out"));
        //Assert.assertEquals(signOutLink.getText(), "Sign Out");
        //signOutLink.click();

        assertEqualsText(homePage.getSignOutButton().getText(), "Sign Out");
        homePage.clickSignOutButton();
    }


    @Test(description = "Başarısız kullanıcı giriş kontrolü")
    public void LoginUnSuccessful(){
        homePage.getSignInButton().click();

        loginPage.fillUserName(userName)
                .fillPassword(userPassword+"fail")
                .clickLoginButton();

        String expected = "Invalid username or password. Signon failed.";
        assertEqualsText(loginPage.getLoginErrorMessage(), expected);
    }



    @Test(description = "Zorunlu karakter kontrolü")
    public void LoginFailWithoutMandatoryCharacter(){
        homePage.getSignInButton().click();

        loginPage.fillUserName(userName).fillPassword("")
                .clickLoginButton();

        Assert.assertEquals(homePage.getSignInButton().getText(), "Sign In");
        Assert.assertEquals(homePage.getCurrentUrl(), loginPage.LoginPageUrl);

        loginPage.fillUserName("").fillPassword(userPassword)
                .clickLoginButton();

        assertEqualsText(homePage.getSignInButton().getText(), "Sign In");
        assertEqualsText(homePage.getCurrentUrl(), homePage.LoginPageUrl);

    }



}
