const {test, expect} = require("@playwright/test");


test.only('Browser Context Playwright Test', async ({browser}) => {

    //chrome - plugins/ cookies
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto('https://rahulshettyacademy.com/loginpagePractise/');
    console.log(await page.title());
    //type or fill
    await page.locator('#username').fill('rahulshettyacademy');
    await page.locator('[type="password"]').fill('learning');   
    await page.locator('#signInBtn').click();
    console.log(await page.locator("[style*='block']").textContent()); //automatic wait will happen

});

test('Page Playwright Test', async ({page}) => {

    await page.goto('https://google.com/');
    console.log(await page.title());
    await expect(page).toHaveTitle('Google');

});