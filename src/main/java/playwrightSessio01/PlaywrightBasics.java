package playwrightSessio01;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

//Browsers:Each version of Playwright needs specific versions of browser binaries to operate. 
//Depending on the language you use, Playwright will either download these browsers at package install time for you, or you will need to use Playwright CLI to install these browsers.
//With every release, Playwright updates the versions of the browsers it supports, so that the latest Playwright would support the latest browsers at any moment. 
//It means that every time you update playwright, you might need to re-run the install CLI command.

//C:\Users\AppData\Local\ms-playwright

public class PlaywrightBasics {

	public static void main(String[] args)

	{

//		Browser browser =playwright.chromium().launch();
//		Browser browser =playwright.firefox().launch(); using firefox
//		Browser browser =playwright.webkit().launch(); using webKit/safari
//		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
// 		false = launch with browser ; true means with headless
		
		
		
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();
		page.navigate("https://www.amazon.com");

		String title = page.title();
		System.out.println("Title of the page is:" + title);

																											// take the url

		String url = page.url();
		System.out.println("Url of the page is:" + url);

		browser.close();																				// to close the browser
		playwright.close();																				// to close the server

	}

}
