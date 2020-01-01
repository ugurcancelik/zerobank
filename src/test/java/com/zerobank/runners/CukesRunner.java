package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-cucumber-reports"},
        features = "src/test/resources/features",  //buradaki siralama onemli degil  // features = "src/test/resources/features/Login.feature",
        glue = "com/zerobank/step_definitions",
        dryRun = false,
        tags = "@login2"
)
public class CukesRunner {
}
