package sit333_week9;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverAutoDetectionExample {

    /*
     * This example shows automatic ChromeDriver detection.
     * Selenium Manager handles the ChromeDriver, so no manual driver path is needed.
     *
     * Do not write:
     * System.setProperty("webdriver.chrome.driver", "C:/path/chromedriver.exe");
     */
    @Ignore("Local Selenium example only. Remove @Ignore if you want to run it manually.")
    @Test
    public void testChromeDriverAutoDetection() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.google.com");
            assertTrue(driver.getTitle().toLowerCase().contains("google"));
        } finally {
            driver.quit();
        }
    }
}
