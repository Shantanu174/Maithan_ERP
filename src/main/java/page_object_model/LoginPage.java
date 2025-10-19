package page_object_model;

	import java.io.IOException;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPage {
		
		private WebDriver driver;
		private WebDriverWait wait;

	    // Locators
	    private By usernameField = By.id("login_email");
	    private By passwordField = By.id("login_password");
	    private By loginButton = By.xpath("//button[@class='btn btn-sm btn-primary btn-block btn-login']");
	    private By frameworkbutton = By.xpath("//div[contains(@class, 'sidebar-item-label') and contains(text(), 'Framework')]");
	    private By methodizebutton = By.xpath("//span[normalize-space()='Methodize']");
	    private By procurementbutton = By.xpath("//span[@class='sidebar-item-label'][normalize-space()='Procurement']");
	  
	 // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set 10 sec wait
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername() throws IOException {
	        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
	        username.sendKeys("Administrator");
	    }

	    public void enterPassword() throws IOException {
	        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
	        password.sendKeys("epsumlabs@1234");
	    }

	    public void clickLogin() {
	        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	        loginBtn.click();
	    }
	    
	    public void clickframeworkbutton() {
	    	
	    	WebElement frameworkBtn = wait.until(ExpectedConditions.elementToBeClickable(frameworkbutton));
	        frameworkBtn.click();

	    }
            public void clickmethodizeleftmenu() {
	    	
	    	WebElement methodlftmenu = wait.until(ExpectedConditions.elementToBeClickable(methodizebutton));
	    	methodlftmenu.click();

	    }
            public void clickprocurementdropdown() {
    	    	
    	    	WebElement procrmentlftmenu = wait.until(ExpectedConditions.elementToBeClickable(procurementbutton));
    	    	procrmentlftmenu.click();

    	    }
	    
	    

}

