package Page;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class S1PageFac {

	static WebDriver driver;

	public S1PageFac(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void ExplicitWait(WebElement webElement,int time){
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
	 }


	//Background//
	
	@FindBy(xpath=("//a[@href='https://www.makemytrip.com/holidays-india/']"))
	WebElement HolidayPackage;
	
	@FindBy(xpath="//div[@class=\"hdsw_inner\"]/child::div[1]")
	WebElement fromDiv;
	
	@FindBy(xpath="//div[@class=\"sections-citypicker-container\"]/child::input[@class=\"citypicker_input\"]")
	WebElement fromInput;
	
	@FindBy(xpath="//div[@class=\"hdsw_inner\"]/child::div[1]/child::div[@data-testid=\"geoLocationSearch\"]/child::div[@class=\"sections-citypicker-container\"]/child::div[@class=\"citypicker_list\"]/child::div[@class=\"searchedCity\"]/ul/li[1]")
	WebElement fromDrop;
	
	@FindBy(xpath="//div[@class=\"hdsw_inner\"]/child::div[@class=\"hdsw_inputBox selectHtlCity   grow-1\"]")
	WebElement toDiv;
	
	@FindBy(xpath="//div[@class=\"dest-search-container\"]/child::input[@class=\"dest-search-input\"]")
	WebElement toInput;
	
	@FindBy(xpath="//div[@class=\"dest-search-list\"]/child::div[1]/child::div[@class=\"dest-city-container\"]")
	WebElement toDrop;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Months\"]/child::div[@class=\"DayPicker-Month\"][2]/child::div[@class=\"DayPicker-Body\"]/child::div[@class=\"DayPicker-Week\"][4]/child::div[@aria-label=\"Sun May 19 2024\"]")
	WebElement depDate;
	
	
	@FindBy(xpath = "//div[@class=\"btnContainer \"]/child::button[@class=\"applyBtn\"]")
	WebElement roomApply;
	
	@FindBy(xpath="//div[@class=\"filter-input-base\"]/child::div[@class=\"action-container\"]/child::button[@class=\"action\"]")
	WebElement optApply;
	
	@FindBy(xpath = "//div[@class=\"hdsw_inputBox selectHtlCity inactiveWidget activeWidget grow-half\"]")
	WebElement space;
	
	@FindBy(xpath = "//div[@class=\"hdsw \"]/child::p[@class=\"makeFlex vrtlCenter\"]/child::button[@id=\"search_button\"]")
	WebElement searchBtn;
//	@FindBy(id=("webklipper-publisher-widget-container-notification-close-div"))
//	WebElement CrossIcon;
	@FindBy(xpath ="//div[@class=\"sections-citypicker-container\"]/child::div[@class=\"citypicker_list\"]/child::div[@class=\"searchedCity\"]/child::ul[1]/child::li[1]")
	WebElement listInput;
	
	@FindBy(xpath="//div[@class=\"intervention-popup  \"]/child::div[@class=\"intervention-close\"]")
	WebElement hppageAdclose;
	
	@FindBy(xpath="//div[@class=\"filtersOuter\"]/child::div[@class=\"filterHeadouter\"]")
	WebElement durationFilter;
	
	@FindBy(xpath="//div[@class=\"innerListSection\"]/child::label[2]/child::span[@class=\"customCheckbox\"]")
	WebElement selectDuration;
	
	@FindBy(xpath="//div[@class=\"filterWrapper\"]/child::div[@class=\"filtersOuter\"][2]/child::div[@class=\"filterHeadouter\"]/child::span")
	WebElement selectHotels;
	
	@FindBy(xpath="//div[@class=\"filterWrapper\"]/child::div[@class=\"filtersOuter\"][2]/child::div[@class=\"hotelCategorySection\"]/child::span[2]")
	WebElement select3star;
	
	@FindBy(xpath="//div[@class=\"headingSection\"]/child::div[@class=\"filterTabsWrapper\"]")
	WebElement headingAssert;
//  Scenario 2
	
//	@FindBy(xpath="//div[@id=\"modalpopup\"]/child::div[@class=\"modalContent\"]/child::span[@class=\"close closeIcon\"]")
//	WebElement crossBtn;
	
	@FindBy( xpath= "//div[@class=\"modalContent\"]/span")
	WebElement crossBtn;
//	@FindBy(xpath="//div[@class=\"popup modalContainer planningHolidayModelWrapper planningHolidayModalWrapperV2 \"]/child::div[@class=\"_Modal modalCont  \"]/child::div[@class=\"modalContent\"]/child::span[@class=\"close closeIcon\"]")
//	WebElement crossBtn;
//	public void CloseAd()
//	{
//		CrossIcon.click();
	
	//Scenario 3
	
	@FindBy(xpath="//div[@class=\"sortedByWrapper\"]/child::div[@class=\"sortingSection\"]/child::div[@class=\"sortingValueSection\"]")
	WebElement sortedBy;
	
	@FindBy(xpath="//ul[@class=\"sortingDropdown\"]/child::li[2]")
	WebElement priceOption;
	
	@FindBy(xpath="//div[@class=\"packageDetails\"]/child::div[@class=\"packageCardList\"]")
	WebElement packageLists;
	
	@FindBy(xpath="//span[@class=\"priceStyle\"]")
	List<WebElement> priceStyles;
	
	//scenario 4
	
	@FindBy(xpath="//div[@id=\"contactManagement\"]/child::ul[@class=\"latoBold font12 blackText\"]/child::li[@id=\"getacallback\"]")
	WebElement callBack;
	
	@FindBy(xpath="//div[@class=\"userDetailsWrapper three\"]/child::div[@class=\"nameInputWrapper  firstName \"]/child::div[@class=\"makeFlex column\"]/child::input[@name=\"firstName\"]")
	WebElement nameInput;
	
	@FindBy(xpath="//div[@class=\"userDetailsWrapper three\"]/child::div[@class=\"nameInputWrapper  phoneNumber \"]/child::div[@class=\"makeFlex column\"]/child::input[@placeholder=\"Phone Number\"]")
	WebElement phoneInput;
	
	@FindBy(xpath="//div[@class=\"userDetailsWrapper three\"]/child::div[@class=\"nameInputWrapper  email \"]/child::div[@class=\"makeFlex column\"]/child::input[@placeholder=\"Email\"]")
	WebElement emailInput;
	
	@FindBy(xpath="//div[@class=\"makeFlex hrtlCenter appendBottom10 buttonWrapperQuery\"]/child::button[@class=\"buttonWrapper blueGradientStyle \"]")
	WebElement callbackBtn;
	
	@FindBy(xpath="//div[@class=\"dateBoxWrapper inputField\"]")
	WebElement dateDiv;
	
	@FindBy(xpath="//div[@class=\"radioInput boxes\"]/child::label[2]")
	WebElement selectDate;
	
	@FindBy(xpath="//div[@class=\"radioInput boxes\"]/child::label[2]")
	WebElement hotelCategoryForm;
	
	@FindBy(xpath="//div[@class=\"toCityWrapper\"]/child::input[@placeholder=\"Number of Nights\"]")
	WebElement nightsInput;
	
	@FindBy(xpath="//div[@class=\"listWrapper\"]/child::div[@class=\"makeFlex hrtlCenter name\"][2]")
	WebElement selectNights;
	
	@FindBy(xpath="//div[@class=\"toCityWrapper\"]/child::input[@placeholder=\"No. of Travelers\"]")
	WebElement travellerInput;
	
	@FindBy(xpath="//div[@class=\"listWrapper\"]/child::div[@class=\"makeFlex hrtlCenter name\"][2]")
	WebElement travellerSelect;
	
	@FindBy(xpath="//div[@class=\"toCityWrapper\"]/child::input[@placeholder=\"Language Preference\"]")
	WebElement languageInput;
	
	@FindBy(xpath="//div[@class=\"searchCityWrapper\"]/child::div[@class=\"listWrapper\"]/child::div[@class=\"makeFlex hrtlCenter name\"][1]")
	WebElement languageSelect;
	
	@FindBy(xpath="//div[@class=\"makeFlex hrtlCenter appendBottom10 buttonWrapperQuery\"]/child::button[@class=\"buttonWrapper blueGradientStyle \"]")
	WebElement submitBtn;
	
	@FindBy(xpath="//div[@id=\"contactManagement\"]/child::ul[@class=\"latoBold font12 blackText\"]/child::li[@id=\"customizeyourplan\"]")
	WebElement customizePlan;
	
	@FindBy(xpath="//div[@id=\"modalpopup\"]/child::div[@class=\"modalContent\"]/div[1]/child::div[1]/child::header[@class=\"thankyouHeader\"]/child::span")
	WebElement resultMessage;
	
	
	//Scenario 5
	
	@FindBy(xpath="//div[@class=\"hotelCategorySection\"]/child::span[@class=\"categoryRating  \"][3]")
	WebElement select5star;
	
	@FindBy(xpath="//div[@class=\"errorPageWrapper has-filters\"]")
	WebElement packageShow;
	
	//	}
	public void clickPackage() throws InterruptedException
	{
		
		HolidayPackage.click();
		Thread.sleep(1000);
		 
	}
	
	public void enterSource(String From_City) throws AWTException, InterruptedException
	{
		fromDiv.click();
		Thread.sleep(1000);
//		fromInput.click();
		fromInput.clear();
		Thread.sleep(1000);
		fromInput.sendKeys(From_City);
		Thread.sleep(1000);
		Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_DOWN);
//	       r.keyRelease(KeyEvent.VK_DOWN);
	       r.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
		fromDrop.click();
		Thread.sleep(1000);
		
		
		
		
//		fromInput.click();
//		Thread.sleep(1000);
//		fromCity.click();
//		fromCity.clear();
//		Thread.sleep(1000);
//		fromCity.sendKeys(From_City);
//		Robot r=new Robot();
//	       r.keyPress(KeyEvent.VK_DOWN);
//	       r.keyRelease(KeyEvent.VK_DOWN);
//	       r.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		fromDrop.click();
//		Thread.sleep(1000);
  		
	       
	    
	}
	
	
	public void enterDest(String To_City) throws InterruptedException, AWTException {
		
		
		toDiv.click();
		Thread.sleep(1000);
//		toInput.click();
		toInput.sendKeys(To_City);
		Thread.sleep(1000);
		Robot r1=new Robot();
	       r1.keyPress(KeyEvent.VK_DOWN);
//	       r.keyRelease(KeyEvent.VK_DOWN);
	       r1.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
		toDrop.click();
		Thread.sleep(1000);
		
//		Thread.sleep(1000);
//		toCity.click();
//		Thread.sleep(1000);
//		toCity.clear();
//		Thread.sleep(1000);
//		toCity.sendKeys(To_City);
//		r.keyPress(KeyEvent.VK_DOWN);
//	       r.keyRelease(KeyEvent.VK_DOWN);
//	       r.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		toDrop.click();
//		Thread.sleep(1000);
	       
//		Thread.sleep(1000);
//		clearInput.sendKeys(city);
//		//Thread.sleep(3000);
//		Robot r=new Robot();
//	       r.keyPress(KeyEvent.VK_DOWN);
//	       r.keyRelease(KeyEvent.VK_DOWN);
//	       r.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public void enterDeparture() throws InterruptedException
	{
 		depDate.click();
	}
	
	public void enterRoomsGuests()
	{
		roomApply.click();
	}
	public void clickOptApply() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		optApply.click();
	}
	 
	public void clickSearch()
	{
		searchBtn.click();
	}
	
