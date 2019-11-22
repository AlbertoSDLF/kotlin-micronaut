Feature: Retrieve details of a Person
  As a User
  I want to obtain the details of a Person

  Scenario Outline: Successful retrieval
    Given Person with Id <id> exists
    When User requests the details of the Person with Id <id>
    Then User should get that Person's details
    And that Person's Id should be <id>
    And that Person's First Name should be <firstName>
    And that Person's Last Name should be <lastName>
    And that Person's Date Of Birth should be <birthDate>

  Examples:
      | id | firstName | lastName | birthDate |
      | 1 | FirstName1 | LastName1 | any |

  Scenario Outline: Person not found
    Given Person with Id <id> doesn't exist
    When User requests the details of a Person with Id <id>
    Then User should get a 404 NOT FOUND response

  Examples:
    | id |
    | 10 |
