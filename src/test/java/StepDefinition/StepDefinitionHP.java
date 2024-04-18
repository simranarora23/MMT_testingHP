package StepDefinition;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetup.SetupDriver;
import Page.S1PageFac;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionHP {

	static WebDriver driver;
	S1PageFac page;
	
	
	@Given("user is on homepage of Make My Trip website")
	public void user_is_on_homepage_of_make_my_trip_website() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=SetupDriver.chromedriver();
		page= new S1PageFac(driver);
	}
	@When("user selects Holiday Package option")
	public void user_selects_holiday_package_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		 page.clickPackage();
		 Thread.sleep(2000);

	}
	@When("user enters the details")
	public void user_enters_the_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Thread.sleep(1000);
        String fromCity = data.get(0).get("Value");
        String toCity = data.get(1).get("Value");
//        String departureDate = data.get(2).get(2);
//        String roomsGuests = data.get(3).get(3);
        page.enterSource(fromCity);
        page.enterDest(toCity);
//        page.enterDeparture(departureDate);
//        page.enterRoomsGuests(roomsGuests);
        page.enterDeparture();
        page.enterRoomsGuests();
        Thread.sleep(1000);
        page.clickOptApply();

	}
	@When("clicks on Search button")
	public void clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		page.clickSearch();

	}
	@Then("relevant holiday packages matching search criteria are displayed")
	public void relevant_holiday_packages_matching_search_criteria_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Europe&dest=Europe&destValue=Europe&depCity=Indore&initd=searchwidget_landing_Europe_notheme&dateSearched=19%2F05%2F2024&glp=true&pdo=false&rooms=2%2C0%2C0%2C0%2C%2C%2C&affiliate=MMT##page_header", driver.getCurrentUrl());
	}
	
	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
//=================================================================================
	
//	Scenario 2
	
	@Given("user is on Holiday Package page")
	public void user_is_on_holiday_package_page() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=SetupDriver.chromedriver();
		driver.get("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Europe&dest=Europe&destValue=Europe&depCity=Indore&initd=searchwidget_landing_Europe_notheme&dateSearched=19%2F05%2F2024&glp=true&pdo=false&rooms=2%2C0%2C0%2C0%2C%2C%2C&affiliate=MMT##page_header");
		page= new S1PageFac(driver);
	}
	@When("user performed Holiday Package search")
	public void user_performed_holiday_package_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		page.crossPopup();
		Thread.sleep(3000);
		page.closeAdEurope();
		Thread.sleep(1000);
	}

	@When("user applies filters such as Duration, Hotel Category, Flights, Themes and Package Type")
	public void user_applies_filters_such_as_duration_hotel_category_flights_themes_and_package_type() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   page.applyFilters();
	}

	@Then("Relevant search results are displayed")
	public void relevant_search_results_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		page.assertFilter();
	}
	
//===============================================================================================================
	
    
	
	@Given("user is on the MakeMyTrip holiday package search page")
	public void user_is_on_the_make_my_trip_holiday_package_search_page() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=SetupDriver.chromedriver();
		driver.get("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Europe&dest=Europe&destValue=Europe&depCity=Indore&initd=searchwidget_landing_Europe_notheme&dateSearched=19%2F05%2F2024&glp=true&pdo=false&rooms=2%2C0%2C0%2C0%2C%2C%2C&affiliate=MMT##page_header");
		page= new S1PageFac(driver);
	}

	@When("user clicks on sorted by dropdown")
	public void user_clicks_on_sorted_by_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		page.crossPopup();
		Thread.sleep(3000);
		page.closeAdEurope();
		Thread.sleep(1000);
	    page.sortedbyClick();
	}

	@When("choose to sort the holidays by Price-Low to High")
	public void choose_to_sort_the_holidays_by_price_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    page.chooseSort();
	}

	@Then("the holidays should be displayed in ascending order of price")
	public void the_holidays_should_be_displayed_in_ascending_order_of_price() {
	    // Write code here that turns the phrase above into concrete actions
		 List<Integer> prices = page.sortPriceStyle();
	        boolean sorted = true;
	        for (int i = 1; i < prices.size(); i++) {
	            if (prices.get(i) < prices.get(i - 1)) {
	                sorted = false;
	                break;
	            }
	        }
	        Assert.assertTrue("Holidays are not sorted in ascending order of price", sorted);
	    }
	
//#########################################################################################################
	
	@Given("user is on the MakeMyTrip Holiday Packages landing page")
	public void user_is_on_the_make_my_trip_holiday_packages_landing_page() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=SetupDriver.chromedriver();
		driver.get("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Europe&dest=Europe&destValue=Europe&depCity=Indore&initd=searchwidget_landing_Europe_notheme&dateSearched=19%2F05%2F2024&glp=true&pdo=false&rooms=2%2C0%2C0%2C0%2C%2C%2C&affiliate=MMT##page_header");
		page= new S1PageFac(driver);
	}

	@When("user clicks on the {string} widget")
	public void user_clicks_on_the_widget(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		page.crossPopup();
		Thread.sleep(3000);
		page.closeAdEurope();
		Thread.sleep(1000);
	    page.clickGetCallBack();
	}

	@When("user fills in the callback form with name {string}, phone {string} and email {string}")
	public void user_fills_in_the_callback_form_with_name_phone_and_email(String name, String phone, String email) {
	    // Write code here that turns the phrase above into concrete actions
		page.fillCallbackForm(name, phone, email);
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    page.clickGetCallbackBtn();
	    }

	@When("fills the another form by selecting preffered travel date, hotel star category, number of nights, No. of travellers and language preference")
	public void fills_the_another_form_by_selecting_preffered_travel_date_hotel_star_category_number_of_nights_no_of_travellers_and_language_preference() {
	    // Write code here that turns the phrase above into concrete actions
	    page.fillSecondForm();
	}

	@When("clicks on Submit button")
	public void clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    page.clickSubmitSecondForm();
	}

	@Then("the message {string} should be displayed after submitting")
	public void the_message_should_be_displayed_after_submitting(String name) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = page.verifySubmissionMessage();
		Assert.assertTrue(msg.contains("Thank You John"));
	    
	}
	
//-------------------------------------------------------------------------------------------------------------


	//Scenario 5 

	
	@Given("User is on the filter section of MakeMyTrip holiday packages page")
	public void user_is_on_the_filter_section_of_make_my_trip_holiday_packages_page() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=SetupDriver.chromedriver();
		driver.get("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Europe&dest=Europe&destValue=Europe&depCity=Indore&initd=searchwidget_landing_Europe_notheme&dateSearched=19%2F05%2F2024&glp=true&pdo=false&rooms=2%2C0%2C0%2C0%2C%2C%2C&affiliate=MMT##page_header");
		page= new S1PageFac(driver);
	}

	@When("User applies the hotel category filter for five star hotels")
	public void user_applies_the_hotel_category_filter_for_five_star_hotels() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		page.crossPopup();
		Thread.sleep(3000);
		page.closeAdEurope();
		page.scrollDefectPage();
	}

	@When("User clicks on the five star hotel category filter")
	public void user_clicks_on_the_five_star_hotel_category_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    page.applyHotelcategoryFilter();
	}

	@Then("User should see a list of packages available for selcted hotel category")
	public void user_should_see_a_list_of_packages_available_for_selcted_hotel_category() {
	    // Write code here that turns the phrase above into concrete actions
		String msg = page.errorMessage();
	    Assert.assertTrue(msg.contains("Best of Europe Group Departure 2024\""));
	}




	

}
