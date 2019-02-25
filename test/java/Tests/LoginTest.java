package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.LoginPage.*;
import java.net.MalformedURLException;
import java.net.URL;


import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class LoginTest{
    WebDriver driver=new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginTest() {

        loginPage.goToLoginPage("http://jira.hillel.it:8080/login.jsp");
        loginPage.enterLogin("Anastasiia_Sukha");
        loginPage.enterPassword("selanan2358181");
        loginPage.clickLogIn();
        Assert.assertFalse(loginPage.pageIsLoaded());

    }
    @AfterTest
            public void closeDriver() {
        driver.close();
    }

}
