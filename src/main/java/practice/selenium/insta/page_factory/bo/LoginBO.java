package practice.selenium.insta.page_factory.bo;

import practice.PropertyUtil;
import practice.selenium.insta.page_factory.po.LoginPO;

public class LoginBO {

    public boolean login() {
        return  new LoginPO()
                .goToLoginPage()
                .inputLogin((String) new PropertyUtil().getProperty("login"))
                .inputPassword((String) new PropertyUtil().getProperty("pass"))
                .submit()
                .isOpen();
    }
}
