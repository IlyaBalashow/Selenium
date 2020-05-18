package pur_eb.emc_test.lib;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ResetUserSettings {
    //!!!выполнять сразу после авторизации, ДО открытия СФ документа
    public static void resetUserSettings (WebDriver driver) throws Exception {
 
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='z-menu-text'][contains(.,'Настройки')]")));
        driver.findElement(By.xpath("//span[@class='z-menu-text'][contains(.,'Настройки')]")).click();
 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='z-menuitem-text'][contains(.,'Сбросить пользовательские настройки')]")));
        driver.findElement(By.xpath("//span[@class='z-menuitem-text'][contains(.,'Сбросить пользовательские настройки')]")).click();
 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='z-listheader-checkable']")));
        driver.findElement(By.xpath("//span[@class='z-listheader-checkable']")).click();
 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='resetOk z-button'][contains(.,'Применить')]")));
        driver.findElement(By.xpath("//button[@class='resetOk z-button'][contains(.,'Применить')]")).click();
    }
}
