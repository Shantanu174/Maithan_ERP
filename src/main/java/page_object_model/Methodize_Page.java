package page_object_model;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methodize_Page {

	private WebDriver driver;
	private WebDriverWait wait;

    // Locators
    private By MethodizeBox = By.xpath("//div[text()='Methodize']\r\n");
    

 // Constructor
    public Methodize_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set 10 sec wait
        PageFactory.initElements(driver, this);
    }

    public void clcikmethodize() throws IOException {
        WebElement Methodize = wait.until(ExpectedConditions.visibilityOfElementLocated(MethodizeBox));
        Methodize.click();
    }
}
