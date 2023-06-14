package LabsAnswers.Zuhal.lab2_guru.code.steps;

import LabsAnswers.Zuhal.lab2_guru.code.Utils.BrowserU;
import LabsAnswers.Zuhal.lab2_guru.code.Utils.DriverU;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {


    @Before
    public void setup(){
        DriverU.getDriver();
        BrowserU.impWait(5);
        DriverU.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(){
        DriverU.closeDriver();
    }



}
