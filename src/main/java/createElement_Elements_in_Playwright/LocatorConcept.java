package createElement_Elements_in_Playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//single element
		Locator contactsales = page.locator("text = CONTACT SALES");
		contactsales.hover();
		contactsales.click();
		
		
		
		
		BrowserContext context2  = browser.newContext();
		Page page1 = context2.newPage();
		page1.navigate("https://academy.naveenautomationlabs.com/");
		Locator login = page1.locator("text =Login");
		int loginelemnetscount = login.count();
		
		System.out.println(loginelemnetscount);
		
		login.first().click();
//		login.hover();
//		login.click();
		
		// Multiple elements:
		
		BrowserContext context3  = browser.newContext();
		Page page3 = context3.newPage();
		page3.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Locator country_select_drop_down = page3.locator("select#Form_submitForm_Country option");
		int totalcountry = country_select_drop_down.count();
		System.out.println(totalcountry);
		
		List<String> countrynames  = country_select_drop_down.allInnerTexts();
//		for(String namesList : countrynames) {
//			System.out.println(namesList);
//		}
//		
//		System.out.println("****************************************************");
//		
//		for(int i=0 ; i<=totalcountry ;i++ ) {
//			String text = country_select_drop_down.nth(i).textContent();
//			System.out.println(text);
//		}
		System.out.println("****************************************************");
		
		
		countrynames.forEach(names->System.out.println(names));
		
	
		
	}

}
