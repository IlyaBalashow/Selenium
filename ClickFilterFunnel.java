package pur_eb.emc_test.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickFilterFunnel {

    public static void clickFilterFunnel(WebDriver driver) throws Exception {
        //ждем появления элемента
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='filterToggler z-image']")));

        //кликаем
        //$x ("//img[@class='filterToggler z-image']")
        WebElement filterImage = driver.findElement(By.xpath("//img[@class='filterToggler z-image']"));
        filterImage.click();
        Thread.sleep(1000);
    }
}
