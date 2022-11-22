package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends LoginTest {

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        WebElement Forgotpassword = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        Forgotpassword.click();

        String expectedMessage = "Reset Password";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Verify the text ", expectedMessage, actualMessage);


    }

    @After
    public void testDown() {
        closeBrowser();

    }

}
