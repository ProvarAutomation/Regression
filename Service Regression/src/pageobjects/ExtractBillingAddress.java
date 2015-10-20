package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Extract Billing Address"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class ExtractBillingAddress {

/**
	@FindBy(xpath="//iframe[contains(@src,'001c000000kC6vH')]")
	public Frame1 frame;
	
	@PageFrame()
	public static class Frame1 {
	@TextType()
	@FindBy(xpath="((//td[text()='Billing Address']/following-sibling::td)[1]//tr)[1]")
	public WebElement BillingAdress;
	}  **/
	
	@TextType()
	@FindBy(xpath="((//td[text()='Billing Address']/following-sibling::td)[1]//tr)[1]")
	public WebElement BillingAdress;
			
}
