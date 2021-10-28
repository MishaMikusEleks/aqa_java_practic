package practice.selenium.insta.page_factory.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import practice.selenium.parallel_run.BrowserFactory;

public class HomePO {

    @FindBy(xpath = "//*[@name='username']")
    private WebElement userLogo;

    public HomePO() {
        PageFactory.initElements(BrowserFactory.getDriver(),this);
    }

    public boolean isOpen() {
        //return userLogo.isDisplayed();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return BrowserFactory.getDriver().getCurrentUrl()
                .equals("https://www.instagram.com/accounts/onetap/?next=%2F");
    }
}
