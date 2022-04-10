package textSelectorsinplaywright;



import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		page.locator("text = CONTACT SALES").click();
//		page.locator("text = privacy policy").first().click();
		Locator Links = page.locator("text = privacy policy");
		List<String> names  = Links.allTextContents();
		names.forEach(list -> System.out.println(list));
		for(int i=0;i<=Links.count();i++)
		{
			String text = Links.nth(i).textContent();
			
			if(text.contains("Service Privacy Policy")) {
				Links.nth(i).click();
				System.out.println(page.url());
				break;
			}
		}
	
		page.close();
		
		context.close();
		
	}

}
