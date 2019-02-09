package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void dashboardTitle(){
        driver.findElement(By.xpath("//*[@id=\"dashboard-content\"]/div[1]/div/div[1]/h1/text()"));
    }

    public void clickCreate(){
        driver.findElement(By.xpath("//*[@id='create_link']")).click();
    }

    public void profileDropdown(){
        driver.findElement(By.xpath("//*[@id='header-details-user-fullname']")).click();
    }

    public void profileLogOut(){
        driver.findElement(By.xpath("//*[@id='log_out']")).click();
    }
}
