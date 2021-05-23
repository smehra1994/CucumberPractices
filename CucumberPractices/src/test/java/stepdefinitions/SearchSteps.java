package stepdefinitions;



import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a Search field on Amazon page")
	public void i_have_a_serach_field_on_amazon_page() {
		System.out.println("Step 1: Reached Search Page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer Price) {
		System.out.println("Step 2: Search Product with " + productName + " with price " + Price);

		product = new Product(productName, Price);
	}

	@Then("Product with name {string} should display")
	public void product_with_name_should_display(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed");

		search=new Search();
		String a = search.displayProduct(product);
		System.out.println("Searched Product is : " + a);
		Assert.assertEquals(product.getProductName(), a);

	}

}
