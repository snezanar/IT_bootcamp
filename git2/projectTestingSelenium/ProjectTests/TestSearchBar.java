package ProjectTests;

import Projekat.Home;
import Projekat.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TestSearchBar {
    public static void main(String[] args) {
    }

    @Test
    public static void checkSearchBar() throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.get(Home.URL);
        wd.manage().window().maximize();

        SoftAssert sa = new SoftAssert();

        SearchBar.inputSearch(wd, "yellow");
        SearchBar.clickSubmit(wd);
        Thread.sleep(2000);
        sa.assertEquals(SearchBar.itemCounter(wd), "3 results have been found.");
        Actions action = new Actions(wd);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        sa.assertEquals(SearchBar.yellowItem1(wd).getAttribute("style"),"background: rgb(241, 196, 15);");
        sa.assertEquals(SearchBar.yellowItem2(wd).getAttribute("style"),"background: rgb(241, 196, 15);");
        sa.assertEquals(SearchBar.yellowItem3(wd).getAttribute("style"), "background: rgb(241, 196, 15);");

        sa.assertAll();

        wd.close();
    }
}






