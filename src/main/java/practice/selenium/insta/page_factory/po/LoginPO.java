package practice.selenium.insta.page_factory.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import practice.selenium.decorator.ButtonElement;
import practice.selenium.decorator.CustomDecorator;
import practice.selenium.decorator.InputElement;
import practice.selenium.parallel_run.BrowserFactory;


public class LoginPO extends BasicPO{

    @FindBy(xpath = "//*[@name='username']")
    private InputElement loginInput;

    @FindBy(xpath = "//*[@name='password']")
    private InputElement passInput;

    @FindBy(xpath = "//*[@type='submit']")
    private ButtonElement submitButton;


@Override
    public boolean isOpen() {
        return loginInput.waitForMeVisible(5000);
    }

    public LoginPO inputLogin(String login) {
        loginInput.sendKeys(login);
        return this;
    }

    public LoginPO inputPassword(String pass) {
        passInput.sendKeys(pass);
       return this;
    }

    public HomePO submit() {
        submitButton.click();
        return new HomePO();
    }

    public LoginPO goToLoginPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/");
        return this;
    }
}
