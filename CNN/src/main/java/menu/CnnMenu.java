package menu;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CnnMenu extends CommonAPI {

    @FindBy(xpath = "//div[@id='menu']")
    public static WebElement menu;
    @FindBy(xpath = "//div[@class='nav-flyout__menu-item nav-flyout__menu-item--health']//a[@class='nav-flyout__submenu-link'][contains(text(),'Food')]  ")
    public static WebElement food;
    @FindBy(xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Fitness')]  ")
    public static WebElement fitness;
    @FindBy(xpath = "//div[@class='nav-flyout__menu-item nav-flyout__menu-item--health']//a[@class='nav-flyout__submenu-link'][contains(text(),'Wellness')] ")
    public static WebElement wellness;
    @FindBy(xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Parenting')]  ")
    public static WebElement parenting;
    @FindBy(xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Live Longer')]  ")
    public static WebElement liveLonger;
    @FindBy(xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Pro Football')] ")
    public static WebElement proFootball;

    //getters
    public static WebElement getMenu() { return menu; }
    public static WebElement getFood() { return food; }
    public static WebElement getFitness() { return fitness;}
    public static WebElement getWellness(){return wellness;}
    public static WebElement getParenting() { return parenting; }
    public static WebElement getLiveLonger() { return liveLonger; }
    public static WebElement getProFootball() { return proFootball; }


    //runMethods
    public void clickOnMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
    }
    public void clickOnFood() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getFood().click();
        driver.navigate().back();
        }
    public void clickOnFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
        getFitness().click();
        driver.navigate().back();
    }
    public void clickOnWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
        getWellness().click();
        driver.navigate().back();
    }
    public void clickOnParenting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
        getParenting().click();
        driver.navigate().back();
    }
    public void clickOnLiveLonger (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
        getLiveLonger().click();
        driver.navigate().back();
    }
    public void clickOnProFootball (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
        getProFootball().click();
        driver.navigate().back();
    }

    //useRunMethods
    public void useRunMethods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       clickOnMenu();
       clickOnFood();
       clickOnFitness();
       clickOnWellness();
       clickOnParenting();
       clickOnLiveLonger();
       clickOnProFootball();
    }

}
