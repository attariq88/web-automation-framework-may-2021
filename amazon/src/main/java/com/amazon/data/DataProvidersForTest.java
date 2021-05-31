package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForTest {

    @DataProvider(name = "getdataForSearchData")
    public Object[][] getDataforSearchtest(){
        return new Object[][]{{"Nike"},{"Hoka One One"}};
    }
}
