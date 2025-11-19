package page_object_model;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Admin_POM {
	private WebDriver driver;
	private WebDriverWait wait;
	
	// Locators
    private By MethodizeBox = By.xpath("//div[text()='Methodize']\r\n");
    private By Adminleftmenu = By.xpath("(//aside[@id='my-sidebar']//a[@href='/erp/admin'])[1]");
    private By Rolemngmntbtn = By.xpath("(//a[normalize-space()='Role Management'])");
    private By Procdrpdwn = By.xpath("//body/div[@id='app']/div[@class='main-container']/div[contains(@class,'processes-sidebar')]/div[@class='processes-list']/div[2]/div[1]");
    private By UserCounts = By.cssSelector("div.overview-card.users div.card-value");
    private By UserCounts1 = By.cssSelector("div.overview-card.users div.card-value");


  
 // Constructor
    public Admin_POM(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set 10 sec wait
        PageFactory.initElements(driver, this);
    }

    public void clcikmethodize() throws IOException {
        WebElement Methodize = wait.until(ExpectedConditions.visibilityOfElementLocated(MethodizeBox));
        Methodize.click();
    }
    public void clickadminleftmenu() throws IOException{
    	WebElement Admin=wait.until(ExpectedConditions.visibilityOfElementLocated(Adminleftmenu));
    	Admin.click();    
    	}
    
    public void clickrolemngmntbtn() throws IOException{
    	WebElement Adminrolemngmnt=wait.until(ExpectedConditions.visibilityOfElementLocated(Rolemngmntbtn));
    	Adminrolemngmnt.click();    
    	}
    public void clickprocdrop() throws IOException{
    	WebElement Clickprocdropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(Procdrpdwn));
    	Clickprocdropdown.click();    
    	}
    
    public void handlePermissionAlert() {
        try {
            // Wait for alert to appear
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to alert
            Alert alert = driver.switchTo().alert();

            // Capture alert text (optional)
            String alertMessage = alert.getText();
            System.out.println("Alert message: " + alertMessage);

            // Click OK (accept alert)
            alert.accept();
            System.out.println("Alert accepted successfully!");

        } catch (Exception e) {
            System.out.println("No alert present or failed to handle alert: " + e.getMessage());
        }
    }
    public String getUserCount1() {
        List<WebElement> all = driver.findElements(UserCounts1);
        for (WebElement e : all) {
            if (e.isDisplayed()) {
                String text = e.getText().trim();
                System.out.println("Visible user count: " + text);
                return text;
            }
        }
        throw new RuntimeException("Visible user count element not found!");
    }
    //Test Success exceed
}


