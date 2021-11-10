package insta;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice.PropertyUtil;
import practice.selenium.insta.bo.LoginBO;
import practice.test_helper.BaseTest;


@Test
public class LoginInstaTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
                String pass= (String) new PropertyUtil().getProperty("pass");;

        Assert.assertTrue(loginBO.login(login,pass));
    }

}