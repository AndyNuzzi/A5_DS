package com.example.database.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        plugin = "pretty",
        features = {
                "src/test/java/com/example/database/cucumber/comunidadTesting/comunidadFeature.feature"
        },
        glue = "com.example.database.cucumber"
)
@RunWith(Cucumber.class)
public class Runner {

}
