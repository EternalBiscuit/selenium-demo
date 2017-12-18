package be.refleqt.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    public static void initializeDriver(){
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
