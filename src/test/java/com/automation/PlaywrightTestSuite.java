package com.automation;


import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;
import com.microsoft.playwright.Page;

public class PlaywrightTestSuite {
    
    @BeforeClass
    public void beforeSetUp(){
        Base base = new Base();
        Page page = base.getPagePlaywright();
    }

    @Test
    public void testPlaywright() {
        page.navigate("https://playwright.dev");
    }
}