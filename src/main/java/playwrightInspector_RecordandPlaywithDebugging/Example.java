package playwrightInspector_RecordandPlaywithDebugging;

import java.nio.file.Paths;

import com.microsoft.playwright.*;


public class Example {
	
	// Debug : PWDEBUG in environment -run configuration 
	//orlse we can use    page.pause(); to debug
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      context.tracing().start(new Tracing.StartOptions()
    	        .setScreenshots(true)
    	        .setSnapshots(true));
      

      // Open new page
      Page page = context.newPage();

      // Go to https://academy.naveenautomationlabs.com/
      page.navigate("https://academy.naveenautomationlabs.com/");

      // Click text=Login
      page.click("text=Login");

      // Click button:has-text("Sign Up")
      page.click("button:has-text(\"Sign Up\")");
      
//      page.pause();

      // Click text=Name *
      page.click("text=Name *");

      // Click [placeholder="Name"]
      page.click("[placeholder=\"Name\"]");

      // Fill [placeholder="Name"]
      page.fill("[placeholder=\"Name\"]", "Harish");

      // Press Tab
      page.press("[placeholder=\"Name\"]", "Tab");

      // Fill [placeholder="Email"]
      page.fill("[placeholder=\"Email\"]", "harishvenkat93@gmail.com");

      // Click text=Create Password *
      page.click("text=Create Password *");

      // Click [placeholder="Create Password"]
      page.click("[placeholder=\"Create Password\"]");

      // Fill [placeholder="Create Password"]
      page.fill("[placeholder=\"Create Password\"]", "Demo@123");

      // Click text=Show
      page.click("text=Show");

      // Click text=Hide
      page.click("text=Hide");

      // Click text=Mobile *
      page.click("text=Mobile *");

      // Click text=+91
      page.click("text=+91");

      // Click .iti-arrow
      page.click(".iti-arrow");

      // Click .iti-arrow
      page.click(".iti-arrow");

      // Click text=United States+1
      page.click("text=United States+1");

      // Click [placeholder="Mobile"]
      page.click("[placeholder=\"Mobile\"]");

      // Fill [placeholder="Mobile"]
      page.fill("[placeholder=\"Mobile\"]", "87945612000");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i
      page.click("text=By signing up, I agree to the Terms of Use and Privacy Policy. >> i");

      // Click #loginFormHtml div [aria-label="Close"]
      page.click("#loginFormHtml div [aria-label=\"Close\"]");
      
   // Stop tracing and export it into a zip archive.
      context.tracing().stop(new Tracing.StopOptions()
        .setPath(Paths.get("traceexam2.zip")));
    }
  }
}