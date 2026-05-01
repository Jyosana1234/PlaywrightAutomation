package com.automation;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
    public static void main(String[] args) {

    }

    public Page getPagePlaywright() {
        Page page;
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            // Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setchannel("chrome"));
            page = browser.newPage();
            // System.out.println("This is the page title: " + page.title());
            // page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/java/com/screenshots/screenshot1.png")));
        }
        return page;
    }
}