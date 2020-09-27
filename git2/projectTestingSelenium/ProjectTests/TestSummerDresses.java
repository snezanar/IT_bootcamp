package ProjectTests;

import Projekat.Home;
import Projekat.SummerDresses;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSummerDresses {
    public static void main(String[] args){
    }

    @Test
    public static void checkCart()throws InterruptedException  {
        SoftAssert sa = new SoftAssert();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

        Home.hoverDresses(wd);
        Home.clickDressesSummerDresses(wd);
        SummerDresses.clickSecondDress(wd);
        SummerDresses.clickQuantity(wd);
        SummerDresses.clickSize(wd, "M");
        SummerDresses.clickColor(wd);
        SummerDresses.clickAddToCart(wd);
        Thread.sleep(3000);
        SummerDresses.clickContinueShopping(wd);
        Thread.sleep(2000);
        SummerDresses.clickCart(wd);

        WebElement quantity=wd.findElement(By.xpath("//input[@name='quantity_6_41_0_0']"));
        String dressQuantity=quantity.getAttribute("value");
        sa.assertEquals(dressQuantity,"2");

        WebElement name=wd.findElement((By.xpath("//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]")));
        String dressName=name.getText();
        sa.assertEquals(dressName,"Printed Summer Dress");

        WebElement attributes=wd.findElement((By.xpath("//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]")));
        String dressAttributes= attributes.getText();
        sa.assertEquals(dressAttributes,"Color : White, Size : M");

        sa.assertAll();
        wd.close();

    }
}
