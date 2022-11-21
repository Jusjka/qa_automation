import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestChrome {

    ChromeDriver driver = new ChromeDriver();

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();

    }

    @Test
    public void chromeTest() {

        driver.get("https://google.com");

        WebElement acceptButton = driver.findElement(By.xpath("//button//div[contains(text(), 'Piekrist visiem')]"));
        acceptButton.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("acodemy");
        searchField.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "acodemy - Google meklēšana");

        System.out.println();

    }
}
