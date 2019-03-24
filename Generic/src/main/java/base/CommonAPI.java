package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;
    public String browserstack_username= "";
    public String browserstack_accesskey = "";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
                      @Optional("OS X") String os, @Optional("10") String os_version, @Optional("chrome-options")
                                  String browserName, @Optional("34")
                                  String browserVersion, @Optional("http://www.amazon.com") String url) throws IOException {

        //System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }


        public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName){
            if(browserName.equalsIgnoreCase("chrome")){
                if(OS.equalsIgnoreCase("OS X")){
                    System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
                }else if(OS.equalsIgnoreCase("Windows")){
                    System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
                }
                driver = new ChromeDriver();
            } else if(browserName.equalsIgnoreCase("chrome-options")){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                if(OS.equalsIgnoreCase("OS X")){
                    System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
                }else if(OS.equalsIgnoreCase("Windows")){
                    System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
                }
                driver = new ChromeDriver(options);
            }

            else if(browserName.equalsIgnoreCase("firefox")){
                if(OS.equalsIgnoreCase("OS X")){
                    System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver");
                }else if(OS.equalsIgnoreCase("Windows")) {
                    System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver.exe");
                }
                driver = new FirefoxDriver();

            } else if(browserName.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "../Generic/browser-driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            return driver;

        }
        public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String os, String os_version,String browserName,
                String browserVersion)throws IOException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("browser",browserName);
            cap.setCapability("browser_version",browserVersion);
            cap.setCapability("os", os);
            cap.setCapability("os_version", os_version);
            if(envName.equalsIgnoreCase("Saucelabs")){
                //resolution for Saucelabs
                driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                        "@ondemand.saucelabs.com:80/wd/hub"), cap);
            }else if(envName.equalsIgnoreCase("Browserstack")) {
                cap.setCapability("resolution", "1024x768");
                driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                        "@hub-cloud.browserstack.com/wd/hub"), cap);
            }
            return driver;
        }

    @AfterMethod
    public void cleanUp(){

    }
    //****************************//Type Method//**************************************//
    //TypeByID
    public void typeOnID(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    //TypeByClassName
    public void typeOnClassName(String locator, String value) {
        driver.findElement(By.className(locator)).sendKeys(value);
    }

    //TypeByCss
    public void typeOnCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    //TypeByXpath
    public void typeOnXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    //TypeOnElement
    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }

    //****************************//Type and Enter Method//**************************************//
    //TypeByID
    public void typeOnIDAndEnter(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value,Keys.ENTER);
    }

    //TypeByClassName
    public void typeOnClassNameAndEnter(String locator, String value) {
        driver.findElement(By.className(locator)).sendKeys(value,Keys.ENTER);
    }

    //TypeByCss
    public void typeOnCssAndEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value,Keys.ENTER);
    }

    //TypeByXpath
    public void typeOnXpathAndEnter(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
    }

    //TypeOnElement
    public static void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }
    //****************************//Click Method//**************************************//
    //ClickByID
    public void clickOnId(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //ClickByClassName
    public void clickOnClassName(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //ClickByCss
    public void clickOnCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //ClickByXpath
    public void clickOnXpath(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    //ClickByElement
    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).click();
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).click();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).click();
                }
            }
        }
    }

}
