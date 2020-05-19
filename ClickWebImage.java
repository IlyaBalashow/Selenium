package pur_eb.emc_test.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ClickWebImage {

    public static void сlickWebImage(WebDriver driver, int num, String className, String imageSRC) throws Exception {
        //$x ("//img[@class='imagecell z-image'][@src='/sufdclient/static/images/file:/oracle/sufd-server/sufd.config/forms/global/marker_red.png']")
        ArrayList list = (ArrayList) driver.findElements(By.xpath("//img[@class='" + className + "'][@src='" + imageSRC + "']"));
        WebElement webImage = (WebElement) list.get(num);
        webImage.click();
    }
}
