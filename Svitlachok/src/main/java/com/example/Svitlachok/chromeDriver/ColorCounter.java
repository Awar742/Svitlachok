package com.example.Svitlachok.chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ColorCounter {
    public static int queueCounter(String personal_account){
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        int numberOfSchedule = 0;
        String tspanElementString;

        try {

            driver.get("https://svitlo.oe.if.ua/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("searchAccountNumber")));

            inputField.sendKeys(personal_account);

            WebElement submitButton = driver.findElement(By.id("accountNumberReport"));
            submitButton.click();
            WebElement tspanElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tspan[style*='font-weight:bold']")));
            tspanElementString=tspanElement.getText();
            tspanElementString=tspanElementString.replaceAll("\\.","");
            numberOfSchedule=Integer.parseInt(tspanElementString);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

        return numberOfSchedule;
    }
    public static int[] colorCounter(String personal_account) {

        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");


        WebDriver driver = new ChromeDriver(options);

        int[] todaySchedule = new int[24];
        try {

            driver.get("https://svitlo.oe.if.ua/");


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("searchAccountNumber")));


            inputField.sendKeys(personal_account);


            WebElement submitButton = driver.findElement(By.id("accountNumberReport"));
            submitButton.click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("g[stroke-opacity='1'][role='menuitem']")));


            List<WebElement> elements = driver.findElements(By.cssSelector("g[stroke-opacity='1'][role='menuitem']"));


            int i = 0;
            todaySchedule = new int[24];



            for (WebElement element : elements) {

                if (i >= todaySchedule.length) {
                    break;
                }

                String fillColor = element.getAttribute("fill");
                if ("#7acd6d".equals(fillColor)) {
                    todaySchedule[i] = 0;
                } else if ("#fb6666".equals(fillColor)) {
                    todaySchedule[i] = 1;
                }
                i++;
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
        return todaySchedule;
    }
}
