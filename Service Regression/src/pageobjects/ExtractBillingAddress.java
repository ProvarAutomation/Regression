package pageobjects;

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
	
	@TextType()
	@FindBy(xpath="((//td[text()='Shipping Address']/following-sibling::td)[1]//tr)[1]")
	public WebElement ShippingAdress;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[1]")
	public WebElement AUTOTRADER;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[2]")
	public WebElement HomeNet;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[3]")
	public WebElement KBB;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[4]")
	public WebElement vAuto1;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[5]")
	public WebElement VinSolutions;

	@TextType()
	@FindBy(xpath = "//*[@id=\"00NE0000002KBcZ_ileinner\"]/img[6]")
	public WebElement AUTO_TIM;

	@LinkType()
	@FindBy(linkText = "INV Tech Support")
	public WebElement iNVTechSupport;
	
	@LinkType()
	@FindBy(linkText = "Inventory")
	public WebElement Inventory;
	
	@LinkType()
	@FindBy(xpath = "//*[@id=\"lookup500M0000005qPdGcas28\"]")
	public WebElement parentCase;

	@LinkType()
	@FindBy(linkText = "Show all results")
	public WebElement Show_all_results;

	@LinkType()
	@FindBy(xpath = "//*[@id=\"msgBox\"]/table/tbody/tr/td[2]/div/div/a")
	public WebElement Show_all_results1;

	@TextType()
	@FindBy(xpath = "//*[@id=\"500M0000006bf6g_RelatedEntityHistoryList_body\"]/table/tbody/tr[2]/td[3]")
	public WebElement Actor_Name;

	@LinkType()
	@FindBy(xpath = "//*[@id=\"cas28_ileinner\"]/a")
	public WebElement _00268423;

	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//*[@id=\"500M0000006bl7B_RelatedEntityHistoryList_body\"]/table/tbody/tr[2]/td[3]")
	public WebElement Action;

	@ChoiceListType(multipleSelectionString = true)
	@FindBy(xpath = "//*[@id=\"ext-gen33\"]")
	public WebElement Comment;
			
}
