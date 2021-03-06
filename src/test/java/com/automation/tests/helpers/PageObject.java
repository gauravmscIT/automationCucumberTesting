package com.automation.tests.helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.test.util.AssertionErrors;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;


public abstract class PageObject {


    private static final long DRIVER_WAIT_TIME = 30;
    private static final String CHAR_LIST =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 10;



    public WebElement waitForElement(By by) {
        WebElement element = getCurrentDriver().findElement(by);
        for (int second = 0; ; second++) {
            if (second >= 500) AssertionErrors.fail("timeout");
            try {
                if (element.isDisplayed()) break;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return element;
    }

    public WebElement waitForElementDisplayedAndClickable(By by) {
        waitForElement(by);
        return (new WebDriverWait(getCurrentDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(by));
    }


    public String generateRandomString() {

        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    public int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);

    }

    public static String getTodaysDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);

    }



    public static String getCurrentDateAndTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);

    }

    public boolean dismissAlert() {

        boolean presentFlag = false;

        try {

            Alert alert = getCurrentDriver().switchTo().alert();
            presentFlag = true;
            alert.dismiss();

        } catch (NoAlertPresentException ex) {
            ex.printStackTrace();
        }

        return presentFlag;

    }


    public boolean acceptAlert() {

        boolean presentFlag = false;

        try {
            WebDriverWait wait = new WebDriverWait(getCurrentDriver(), 300 /*timeout in seconds*/);
            if(wait.until(ExpectedConditions.alertIsPresent())==null)
                System.out.println("alert was not present");
            else {
                Alert alert = getCurrentDriver().switchTo().alert();
                presentFlag = true;
                alert.accept();
            }

        } catch (NoAlertPresentException ex) {
            ex.printStackTrace();
        }

        return presentFlag;

    }




}
