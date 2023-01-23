package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageTest {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

public BasePageTest(WebDriver givenDriver){
    driver = givenDriver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    actions = new Actions(driver);
}
public void doubleClick(By locator){
wait.until(ExpectedConditions.elementToBeClickable(locator));
actions.doubleClick().perform();
}
}




