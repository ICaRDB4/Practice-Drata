package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DrataPage;
import Page.TestBase;
import static org.testng.Assert.assertTrue;

public class DrataTest extends TestBase {

	@Test
	public void PON_TC_1() {
		DrataPage drataPage = PageFactory.initElements(driver, DrataPage.class);

		drataPage.companyPage();
		assertTrue(drataPage.learnPresent(), "Login test Case Failed");
	}
	
	@Test
	public void PON_TC_2() {
		DrataPage drataPage = PageFactory.initElements(driver, DrataPage.class);

		drataPage.demo();
		drataPage.demoData("Irving", "Calzada", "ArkusNexus", "irving456_@hotmail.com");
		assertTrue(drataPage.employeesPresent(), "Login test Case Failed");
	}
	
	@Test
	public void PON_TC_3() {
		DrataPage drataPage = PageFactory.initElements(driver, DrataPage.class);

		drataPage.signIn();
		assertTrue(drataPage.googlePresent(), "Login test Case Failed");
	}
}
