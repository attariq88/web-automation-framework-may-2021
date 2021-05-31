package com.amazon.tests;

import com.amazon.data.DataProvidersForTest;
import com.amazon.pages.HomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

    private static Logger LOGGER = Logger.getLogger(SearchTests.class);

//    @Test
//    public void validateUserBeAbleToSearchForAnItem(){
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike");
//        ExtentTestManager.log("Nike typed in the search bar.",LOGGER);
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        ExtentTestManager.log("Clicked on the search-button.",LOGGER);
//    }

    @Test(dataProviderClass = DataProvidersForTest.class, dataProvider = "getdataForSearchData")
    public void validateUserBeAbleToSearchForAnItemUsingPageObjectModel(String brandName){

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        homePage.typeOnSearchBar(brandName);
        ExtentTestManager.log(brandName + "typed in the search bar.",LOGGER);

        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on the search-button.",LOGGER);
    }
}
