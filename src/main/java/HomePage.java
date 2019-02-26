import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    static By signinLink = By.xpath("//a[@id='gnavAccountMenu']");

    public static void clickSignIn(WebDriver driver) {
        driver.findElement(signinLink).click();
    }

    public static void goTo(WebDriver driver) {
        driver.get(Utility.getProperty("url"));
    }


}
