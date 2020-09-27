package ProjectTests;

import Projekat.Home;
import Projekat.SocialMedia;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestSocialMedia {
    public static void main(String[] args) {

    }

    @Test
    public void checkSocialMedia() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get(Home.URL);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        Actions end = new Actions(wd);
        end.sendKeys(Keys.END);
        end.build().perform();

        SoftAssert sa = new SoftAssert();

        SocialMedia.clickFacebook(wd);
        Thread.sleep(1000);
        SocialMedia.clickTwitter(wd);
        Thread.sleep(1000);
        SocialMedia.clickYoutube(wd);
        Thread.sleep(1000);
        SocialMedia.clickGoogleplus(wd);
        Thread.sleep(1000);

        ArrayList<String> tabsList = new ArrayList<>(wd.getWindowHandles());

        wd.switchTo().window(tabsList.get(4));
        sa.assertEquals(SocialMedia.facebookURL, wd.getCurrentUrl());
        wd.close();

        wd.switchTo().window(tabsList.get(3));
        sa.assertEquals(SocialMedia.twitterURL, wd.getCurrentUrl());
        wd.close();

        wd.switchTo().window(tabsList.get(2));
        sa.assertEquals(SocialMedia.youtubeURL, wd.getCurrentUrl());
        wd.close();

        wd.switchTo().window(tabsList.get(1));
        sa.assertEquals(SocialMedia.googleplusURL, wd.getCurrentUrl());
        wd.close();

        wd.switchTo().window(tabsList.get(0));
        wd.close();

        sa.assertAll();

        wd.quit();
    }
}
