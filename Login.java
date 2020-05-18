package pur_eb.emc_test.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    public static void login(WebDriver driver, String url, String login, String psswrd) throws Exception {
        //System.setProperty("webdriver.gecko.driver", "/Users/balashov.ilya/IdeaProjects/SeleniumProject_1/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get(url);

        //ждем появления элемента
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#user")));

        //логин
        WebElement loginField = driver.findElement(By.cssSelector("#user"));
        loginField.click();
        loginField.sendKeys(login);
        //пароль
        WebElement psswrdField = driver.findElement(By.cssSelector("#psw"));
        psswrdField.click();
        psswrdField.sendKeys(psswrd);
        //ок
        WebElement okButton = driver.findElement(By.cssSelector("#okButton"));
        okButton.click();

        //Thread.sleep(30000);
    }
}
