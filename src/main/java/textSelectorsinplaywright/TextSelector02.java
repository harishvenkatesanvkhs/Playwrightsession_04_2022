package textSelectorsinplaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector02 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
		
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://demo.opencart.com/index.php?route=account/login");
		String header = page.locator("div.well h2:has-text('New Customer')").textContent();
		System.out.println(header);
		String header01 =page.locator("'Your Store'").textContent();//("text=Your store")
		System.out.println(header01);
		
//		page.locator("text='Login'").click();
		page.locator("form input:has-text('Login')").click();
		String title =page.title();
		System.out.println(title);
		page.close();
		browser.close();
		
		
		
	}

}
