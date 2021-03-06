package ui.insta;

import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import practice.PropertyUtil;
import practice.hibernate.basics.Student;
import practice.hibernate.dao.StudentDao;
import practice.selenium.insta.page_factory.bo.LoginBO;
import practice.selenium.parallel_run.BrowserFactory;
import practice.test_helper.BaseTest;

import java.util.List;

@Test
public class LoginInstaThreadSafeTest extends BaseTest {
    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
               // ,{"firefox"}
               // ,{"chrome"}
        };
    }

    @DataProvider
    public static Object[][] userDataProvider() {

        List<Student> list = StudentDao.getInstance().findAll();

        Object[][] res=new Object[list.size()][2];
        final int[] i = {0};
        list.forEach(s->{
            res[i[0]++][0]=s.getName();
            res[i[0]][0]=s.getAddress_id();
        });

        return res;
    }

    //@Video
    @Issue("432")
    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest(String browserName) {

        BrowserFactory.initDriver(new PropertyUtil().getProp().getProperty("browser","chrome"));

        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"login Failed!");

    }


    @Test(dataProvider = "userDataProvider")
    public void userTest(String login,String password) {

        System.out.println(login);
        System.out.println(password);

        System.out.println();

    }
}
