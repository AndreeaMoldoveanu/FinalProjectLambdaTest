package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxDemoPage extends BasePage{
    public CheckboxDemoPage(WebDriver driver){super(driver);}

    By SingleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/div[1]/label/input");

    public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox).click();}

    By FirstCheckboxOption = By.id("ex1-check1");

    public void clickOnTheFirstCheckboxoption(){driver.findElement(FirstCheckboxOption).click();}

    By SecondCheckboxOption = By.id("ex1-check2");

    public void clickOnTheSecondCheckboxoption(){driver.findElement(SecondCheckboxOption).click();}

    By ThirdCheckboxOption = By.id("ex1-check3");

    public void clickOnTheThirdCheckboxoption(){driver.findElement(ThirdCheckboxOption).click();}

    By ForthCheckboxOption = By.xpath("//*[@id=\"ex1-check3\"]");

    public void clickOnTheForthCheckboxoption(){driver.findElement(ForthCheckboxOption).click();}

    By CheckAllOption = By.id("box");

    public void clickOnCheckAllOption(){ driver.findElement(CheckAllOption).click();}
}