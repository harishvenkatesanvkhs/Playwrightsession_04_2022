package browser_context_in_Palywright_create_multiple_browser_contexts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {

	public static void main(String[] args) {
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
		
		BrowserContext context01 = browser.newContext();
		Page page01 = context01.newPage();
		page01.navigate("https://opensource-demo.orangehrmlive.com/");
		page01.fill("#txtUsername", "Admin");
		page01.fill("#txtPassword", "admin123");
		page01.click("#btnLogin");
		System.out.println(page01.title());
		
		BrowserContext context02 = browser.newContext();
		Page page02 = context02.newPage();
		page02.navigate("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(page02.title());
		
		
		
		
		
		context01.close();
		page01.close();
		
		context02.close();
		page02.close();
		
		
		
		
		
		
	}

}
