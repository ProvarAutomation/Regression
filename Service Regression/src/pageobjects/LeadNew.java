package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="LeadNew"                                
, summary=""
, relativeUrl=""
, connection="AdamGrille"
		)             
public class LeadNew {

	@TextType(maxLength = 80)
	@FindByLabel(label = "Last Name")
	public WebElement LastName;
	@TextType(maxLength = 255)
	@FindByLabel(label = "Company")
	public WebElement Company;
	@TextType(maxLength = 255)
	@FindByLabel(label = "Company")
	public WebElement Company1;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "Dealer Principal/Owner"),
			@ChoiceListValue(value = "General Manager"),
			@ChoiceListValue(value = "BDC Director/Manager"),
			@ChoiceListValue(value = "Ecommerce Director/Manager"),
			@ChoiceListValue(value = "Used Sales Manager"),
			@ChoiceListValue(value = "New Sales Manager"),
			@ChoiceListValue(value = "Salesperson"),
			@ChoiceListValue(value = "Internet Sales Manager"),
			@ChoiceListValue(value = "Marketing/Advertising Manager"),
			@ChoiceListValue(value = "Advertising Agency"),
			@ChoiceListValue(value = "Business Development"),
			@ChoiceListValue(value = "Office Manager"),
			@ChoiceListValue(value = "Finance Manager"),
			@ChoiceListValue(value = "Administrative"),
			@ChoiceListValue(value = "A/R Manager"),
			@ChoiceListValue(value = "A/P Manager"),
			@ChoiceListValue(value = "Operations Manager"),
			@ChoiceListValue(value = "Service/Parts/Fixed Operations"),
			@ChoiceListValue(value = "Other") })
	@FindByLabel(label = "Contact Title")
	public WebElement Contact_Title__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Yes"),
			@ChoiceListValue(value = "No") })
	@FindByLabel(label = "Dealer is part of a dealer group?")
	public WebElement Dealer_is_part_of_a_dealer_group__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Mr."),
			@ChoiceListValue(value = "Ms."), @ChoiceListValue(value = "Mrs."),
			@ChoiceListValue(value = "Dr."), @ChoiceListValue(value = "Prof.") })
	@FindBy(id = "name_salutationlea2")
	public WebElement Salutation;
	@TextType(maxLength = 40)
	@FindByLabel(label = "First Name")
	public WebElement FirstName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement Email;
	@TextType(maxLength = 40)
	@FindByLabel(label = "First Name")
	public WebElement FirstName1;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement Email1;
	@TextType()
	@FindByLabel(label = "Mobile")
	public WebElement MobilePhone;
	@ChoiceListType(values = { @ChoiceListValue(value = "Affiliate Network"),
			@ChoiceListValue(value = "Auction"),
			@ChoiceListValue(value = "Dealership"),
			@ChoiceListValue(value = "Events"),
			@ChoiceListValue(value = "Motorcycles"),
			@ChoiceListValue(value = "Boats"),
			@ChoiceListValue(value = "Parts/Accessories"),
			@ChoiceListValue(value = "Services"),
			@ChoiceListValue(value = "Tools") })
	@FindByLabel(label = "Business Type")
	public WebElement Business_Type__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Small"),
			@ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Large") })
	@FindByLabel(label = "Business Size")
	public WebElement Business_Size__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "20 Group"),
			@ChoiceListValue(value = "Advertisement"),
			@ChoiceListValue(value = "Advertisement - Banner"),
			@ChoiceListValue(value = "Advertisement - Print"),
			@ChoiceListValue(value = "App Store"),
			@ChoiceListValue(value = "ATC â 20 Group"),
			@ChoiceListValue(value = "ATC Teaser"),
			@ChoiceListValue(value = "Auction Genius"),
			@ChoiceListValue(value = "AutoTrader"),
			@ChoiceListValue(value = "AutoTrader Major Accounts"),
			@ChoiceListValue(value = "Call In"),
			@ChoiceListValue(value = "Call in - ATC Directed"),
			@ChoiceListValue(value = "Cold Call"),
			@ChoiceListValue(value = "Customer Referral"),
			@ChoiceListValue(value = "Direct Mail"),
			@ChoiceListValue(value = "Editorial / Press Coverage"),
			@ChoiceListValue(value = "Email Blast"),
			@ChoiceListValue(value = "Employee Referral"),
			@ChoiceListValue(value = "External Referral"),
			@ChoiceListValue(value = "Harvest"),
			@ChoiceListValue(value = "Internal Referral"),
			@ChoiceListValue(value = "Migrated Customer"),
			@ChoiceListValue(value = "NADA"),
			@ChoiceListValue(value = "OEM Referral"),
			@ChoiceListValue(value = "Other"),
			@ChoiceListValue(value = "Partner"),
			@ChoiceListValue(value = "Partner Referral"),
			@ChoiceListValue(value = "Press Release"),
			@ChoiceListValue(value = "Public Relations"),
			@ChoiceListValue(value = "Seminar - Internal"),
			@ChoiceListValue(value = "Seminar - Partner"),
			@ChoiceListValue(value = "Telemarketing"),
			@ChoiceListValue(value = "Trade Show"),
			@ChoiceListValue(value = "Trade Show or Conference"),
			@ChoiceListValue(value = "Web"),
			@ChoiceListValue(value = "Webinars"),
			@ChoiceListValue(value = "Website"),
			@ChoiceListValue(value = "Website - ATC Directed"),
			@ChoiceListValue(value = "Website â Stocking Teaser"),
			@ChoiceListValue(value = "Word of mouth") })
	@FindByLabel(label = "Lead Source")
	public WebElement LeadSource;
	@TextType()
	@FindByLabel(label = "Street")
	public WebElement Street;
	@TextType(maxLength = 40)
	@FindByLabel(label = "City")
	public WebElement City;
	@TextType(maxLength = 80)
	@FindByLabel(label = "State/Province")
	public WebElement State;
	@TextType(maxLength = 20)
	@FindByLabel(label = "Zip/Postal Code")
	public WebElement PostalCode;
	@TextType(maxLength = 80)
	@FindByLabel(label = "Country")
	public WebElement Country;
	@ChoiceListType(values = { @ChoiceListValue(value = "Ad Agency"),
			@ChoiceListValue(value = "Dealer"),
			@ChoiceListValue(value = "Dealer Group"),
			@ChoiceListValue(value = "OEM"), @ChoiceListValue(value = "OEMAA"),
			@ChoiceListValue(value = "Other"),
			@ChoiceListValue(value = "Rental Car Company") })
	@FindByLabel(label = "Customer Type")
	public WebElement Customer_Type__c;
	@TextType()
	@FindByLabel(label = "Phone")
	public WebElement Phone;
	@TextType()
	@FindByLabel(label = "Fax")
	public WebElement Fax;
	@TextType()
	@FindByLabel(label = "Website")
	public WebElement Website;
	@TextType()
	@FindByLabel(label = "Description")
	public WebElement Description;
	@TextType(maxLength = 150)
	@FindByLabel(label = "Bill to Attention To")
	public WebElement Bill_to_Attention_To__c;
	@TextType()
	@FindByLabel(label = "Website URL")
	public WebElement Website_URL__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "YES"),
			@ChoiceListValue(value = "NO") })
	@FindByLabel(label = "Billing Address Same as Physical?")
	public WebElement Same_as_Physical_Address__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "YES"),
			@ChoiceListValue(value = "NO") })
	@FindByLabel(label = "Web Address Same as Physical?")
	public WebElement Web_Address_Same_as_Physical__c;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@TextType()
	@FindByLabel(label = "3rd Party Bill-To IDs")
	public WebElement X3rd_Party_Bill_To_IDs__c;
	@TextType()
	@FindByLabel(label = "Additional Notes")
	public WebElement Additional_Notes__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Independent"),
			@ChoiceListValue(value = "Franchise") })
	@FindByLabel(label = "Dealer Type")
	public WebElement Type__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Independent"),
			@ChoiceListValue(value = "0-15"),
			@ChoiceListValue(value = "16-25"),
			@ChoiceListValue(value = "26-35"),
			@ChoiceListValue(value = "36-45"),
			@ChoiceListValue(value = "46-55"),
			@ChoiceListValue(value = "56-65"),
			@ChoiceListValue(value = "66-80"),
			@ChoiceListValue(value = "81-100"),
			@ChoiceListValue(value = "101-125"),
			@ChoiceListValue(value = "126-150"),
			@ChoiceListValue(value = "151-200"),
			@ChoiceListValue(value = "201-250"),
			@ChoiceListValue(value = "251-350"),
			@ChoiceListValue(value = "351-500"),
			@ChoiceListValue(value = "501-750"),
			@ChoiceListValue(value = "751+") })
	@FindByLabel(label = "Lot Size - New")
	public WebElement Lot_Size_New__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "Independent"),
			@ChoiceListValue(value = "0-15"),
			@ChoiceListValue(value = "16-25"),
			@ChoiceListValue(value = "26-35"),
			@ChoiceListValue(value = "36-45"),
			@ChoiceListValue(value = "46-55"),
			@ChoiceListValue(value = "56-65"),
			@ChoiceListValue(value = "66-80"),
			@ChoiceListValue(value = "81-100"),
			@ChoiceListValue(value = "101-125"),
			@ChoiceListValue(value = "126-150"),
			@ChoiceListValue(value = "151-200"),
			@ChoiceListValue(value = "201-250"),
			@ChoiceListValue(value = "251-350"),
			@ChoiceListValue(value = "351-500"),
			@ChoiceListValue(value = "501-750"),
			@ChoiceListValue(value = "751+") })
	@FindByLabel(label = "Lot Size - Used")
	public WebElement Lot_Size_Used__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Acura"),
			@ChoiceListValue(value = "1", title = "Aston Martin"),
			@ChoiceListValue(value = "2", title = "Audi"),
			@ChoiceListValue(value = "3", title = "Bentley"),
			@ChoiceListValue(value = "4", title = "BMW"),
			@ChoiceListValue(value = "5", title = "Bugatti"),
			@ChoiceListValue(value = "6", title = "Buick"),
			@ChoiceListValue(value = "7", title = "Cadillac"),
			@ChoiceListValue(value = "8", title = "Chevrolet"),
			@ChoiceListValue(value = "9", title = "Chrysler"),
			@ChoiceListValue(value = "10", title = "Dodge"),
			@ChoiceListValue(value = "11", title = "Ferrari"),
			@ChoiceListValue(value = "12", title = "Fiat"),
			@ChoiceListValue(value = "13", title = "Fisker"),
			@ChoiceListValue(value = "14", title = "Ford"),
			@ChoiceListValue(value = "15", title = "GMC"),
			@ChoiceListValue(value = "16", title = "Harley Davidson"),
			@ChoiceListValue(value = "17", title = "Honda"),
			@ChoiceListValue(value = "18", title = "Hummer"),
			@ChoiceListValue(value = "19", title = "Hyundai"),
			@ChoiceListValue(value = "20", title = "Independent Dealer"),
			@ChoiceListValue(value = "21", title = "Infiniti"),
			@ChoiceListValue(value = "22", title = "Isuzu"),
			@ChoiceListValue(value = "23", title = "Jaguar"),
			@ChoiceListValue(value = "24", title = "Jeep"),
			@ChoiceListValue(value = "25", title = "Kia"),
			@ChoiceListValue(value = "26", title = "Lamborghini"),
			@ChoiceListValue(value = "27", title = "Land Rover"),
			@ChoiceListValue(value = "28", title = "Lexus"),
			@ChoiceListValue(value = "29", title = "Lincoln"),
			@ChoiceListValue(value = "30", title = "Lotus"),
			@ChoiceListValue(value = "31", title = "Maserati"),
			@ChoiceListValue(value = "32", title = "Maybach"),
			@ChoiceListValue(value = "33", title = "Mazda"),
			@ChoiceListValue(value = "34", title = "Mercedes Benz"),
			@ChoiceListValue(value = "35", title = "Mercury"),
			@ChoiceListValue(value = "36", title = "Mini Cooper"),
			@ChoiceListValue(value = "37", title = "Mitsubishi"),
			@ChoiceListValue(value = "38", title = "Nissan"),
			@ChoiceListValue(value = "39", title = "None"),
			@ChoiceListValue(value = "40", title = "Peugeot"),
			@ChoiceListValue(value = "41", title = "Pontiac"),
			@ChoiceListValue(value = "42", title = "Porsche"),
			@ChoiceListValue(value = "43", title = "Rolls Royce"),
			@ChoiceListValue(value = "44", title = "Saab"),
			@ChoiceListValue(value = "45", title = "Scion"),
			@ChoiceListValue(value = "46", title = "Subaru"),
			@ChoiceListValue(value = "47", title = "Suzuki"),
			@ChoiceListValue(value = "48", title = "Toyota"),
			@ChoiceListValue(value = "49", title = "Volkswagon"),
			@ChoiceListValue(value = "50", title = "Volvo") })
	@FindByLabel(label = "Dealer Nameplates")
	public WebElement Dealer_Nameplates__c;
	@TextType()
	@FindByLabel(label = "Monthly Sales Volume")
	public WebElement MonthlySalesVolume;
	@ButtonType()
	public WebElement CustomConvert;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[4]")
	public WebElement CustomConvert1;


}
