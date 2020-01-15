package au.com.cheapdomains.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class TestHelper {

    public static void sleep5Seconds() {
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean isElementPresent(WebElement element){
        try{
            element.isEnabled();
        } catch (NoSuchElementException e){
            return false;
        }
        return true;
    }

}
