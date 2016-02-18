package com.automation.tests.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.springframework.stereotype.Component;

@Component
public class BrowserDriver {


    private static WebDriver webDriver;

    public synchronized static WebDriver getCurrentDriver() {
        if (webDriver == null) {
            try {

             webDriver = new FirefoxDriver();
            } finally {
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return webDriver;

    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            webDriver = null;

        } catch (UnreachableBrowserException e) {

        }
    }

}
