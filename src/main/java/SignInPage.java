import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    static By userID = By.xpath("//input[@id='IDToken1']");
    static By passWord = By.id("IDToken2");
    static By signInButton = By.id("login-submit");

    public static void logIn(WebDriver driver) {

        driver.switchTo().frame(0);
        driver.findElement(userID).sendKeys(Utility.getProperty("userName"));
        driver.findElement(passWord).sendKeys(Utility.getProperty("passWord"));
        driver.findElement(signInButton).click();
    }
}