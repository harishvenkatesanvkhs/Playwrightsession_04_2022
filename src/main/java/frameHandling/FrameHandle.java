package frameHandling;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
		BrowserContext context  = browser.newContext();
		Page page = context.newPage();
		page.navigate("http://londonfreelance.org/courses/frames/index.html");
		String header = page.frameLocator("frame[name='main']").locator("h2").textContent();
//		String header = page.frameLocator("//frame[@name='main']").locator("h2").textContent(); using Xpath
		System.out.println(header);
		
		String header01 = page.frame("main").locator("h2").textContent();
		System.out.println(header01);
		
		
		//iframe
		
		
		
	}

}
