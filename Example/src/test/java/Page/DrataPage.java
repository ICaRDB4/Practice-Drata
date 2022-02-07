package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrataPage {

	private WebDriver driver;

	// driver
	public DrataPage(WebDriver driver) {
		this.driver = driver;

	}

	// elements
	@FindBy(xpath = "//a[contains(text(),'Company')]")
	private WebElement company;
	@FindBy(xpath = "//a[contains(text(),'About Drata')]")
	private WebElement aboutCompany;
	@FindBy(xpath = "//*[@id=\"Light-Theme\"]/div/div/div/div/div/div/div/div/header[1]/div[2]/div[2]/div/div[2]/div/div/a/span/span")
	private WebElement learnDrata;
	@FindBy(xpath = "//*[@id=\"Dark-Theme\"]/div/div/div/div/div/div/div/div/header[1]/div[2]/div[2]/div/div[2]/div/div/a/span/span")
	private WebElement getStart;
	
	
	
	
	/*@FindBy(xpath = "//*[contains(text(),'/html/body/div[3]/div/section[10]/div[2]/div/div/div[2]/div/a')]")
	private WebElement learnDrata;*/
	/*@FindBy(xpath = "//span[contains(text(),'Get Started')]")
	private WebElement getStart;*/
	
	@FindBy (xpath ="//input[@id='firstname-3d064146-843f-404a-97b0-6515b61c518b']") 
	private WebElement firstName;
	@FindBy (xpath ="//input[@id='lastname-3d064146-843f-404a-97b0-6515b61c518b']") 
	private WebElement lastName1;
	@FindBy (xpath ="//input[@id='company_name-3d064146-843f-404a-97b0-6515b61c518b']") 
	private WebElement companyName;
	@FindBy (xpath ="//input[@id='email-3d064146-843f-404a-97b0-6515b61c518b']") 
	private WebElement workEmail;
	@FindBy (xpath ="//select[@id='number_of_employees-3d064146-843f-404a-97b0-6515b61c518b']") 
	private WebElement employees;
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	private WebElement signIn;
	@FindBy(xpath = "//*[@id='root']/div[1]/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div/button[1]/div/span")
	private WebElement googleSignIn;
	// methods
	public void companyPage() {
		company.click();
		aboutCompany.click();
	}
	
	public void demo() {
		getStart.click();
	}
	
	public void demoData(String name,String lastName, String company, String email) {
		firstName.sendKeys(name);
		lastName1.sendKeys(lastName);
		companyName.sendKeys(company);
		workEmail.sendKeys(email);
	}
	
	public void signIn() {
		signIn.click();
	}

	public Boolean learnPresent() {
		return learnDrata.isDisplayed();
	}
	
	public Boolean employeesPresent() {
		return employees.isDisplayed();
	}
	
	public Boolean googlePresent() {
		return googleSignIn.isDisplayed();
	}
}
