import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Stason/IdeaProjects/QAAuto7_HW4/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {

        String expectedTitleLoginPage = "Log in - Hillel IT School JIRA";
        String actualTitleLoginPage = "";

        String expectedTitleDashboardPage = "System Dashboard - Hillel IT School JIRA";
        String actualTitleDashboardPage = "";

        // запустить Chrome и перейти на сайт Jira
        driver.get("http://jira.hillel.it:8080/login.jsp");
        // развернуть окно браузера
        driver.manage().window().maximize();
        // получить тайтл Login Page
        actualTitleLoginPage = driver.getTitle();
        // выполняем проверку тайтла Login Page
        assertEquals(actualTitleLoginPage, expectedTitleLoginPage);

        // ввести логин
        loginPage.enterLogin("Stas_Radionov");

        // ввести пароль
        loginPage.enterPassword("Hillel1986");

        // нажать кнопку Log In
        loginPage.clickLogIn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // получить тайтл Dashboard Page
        actualTitleDashboardPage = driver.getTitle();
        // выполняем проверку тайтла Dashboard Page
        assertEquals(actualTitleDashboardPage, expectedTitleDashboardPage);

    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
