package ui.insta;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import practice.PropertyUtil;
import practice.selenium.insta.bo.LoginBO;
import practice.test_helper.BaseTest;
import practice.test_helper.listener.CustomAllureListener;


@Listeners({
        CustomAllureListener.class
})
public class LoginInstaTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
                String pass= (String) new PropertyUtil().getProperty("pass");;

        Assert.assertTrue(loginBO.login(login,pass));
    }



}
