package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateIssuePage {
    private WebDriver driver;

    public CreateIssuePage(WebDriver driver) { this.driver = driver; }

    public void enterSummary(String summary){
        driver.findElement(By.xpath("//input[@id='summary']")).sendKeys(summary);
    }

    public void enterDescription(String description){
        driver.findElement(By.xpath("//input[@id='description']")).sendKeys(description);
    }

    public void assignToMe(){

        driver.findElement(By.xpath("//*[@id='assign-to-me-trigger']")).click();
    }

    public void clickCreate(){

        driver.findElement(By.xpath("//*[@id='create-issue-submit']")).click();
    }
}
