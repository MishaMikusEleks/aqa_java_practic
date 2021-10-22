package insta;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice.PropertyUtil;
import practice.selenium.insta.bo.LoginBO;

public class LoginInstaTC {

    @Test
    public void loginTest() {
        LoginBO loginBO = new LoginBO();
        String login= (String) new PropertyUtil().getProperty("login");
                String pass= (String) new PropertyUtil().getProperty("pass");;

        Assert.assertTrue(loginBO.login(login,pass));
    }

}