//	public void handleAlert()
//	{
//		try {
//            // Wait for the alert to appear
//            Thread.sleep(2000); // Adjust the wait time as needed
//
//            // Switch to the alert and click "Allow"
//            driver.switchTo().alert().accept();
//
//            // Switch back to the default content (main page)
//            driver.switchTo().defaultContent();
//
//            
//        } catch (Exception e) {
//            System.err.println("Error handling location access alert: " + e.getMessage());
//        } 
//	}
//	
	//Scenario 2
	public void enterDetails() throws InterruptedException
	{
		Thread.sleep(1000);
		fromDiv.click();
		fromInput.click();
		Thread.sleep(1000);
		fromInput.clear();
		Thread.sleep(1000);
		fromInput.sendKeys("Indore");
		Thread.sleep(1000);
		toDiv.click();
		toInput.click();
		toInput.sendKeys("Europe");
		Thread.sleep(1000);
		listInput.click();
		Thread.sleep(1000);
		depDate.click();
		Thread.sleep(1000);
		roomApply.click();
		Thread.sleep(1000);
		optApply.click();
		Thread.sleep(1000);

		
		
	}

	
	public void crossPopup()
	{
		crossBtn.click();
	}

	public void closeAdEurope()
	{
//		 try {
//				driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"intervention-popup-container \"]/div[@class=\"intervention-popup  \"]/div[@class=\"intervention-close\"]")));
//			WebElement close_popup = driver.findElement(By.cssSelector("div.intervention-close"));
//			close_popup.click();
//			driver.switchTo().defaultContent();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
		hppageAdclose.click();
	}
	public void applyFilters() throws InterruptedException
	{
//		ExplicitWait(durationFilter,120);
//		durationFilter.click();
//		ExplicitWait(selectDuration,10);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		ExplicitWait(selectDuration,10);
		selectDuration.click();
		Thread.sleep(2000);
		WebElement iframeElement = driver.findElement(By.xpath("//div[@class=\"filterWrapper\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iframeElement);
//		driver.switchTo().frame(iframeElement);
//		js.executeScript("window.scrollBy(0,100)");
//		driver.switchTo().defaultContent();
//		ExplicitWait(selectHotels,10);
//		selectHotels.click();
		ExplicitWait(select3star, 10);
		select3star.click();
	}
	
	public void assertFilter()
	{
		assert headingAssert.isDisplayed();
	}

	public void sortedbyClick() throws InterruptedException
	{
		 ExplicitWait(sortedBy, 10);
		 sortedBy.click();
		 Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,120)");
	}
	public void chooseSort()
	{
		ExplicitWait(priceOption, 10);
		priceOption.click();
	}
	 public List<Integer> sortPriceStyle()
	 {
		
		        List<Integer> prices = new ArrayList<>();
		        for (WebElement priceStyle : priceStyles ) {
//		            WebElement priceElement = holidayPackage.findElement(By.xpath(".//div[@class='styles__Pricing-sc-1b7c4av-5 dJYyWR']"));
		            String priceText = priceStyle.getText().replaceAll("[^\\d]", ""); // Remove non-numeric characters
		            int priceValue = Integer.parseInt(priceText);
		            prices.add(priceValue);
		        }
		        return prices;
		 }
	 
	 //scenario 4
	 
	 public void clickGetCallBack()
	 {
		 ExplicitWait(customizePlan, 30);
		 customizePlan.click();
//		 ExplicitWait(callBack, 30);
//		 callBack.click();
	 }
	 
	 public void fillCallbackForm(String name, String phone, String email)
	 {
		 ExplicitWait(nameInput, 3);
		 nameInput.sendKeys(name);
		 ExplicitWait(phoneInput, 3);
		 phoneInput.sendKeys(phone);
		 ExplicitWait(emailInput, 3);
	     emailInput.sendKeys(email);
	 }
	 public void clickGetCallbackBtn()
	 {
		 ExplicitWait(callbackBtn, 3);
		 callbackBtn.click();
	 }
	 public void fillSecondForm()
	 {
		 ExplicitWait(selectDate, 3);
	     selectDate.click();
	     ExplicitWait(selectDate, 3);
		 hotelCategoryForm.click();
		 ExplicitWait(nightsInput, 3);
		 nightsInput.click();
		 ExplicitWait(selectNights, 3);
		 selectNights.click();
		 ExplicitWait(travellerInput, 3);
		 travellerInput.click();
		 ExplicitWait(travellerSelect, 3);
		 travellerSelect.click();
		 ExplicitWait(languageInput, 3);
		 languageInput.click();
		 ExplicitWait(languageSelect, 3);
		 languageSelect.click();
		 
	 }
	 public void clickSubmitSecondForm()
	 {
		 ExplicitWait(submitBtn, 3);
		 submitBtn.click();
	 }
	 public String verifySubmissionMessage() 
	 {
		    ExplicitWait(resultMessage, 3);
	        return resultMessage.getText();
	    }
//Scenario 5
	 
	 public void scrollDefectPage() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		 WebElement hotelCategorySelection = driver.findElement(By.xpath("//div[@class=\"filterWrapper\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hotelCategorySelection);
		 
	 }
	 public void applyHotelcategoryFilter()
	 {
			ExplicitWait(select5star, 5);
			select5star.click();
	 }
	 public String errorMessage()
	 {
		 
//			    List<WebElement> packageElements = driver.findElements(By.xpath("//div[@class=\"titleWrapper\"]/child::p[@title=\"Magical Switzerland - Group Departure 2024\"]"));
//			    return !packageElements.isEmpty();
		return packageShow.getText();
			
	 }
	 
}
