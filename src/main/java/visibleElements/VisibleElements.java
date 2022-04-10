package visibleElements;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElements {

	public static void main(String[] args) 
	{

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.amazon.com/");
		List<String> titles = page.locator("a:visible").allInnerTexts();
		for (String e : titles) {
			System.out.println(e);
		}
		
		
	}

}
