package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement loginEmailField;

    @FindBy(id = "login-password")
    WebElement loginPasswordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section")
    WebElement dashboardElement;

    public void clickLoginButton(){
        loginButton.click();
    }

    public void enterEmailAddress(String email) {
        loginEmailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPasswordField.sendKeys(password);
    }

    public void clickSubmitButton(){
        loginSubmitButton.click();
    }

    public void verifyLoginSuccess() {
        if(!dashboardElement.isDisplayed()) {
            throw new AssertionError ("Login failed - Dashboard not visible!");
        }
    }

}





