package com.fidexio.step_definitions;

import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before()
    public void setupForDatabaseScenarios(){
        System.out.println("TEST STARTS!....");
    }

    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }
/*
    @BeforeStep
    public void setupStep(){
        System.out.println("-----------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("-----------> applying tearDown using @AfterStep");
    }

 */

}
