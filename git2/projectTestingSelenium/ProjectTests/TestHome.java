package ProjectTests;

import Projekat.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestHome {
    public static void main(String[] args) {
    }

    private static WebDriver wd;
    private static SoftAssert sa;

    @BeforeSuite
    public void setProperties(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\chromedriver.exe");
    }
    @BeforeMethod
    public void setDriver() {
        wd = new ChromeDriver();
        wd.get(Home.URL);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        sa=new SoftAssert();
    }

    @Test
    public static void checkURLWomenSummerDresses() {

        Home.hoverWomen(wd);
        Home.clickWomanSummerDresses(wd);

        sa.assertEquals(wd.getCurrentUrl(), Home.womenURL);
        sa.assertAll();

    }

    @Test
    public static void checkURLDressesSummerDresses() {

        Home.hoverDresses(wd);
        Home.clickDressesSummerDresses(wd);

        sa.assertEquals(wd.getCurrentUrl(), Home.womenURL);
        sa.assertAll();

    }
    @AfterMethod
    public void closePage(){
        wd.close();
    }
}


