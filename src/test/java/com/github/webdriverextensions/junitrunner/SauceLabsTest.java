package com.github.webdriverextensions.junitrunner;

import com.github.webdriverextensions.ThreadDriver;
import com.github.webdriverextensions.junitrunner.SeleniumGridRunner;
import com.github.webdriverextensions.junitrunner.annotations.RemoteAddress;
import com.github.webdriverextensions.junitrunner.annotations.Android;
import com.github.webdriverextensions.junitrunner.annotations.Browsers;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.IPad;
import com.github.webdriverextensions.junitrunner.annotations.IPhone;
import com.github.webdriverextensions.junitrunner.annotations.IgnoreBrowsers;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import com.github.webdriverextensions.junitrunner.annotations.Opera;
import com.github.webdriverextensions.junitrunner.annotations.Safari;
import com.github.webdriverextensions.junitrunner.annotations.BooleanOption;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(SeleniumGridRunner.class)
@RemoteAddress("http://andidev:80b7768e-dc06-4d5b-b793-5b3b83f0e24c@ondemand.saucelabs.com:80/wd/hub")
@Browsers(android = { //    @Android(platform = Platform.LINUX)
//}, chrome = {
//    @Chrome(platform = Platform.WINDOWS),
//    @Chrome(platform = Platform.WIN8),
//    @Chrome(platform = Platform.LINUX),
//    @Chrome(platform = Platform.MAC)
}, firefox = {
    //    @Firefox(platform = Platform.WINDOWS, desiredCapabilities = "{}"),
    //    @Firefox(platform = Platform.WIN8, javascriptEnabled = BooleanOption.TRUE),
    //    @Firefox(platform = Platform.LINUX),
    @Firefox(platform = Platform.MAC, javascriptEnabled = BooleanOption.FALSE)})
//}, iPhone = {
//    @IPhone(platform = Platform.MAC)
//}, iPad = {
//    @IPad(platform = Platform.MAC)
//}, internetExplorer = {
//    @InternetExplorer(platform = Platform.WINDOWS),
//    @InternetExplorer(platform = Platform.WIN8)
//}, opera = {
//    @Opera(platform = Platform.WINDOWS),
//    @Opera(platform = Platform.MAC),
//    @Opera(platform = Platform.LINUX)
//}, safari = {
//    @Safari(platform = Platform.WINDOWS),
//    @Safari(platform = Platform.MAC)
//})
//, browsers = {
//    @Browser(browserName = "galaxytab", platform = Platform.ANDROID),
//    @Browser(browserName = "nexusone", platform = Platform.ANDROID),
//    @Browser(browserName = "nexuss", platform = Platform.ANDROID),
//    @Browser(browserName = "htcdesire", platform = Platform.ANDROID)
//})
public class SauceLabsTest {

    @Test
    @IgnoreBrowsers(firefox = {
        @Firefox(platform = Platform.WIN8),
        @Firefox(platform = Platform.LINUX),
        @Firefox(platform = Platform.MAC)}, safari =
            @Safari(platform = Platform.WINDOWS, desiredCapabilities = "{ }"))
    public void test1() throws InterruptedException {
        System.out.println("browserName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getBrowserName());
        System.out.println("browserVersion = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getVersion());
        System.out.println("platformName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getPlatform().toString());

        ThreadDriver.getDriver().get("http://www.google.com");
        Assert.assertEquals("Google", ThreadDriver.getDriver().getTitle());
    }
//    @Test
//    public void test2() {
//        System.out.println("browserName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getBrowserName());
//        System.out.println("browserVersion = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getVersion());
//        System.out.println("platformName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getPlatform().toString());
//
//        ThreadDriver.getDriver().get("http://www.google.com");
//        Assert.assertEquals("Google", ThreadDriver.getDriver().getTitle());
//    }
//
//    @Test
//    public void test3() {
//        System.out.println("browserName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getBrowserName());
//        System.out.println("browserVersion = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getVersion());
//        System.out.println("platformName = " + ((RemoteWebDriver) ThreadDriver.getDriver()).getCapabilities().getPlatform().toString());
//
//        ThreadDriver.getDriver().get("http://www.google.com");
//        Assert.assertEquals("Google", ThreadDriver.getDriver().getTitle());
//    }
//
//    @Test
//    @IgnoreOpera
//    @IgnoreFirefox
//    @IgnoreChrome
//    public void test8() {
//    }
}