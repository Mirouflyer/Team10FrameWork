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

    //getters
    public static WebElement getMenu() { return menu; }
    public static WebElement getFood() { return food; }
    public static WebElement getFitness() { return fitness; }

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

    //useRunMethods
    public void useRunMethods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
       clickOnMenu();
       clickOnFood();
       clickOnFitness();
    }

    }
