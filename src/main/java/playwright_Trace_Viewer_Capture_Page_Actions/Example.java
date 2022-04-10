package playwright_Trace_Viewer_Capture_Page_Actions;
import java.nio.file.Paths;

import com.microsoft.playwright.*;


public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
   // Start tracing before creating / navigating a page.
      context.tracing().start(new Tracing.StartOptions()
        .setScreenshots(true)
        .setSnapshots(true));

      // Open new page
     
      Page page = context.newPage();
      

      // Go to https://www.amazon.com/
      page.navigate("https://www.amazon.com/");
      
//      page.pause();

      // Click [aria-label="Search"]
      page.click("[aria-label=\"Search\"]");

      // Fill [aria-label="Search"]
      page.fill("[aria-label=\"Search\"]", "Badmitton");

      // Click text=Go
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://www.amazon.com/s?k=Badmitton&crid=2YTNMXTJ2H29D&sprefix=badmitton%2Caps%2C331&ref=nb_sb_noss_2"), () ->
      page.waitForNavigation(() -> {
        page.click("text=Go");
      });
      // assert page.url().equals("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=Badmitton&ref=nb_sb_noss_2&crid=2YTNMXTJ2H29D&sprefix=badmitton%2Caps%2C331");

      // Click [aria-label="Open Menu"]
      page.click("[aria-label=\"Open Menu\"]");

      // Click a:has-text("Computers")
      page.click("a:has-text(\"Computers\")");

      // Click text=Computer Accessories & Peripherals
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://www.amazon.com/s?i=specialty-aps&bbn=16225007011&rh=n%3A16225007011%2Cn%3A172456&ref=nav_em__nav_desktop_sa_intl_computer_accessories_and_peripherals_0_2_6_2"), () ->
      page.waitForNavigation(() -> {
        page.click("text=Computer Accessories & Peripherals");
      });
      // assert page.url().equals("https://www.amazon.com/s?bbn=16225007011&rh=i%3Aspecialty-aps%2Cn%3A16225007011%2Cn%3A172456&ref_=nav_em__nav_desktop_sa_intl_computer_accessories_and_peripherals_0_2_6_2");

      // Click text=& Orders
      page.click("text=& Orders");
      // assert page.url().equals("https://www.amazon.com/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dnav_orders_first&pageId=webcs-yourorder&showRmrMe=1");

      // Click input[name="email"]
      page.click("input[name=\"email\"]");

      // Fill input[name="email"]
      page.fill("input[name=\"email\"]", "Apl@gmail.com");

      // Click input[type="submit"]
      page.click("input[type=\"submit\"]");
      // assert page.url().equals("https://www.amazon.com/ap/signin");

      // Fill input[name="password"]
      page.fill("input[name=\"password\"]", "Demo@123");

      // Click input[type="submit"]
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://www.amazon.com/ap/signin"), () ->
      page.waitForNavigation(() -> {
        page.click("input[type=\"submit\"]");
      });

      // Click text=Change
      page.click("text=Change");
      // assert page.url().equals("https://www.amazon.com/ap/signin?showRememberMe=true&showRmrMe=1&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&pageId=webcs-yourorder&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dnav_orders_first&prevRID=4WNHGB0JMTAXEJFJJEDK&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=eyJjaXBoZXIiOiJ4QWJScWxqZmM0dDA2a3hNdXcxOHhnPT0iLCJ2ZXJzaW9uIjoxLCJJViI6InZaWFVacDJIWGQrc3g1cE4zRDBMcnc9PSJ9&failedSignInCount=1&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1649435098000");

      // Click text=Create your Amazon account
      page.click("text=Create your Amazon account");
      // assert page.url().equals("https://www.amazon.com/ap/register?showRememberMe=true&showRmrMe=1&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&pageId=webcs-yourorder&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dnav_orders_first&prevRID=MW76MWB61Y6W5C1TRDWT&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1649435098000");

      // Fill input[name="customerName"]
      page.fill("input[name=\"customerName\"]", "Demo");

      // Press Tab
      page.press("input[name=\"customerName\"]", "Tab");

      // Click input[name="email"]
      page.click("input[name=\"email\"]");

      // Fill input[name="email"]
      page.fill("input[name=\"email\"]", "harishvkhs@gmail.com");

      // Click [placeholder="At least 6 characters"]
      page.click("[placeholder=\"At least 6 characters\"]");

      // Fill [placeholder="At least 6 characters"]
      page.fill("[placeholder=\"At least 6 characters\"]", "kalavenk");

      // Press Tab
      page.press("[placeholder=\"At least 6 characters\"]", "Tab");

      // Fill input[name="passwordCheck"]
      page.fill("input[name=\"passwordCheck\"]", "kalavenk");

      // Click input[name="customerName"]
      page.click("input[name=\"customerName\"]");

      // Click input[name="customerName"]
      page.click("input[name=\"customerName\"]");
      
   // Stop tracing and export it into a zip archive.
      context.tracing().stop(new Tracing.StopOptions()
        .setPath(Paths.get("trace.zip")));
    }
  }
}