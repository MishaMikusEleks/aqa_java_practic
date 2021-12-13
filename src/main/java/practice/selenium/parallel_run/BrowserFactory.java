package practice.selenium.parallel_run;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import practice.PropertyUtil;

public class BrowserFactory {
   private final static ThreadLocal<WebDriver> INSTANCE =new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(INSTANCE.get()==null){
            throw new RuntimeException("init driver first");
        }
        return INSTANCE.get();
    }
    public static void initDriver(String browserName){
        ChromeDriverManager.getInstance().setup();

        ChromeOptions options = new ChromeOptions();

       boolean headless= new PropertyUtil().getBoolean("headless",false);
       if(headless){
        options.addArguments("--headless");}

        INSTANCE.set(new ChromeDriver(options));
    }

}
