package pur_eb.emc_test.lib;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ExistWebElement {

    //общий
    public static void existWebElement(WebDriver driver, int num, String htmlTag, String className) throws Exception {
        //ArrayList list = (ArrayList) driver.findElements(By.xpath("//span[@class='" + className + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "']"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }

    public static void existWebElement(WebDriver driver, int num, String htmlTag, String className, String text) throws Exception {
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][contains(.,'" + text + "')]"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }

    //по атрибуту
    public static void existWebElementByAttribute(WebDriver driver, int num, String htmlTag, String className, String attributeName, String attributeValue) throws Exception {
        //$x("//textarea[@class='expand z-advtextarea z-advtextarea-readonly'][@name='ta_doc_adi_purposepayment'][contains(.,'Перечисление средств в счет погашения долга')]")        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@name='" + name + "'][@title='" + title + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@" + attributeName + "='" + attributeValue + "']"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }

    public static void existWebElementByAttribute(WebDriver driver, int num, String htmlTag, String className, String attributeName, String attributeValue, String text) throws Exception {
        //$x("//textarea[@class='expand z-advtextarea z-advtextarea-readonly'][@name='ta_doc_adi_purposepayment'][contains(.,'Перечисление средств в счет погашения долга')]")
        //ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@name='" + name + "'][@title='" + title + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@" + attributeName + "='" + attributeValue + "'][contains(.,'" + text + "')]"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }

    //по 2 атрибутам
    public static void existWebElementByAttributes(WebDriver driver, int num, String htmlTag, String className, String attribute1Name, String attribute1Value, String attribute2Name, String attribute2Value) throws Exception {
        //$x("//textarea[@class='expand z-advtextarea z-advtextarea-readonly'][@name='ta_doc_adi_purposepayment'][contains(.,'Перечисление средств в счет погашения долга')]")
        //ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@name='" + name + "'][@title='" + title + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@" + attribute1Name + "='" + attribute1Value + "'][@" + attribute2Name + "='" + attribute2Value + "']"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }

    public static void existWebElementByAttributes(WebDriver driver, int num, String htmlTag, String className, String attribute1Name, String attribute1Value, String attribute2Name, String attribute2Value, String text) throws Exception {
        //$x("//textarea[@class='expand z-advtextarea z-advtextarea-readonly'][@name='ta_doc_adi_purposepayment'][contains(.,'Перечисление средств в счет погашения долга')]")
        //ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@name='" + name + "'][@title='" + title + "']"));
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//" + htmlTag + "[@class='" + className + "'][@" + attribute1Name + "='" + attribute1Value + "'][@" + attribute2Name + "='" + attribute2Value + "'][contains(.,'" + text + "')]"));
        WebElement webElement = (WebElement) list.get(num);
        Assert.assertNotNull(webElement);
    }
}
