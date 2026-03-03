package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidDetails() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.id("login-email")));

        loginPage.enterEmailAddress("melomazibuko8@gmail.com");
        loginPage.enterPassword("Mwelase@1031");
        loginPage.clickSubmitButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//*[@id=\"app-main-content\"]/section")));

        loginPage.verifyLoginSuccess();

    }
}
