package shadowDomElement;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDomElementExample2 {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		page.frameLocator("#pact").locator("div#snacktime #tea").fill("coffee");
		


		
	}

}
