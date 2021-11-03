package insta;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import practice.selenium.insta.page_factory.bo.LoginBO;
import practice.selenium.parallel_run.BrowserFactory;
import practice.PropertyUtil;

public class LoginInstaThreadSafeTC extends BaseTest{
    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
               // ,{"chrome"}
        };
    }

    @Video
    @Test(dataProvider = "browserDataProvider")
    public void loginTest(String browserName) {
        BrowserFactory.initDriver(browserName);
        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"login Failed!");

    }

    @AfterMethod
    void quitBrowser(){
        BrowserFactory.getDriver().quit();
    }
}
