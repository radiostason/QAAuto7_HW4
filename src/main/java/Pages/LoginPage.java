package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void goToLoginPage(String url) {
        driver.get(url);

    }


    public void enterLogin(String login){
        driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys(login);
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys(password);
    }

    public void clickLogIn(){
        driver.findElement(By.xpath("//*[@id='login-form-submit']")).click();
    }
    public boolean pageIsLoaded(){
        return driver.findElement(By.id("header-details-user-fullname")).isDisplayed();

    }

}
