package cucumber.person

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(features = ["classpath:features/person.feature"],
        glue = ["cucumber.person.PersonStepDefinitions"])
class PersonTest {

}