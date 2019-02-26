import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    @Test
    public void loginTest() throws InterruptedException {
        HomePage.goTo(driver);
        HomePage.clickSignIn(driver);
        SignInPage.logIn(driver);
    }
}
