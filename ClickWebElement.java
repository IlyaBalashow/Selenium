package pur_eb.emc_test.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ClickWebElement {

    public static void clickWebElement(WebDriver driver, int num, String htmlTag, String className) throws Exception {
        //ArrayList list = (ArrayList) driver.findElements(By.xpath("//div[@class='" + className + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "']"));
        WebElement webElement = (WebElement) list.get(num);
        webElement.click();
    }

    public static void clickWebElement(WebDriver driver, int num, String htmlTag, String className, String text) throws Exception {
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][contains(.,'" + text + "')]"));
        WebElement webElement = (WebElement) list.get(num);
        webElement.click();
    }
}
