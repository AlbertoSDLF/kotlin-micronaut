package cucumber.person

import cucumber.api.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.java8.En

class PersonStepDefinitions: En {
    init {
        @Given("Person with Id {int} exists")
        fun person_with_Id_exists(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @When("User requests the details of the Person with Id {int}")
        fun user_requests_the_details_of_the_Person_with_Id(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("User should get that Person's details")
        fun user_should_get_that_Person_s_details() { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("that Person's Id should be {int}")
        fun that_Person_s_Id_should_be(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("that Person's First Name should be FirstName{int}")
        fun that_Person_s_First_Name_should_be_FirstName(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("that Person's Last Name should be LastName{int}")
        fun that_Person_s_Last_Name_should_be_LastName(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("that Person's Date Of Birth should be any")
        fun that_Person_s_Date_Of_Birth_should_be_any() { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Given("Person with Id {int} doesn't exist")
        fun person_with_Id_doesn_t_exist(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @When("User requests the details of a Person with Id {int}")
        fun user_requests_the_details_of_a_Person_with_Id(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        @Then("User should get a {int} NOT FOUND response")
        fun user_should_get_a_NOT_FOUND_response(int1: Int?) { // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }
    }
}