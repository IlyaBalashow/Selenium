package pur_eb.emc_test.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SetFilter {

    public static void setTextbox(WebDriver driver, int num, String value) throws Exception {
        //установить фильтр в текстовом поле
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//input[@class='z-textbox']"));
        WebElement textbox = (WebElement) list.get(num);
        textbox.click();
        textbox.sendKeys(value);
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    public static void setDatebox(WebDriver driver, int num, String value) throws Exception {
        //установить фильтр в поле с типом "дата"
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//input[@class='z-datebox-input']"));
        WebElement datebox = (WebElement) list.get(num);
        datebox.click();
        datebox.sendKeys(value);
        datebox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    public static void setCombobox(WebDriver driver, int num, String value) throws Exception {
        //установить фильтр в поле с типом "комбобокс"
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//input[@class='z-combobox-input']"));
        WebElement combobox = (WebElement) list.get(num);
        combobox.click();
        WebElement comboboxField = driver.findElement(By.xpath("//div[@class='class='z-listcell-content'][contains(.,'" + value + "')]"));
        comboboxField.click();
        Thread.sleep(3000);
    }
}
