package tools;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static tools.Browser.driver;

public class WaitTool {

    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
