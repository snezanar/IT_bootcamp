package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Odabrati drugu haljinu koja se nalazi u Summer Dresses ponudi.
// Staviti u korpu dve takve haljine, M veličine u beloj boji.
public class SummerDresses {
    private static String secondDressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]";
    private static String quantityXpath = "//i[@class='icon-plus']";
    private static String sizeID = "group_1";
    private static String colorID = "color_8";
    private static String addToCartXpath = "//span[contains(text(),'Add to cart')]";
    private static String continueShoppingXpath = "//span[@class='continue btn btn-default button exclusive-medium']//span[1]";
    private static String cartXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]";

    public static WebElement getSecondDress(WebDriver wd) {
        return wd.findElement(By.xpath(secondDressXpath));
    }

    public static void clickSecondDress(WebDriver wd) {
        getSecondDress(wd).click();
    }

    public static WebElement getQuantity(WebDriver wd) {
        return wd.findElement(By.xpath(quantityXpath));
    }

    public static void clickQuantity(WebDriver wd) {
        getQuantity(wd).click();
    }


    //--------------------------------------------------------------------
    public static WebElement getSize(WebDriver wd) {
        return wd.findElement(By.id(sizeID));
    }

    public static Select getSizeSelect(WebDriver wd) {               //!!!!!!!!!!!!
        return new Select(getSize(wd));
    }

    public static void clickSize(WebDriver wd, String size) {
        getSizeSelect(wd).selectByVisibleText(size);
    }


    public static WebElement getColor(WebDriver wd) {
        return wd.findElement(By.id(colorID));
    }

    public static void clickColor(WebDriver wd) {
        getColor(wd).click();
    }


    public static WebElement getAddToCart(WebDriver wd) {
        return wd.findElement(By.xpath(addToCartXpath));
    }

    public static void clickAddToCart(WebDriver wd) {
        getAddToCart(wd).click();
    }


    public static void clickContinueShopping(WebDriver wd) {
        WebElement we = wd.findElement(By.xpath(continueShoppingXpath));
        we.click();

    }

    public static void clickCart(WebDriver wd) {
        wd.findElement(By.xpath(cartXpath)).click();
    }


}
