package practice.selenium.insta.page_factory.po;

import com.mysql.cj.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.selenium.parallel_run.BrowserFactory;

import java.time.Duration;

public class LoginPO {

    @FindBy(xpath = "//*[@name='username']")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement passInput;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submitButton;

    public LoginPO() {
        PageFactory.initElements(BrowserFactory.getDriver(),this);
    }

    public LoginPO inputLogin(String login) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
