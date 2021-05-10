package com.example.database.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        plugin = "pretty",
        features = {
                "src/test/java/com/example/database/cucumber/comunidadTesting/comunidadFeature.feature",
                "src/test/java/com/example/database/cucumber/rankingTesting/rankingTesting.feature",
                "src/test/java/com/example/database/cucumber/usuarioTesting/usuarioTesting.feature",
        },
        glue = "com.example.database.cucumber"
)
@RunWith(Cucumber.class)
public class Runner {

}
