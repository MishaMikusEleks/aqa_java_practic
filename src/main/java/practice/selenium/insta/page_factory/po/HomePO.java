package practice.selenium.insta.page_factory.po;

import org.openqa.selenium.support.FindBy;
import practice.selenium.decorator.ButtonElement;

public class HomePO extends BasicPO{

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ButtonElement userLogo;

        @Override
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }
}
