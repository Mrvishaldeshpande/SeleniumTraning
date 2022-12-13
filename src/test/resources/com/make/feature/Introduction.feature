
Feature: Introduction of feture file 
 

  @tag1
  Scenario: Testing normle scenario
    Given I want to write a "Baljeet Step" with precondition
    When test list of <vegitable><price>
    |vegitable|price|
    |LadyFinger|10|
    |Tomato|20|

  @tag1
  Scenario Outline: Testing Scenario Oultine
    Given I want to write a step with <name> and <Pass>
    Examples: 
      |name|Pass| 
      |Baljeet|Vishal123| 
      |Rahul|Vishal123| 
      |Vishal|Vishal123|
      |Sandip|Vishal|
