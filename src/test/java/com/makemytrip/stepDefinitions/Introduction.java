package com.makemytrip.stepDefinitions;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Introduction {
	
	
	@Given("^I want to write a (.*) with precondition$")
	public void i_want_to_write_a_step_with_precondition(String step)  {
	   System.out.println("Normal Scenario");
	   System.out.println(step);
	   System.out.println();
	   Assert.assertEquals(true, false);
	}

	@Given("^I want to write a step with (.*) and (.*)$")
	public void i_want_to_write_a_step_with_Rahul_and_fdsa_fmsda_f(String name,String Pass)  {
	    
		System.out.println(" I am Scenario Outline");
		System.out.print(name);
		System.out.println(Pass);
		System.out.println("========================================");
	}
	
	

@When("^test list of <vegitable><price>$")
public void test_list_of_vegirable(DataTable vegitable)  {
	List<List<String>> l = vegitable.raw();
	
	System.out.print(l.get(2).get(0));
	System.out.println();
	System.out.println(l.get(2).get(1));
	
}

}
