package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyErroeMessagewithInvalidCredentials() {

        WebElement UsernameField = driver.findElement(By.name("username"));
        UsernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //find the login button and click on it

        WebElement loginlink1 = driver.findElement(By.xpath("//button[@type='submit']"));
        loginlink1.click();

        String expectedMessage = "Dashboard";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h6[(text()='Dashboard')]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        closeBrowser();

    }

}

