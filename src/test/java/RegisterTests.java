import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends RegisterPage {


    @Test(description = "Başarılı kullanıcı kayıt kontrolü")
    public void RegisterSuccessful(){
        homePage.getSignInButton().click();
        loginPage.clickRegisterButton();
        registerPage.fillUserName("osmancan"+randomNumber(10000))
                .fillPassword("123654")
                .fillRepeatedPassword("123654")
                .fillFirstName("osmancan")
                .fillLastName("gonen")
                .fillEmail("test@hotmail.com")
                .fillPhone("test")
                .fillAddress1("test")
                .fillAddress2("test")
                .fillCity("testcity")
                .fillState("teststate")
                .fillZip("testzip")
                .fillCountry("testcountry")
                .registerSubmitButton().click();

        assertEqualsText(registerPage.getCurrentUrl(), homePageUrl);
    }
}
