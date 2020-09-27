package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home {
    public static String URL = "http://automationpractice.com/index.php";
    public static String womenURL = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String hoverWomenXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    private static String womanSummerDressesXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String hoverDressesXpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
    private static String dressesSummerDressesCSS = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    private static String homePageXpath = "//img[@class='logo img-responsive']";

    public static final String searchBarXpath = "//input[@id='search_query_top']";
    public static final String searchBarSubmitXpath = "//button[@name='submit_search']";
    public static final String itemCounterXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/h1[1]/span[2]";
    public static final String yellowItem1CSS = "#color_19";
    public static final String yellowItem2CSS = "#color_31";
    public static final String yellowItem3CSS = "#color_34";


    public static void hoverWomen(WebDriver wd) {
        Actions actions = new Actions(wd);
        WebElement we = wd.findElement(By.xpath(hoverWomenXpath));
        actions.moveToElement(we).perform();
    }

    public static WebElement getWomanSummerDresses(WebDriver wd) {
        return wd.findElement(By.xpath(womanSummerDressesXpath));
    }

    public static void clickWomanSummerDresses(WebDriver wd) {
        getWomanSummerDresses(wd).click();
    }


    public static void hoverDresses(WebDriver wd) {
        Actions actions = new Actions(wd);
        WebElement we = wd.findElement(By.xpath(hoverDressesXpath));
        actions.moveToElement(we).perform();
    }

    public static WebElement getDressesSummerDresses(WebDriver wd) {
        return wd.findElement(By.xpath(dressesSummerDressesCSS));
    }

    public static void clickDressesSummerDresses(WebDriver wd) {
        getDressesSummerDresses(wd).click();
    }


    public static WebElement getHomePageXpath(WebDriver wd) {
        return wd.findElement(By.xpath(homePageXpath));
    }

    public static void clickHomePage(WebDriver wd) {
        getHomePageXpath(wd).click();
    }



}
