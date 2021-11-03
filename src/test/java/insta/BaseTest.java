package insta;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.annotations.Listeners;

@Listeners({
        BaseTestListener.class,
UniversalVideoListener.class
})
public class BaseTest {
}
