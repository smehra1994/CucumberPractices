package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
		System.out.println("User navigated to registration page");
	}

	@When("User enters following User details")
	public void user_enters_following_user_details(DataTable dataTable) {
		
	   List<List<String>> userList=dataTable.asLists(String.class);
	   
	   for(List<String> e : userList)
	   {
		   System.out.println(e);
	   }}
	   
	   
	   @When("User enters following User details with columns")
	   public void user_enters_following_user_details_with_columns(DataTable dataTable1) {
		   
		   List<Map<String,String>> userMap =dataTable1.asMaps(String.class,String.class);
		      
		      //System.out.println(userMap);                            //print all key value pairs of table
		      //System.out.println(userMap.get(0).get("firstname"));    //it will return 0th index value of first name i.e. Sankalpa
	   
		      for(Map<String,String> e : userMap)
		      {
		    	  //System.out.println(e);                               //same thing that first comment did , just display in diff lines
		      System.out.println(e.get("firstname"));
		      System.out.println(e.get("email"));
		      System.out.println(e.get("phone"));
		      }
	   
	   }


	@Then("User Registration should be successful")
	public void user_registration_should_be_successful() {

	}

}
