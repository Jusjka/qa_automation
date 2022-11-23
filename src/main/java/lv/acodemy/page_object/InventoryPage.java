package lv.acodemy.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    public WebElement getTitleElement() {
        return titleElement;
    }

    @FindBy(className = "title")
    public WebElement titleElement;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}