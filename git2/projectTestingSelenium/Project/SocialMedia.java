package Projekat;
//Proveriti da li ikonice koje se nalaze u meniju na kraju stranice vode na odgovarajuće adrese (ikonice za Facebook, Twitter, YouTube...)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialMedia {
    private static String facebookXpath = "//li[@class='facebook']//a";
    private static String twitterXpath = "//li[@class='twitter']//a";
    private static String youtubeXpath = "//li[@class='youtube']//a";
    private static String googlePlusXpath = "//li[@class='google-plus']//a";
    public static String facebookURL = "https://www.facebook.com/groups/525066904174158/";
    public static String twitterURL = "https://twitter.com/seleniumfrmwrk";
    public static String youtubeURL = "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
    public static String googleplusURL = "https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin";




//    public static WebElement getFacebook(WebDriver wd) {
//        return wd.findElement(By.xpath(facebookXpath));
//    }
//
//    public static void clickFacebook(WebDriver wd) {
//        getFacebook(wd).click();
//    }
//    public static WebElement getTwitter(WebDriver wd) {
//        return wd.findElement(By.xpath(twitterXpath));
//    }
//
//    public static void clickTwitter(WebDriver wd) {
//        getTwitter(wd).click();
//    }
//    public static WebElement getYoutube(WebDriver wd) {
//        return wd.findElement(By.xpath(youtubeXpath));
//    }
//
//    public static void clickYoutube(WebDriver wd) {
//        getYoutube(wd).click();
//    }
//
//    public static WebElement getGooglePlus(WebDriver wd) {
//        return wd.findElement(By.xpath(googlePlusXpath));
//    }
//
//    public static void clicGooglePlus(WebDriver wd) {
//        getGooglePlus(wd).click();
//    }


public static void clickFacebook(WebDriver driver) {
        driver.findElement(By.xpath(facebookXpath)).click();
        }

public static void clickTwitter(WebDriver driver) {
        driver.findElement(By.xpath(twitterXpath)).click();
        }

public static void clickYoutube(WebDriver driver) {
        driver.findElement(By.xpath(youtubeXpath)).click();
        }

public static void clickGoogleplus(WebDriver driver) {
    driver.findElement(By.xpath(googlePlusXpath)).click();
}
}