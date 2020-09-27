package Projekat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MainProjekat {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

        Home.hoverWomen(wd);
        Home.clickWomanSummerDresses(wd);
        Thread.sleep(2000);

        Home.clickHomePage(wd);


        Home.hoverDresses(wd);
        Home.clickDressesSummerDresses(wd);
        Thread.sleep(2000);

        Actions action = new Actions(wd);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        SummerDresses.clickSecondDress(wd);
        SummerDresses.clickQuantity(wd);
        SummerDresses.clickSize(wd, "M");
        SummerDresses.clickColor(wd);
        SummerDresses.clickAddToCart(wd);
        Thread.sleep(3000);
        SummerDresses.clickContinueShopping(wd);
        Thread.sleep(2000);
        SummerDresses.clickCart(wd);

//        SearchBar.clickSearh(wd);
//        SearchBar.inputSearch(wd, "yellow");
//        SearchBar.clickSubmit(wd);
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}


