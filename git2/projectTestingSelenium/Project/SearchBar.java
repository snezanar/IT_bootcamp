package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {



    public static WebElement getSeach(WebDriver wd) {
        return wd.findElement(By.xpath(Home.searchBarXpath));
    }

//    public static void clickSearh(WebDriver wd) {
//        getSeach(wd).click();
//    }

    public static void inputSearch(WebDriver wd, String input) {
        getSeach(wd).sendKeys(input);
//        wd.findElement(By.id(searchBarID)).sendKeys(input);
//        wd.findElement(By.id(searchBarID)).sendKeys(Keys.ENTER);
    }

    public static WebElement getClickSubmit(WebDriver wd) {
        return wd.findElement(By.xpath(Home.searchBarSubmitXpath));
    }

    public static void clickSubmit(WebDriver wd) {
        getClickSubmit(wd).click();
    }

    public static String itemCounter(WebDriver driver) {
        return driver.findElement(By.xpath(Home.itemCounterXpath)).getText();
    }

    public static WebElement yellowItem1(WebDriver driver) {
        return driver.findElement(By.cssSelector(Home.yellowItem1CSS));
    }

    public static WebElement yellowItem2(WebDriver driver) {
        return driver.findElement(By.cssSelector(Home.yellowItem2CSS));
    }

    public static WebElement yellowItem3(WebDriver driver) {
        return driver.findElement(By.cssSelector(Home.yellowItem3CSS));
    }

}
