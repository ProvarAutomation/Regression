package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="AccountOverview"                                
     , connection="ServiceTestUser"
     )             
public class AccountOverview {

	@FindBy(linkText = "Account Team")
	@LinkType()
	public WebElement QuicklinkAccountTeam;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedContactList_link')]")
	public WebElement QuicklinkContacts;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedAccountContactRoleList_link')]")
	public WebElement QuickviewContactRoles;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedOpportunityList_link')]")
	public WebElement QuickviewOpportunites;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'00NE0000005D8Hf_link')]")
	public WebElement QuickviewActionPlans;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedCaseList_link')]")
	public WebElement QuickviewCases;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedActivityList_link')]")
	public WebElement QuickviewOpenActivities;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedEntityHistoryList_link')]/span")
	public WebElement QuickviewActivityHistory;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedContractList_link')]")
	public WebElement QuickviewContracts;
	@LinkType()	
	@FindBy(xpath = "//a[contains(@id,'00NE0000002HxLz_link')]")
	public WebElement QuickviewATGProducts;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedNoteList_link')]")
	public WebElement QuickviewNotesAttachments;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'00NE0000005BwnR_link')]")
	public WebElement QuickviewSVOCRequestsFinalAccount;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedEntityHistoryList_link')]")
	public WebElement QuickviewAccountHistory;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'00NM0000001PuSF_link')]")
	public WebElement QuickviewDigitalMediaRequests;
	@LinkType()
	@FindBy(linkText = "G")
	public WebElement g;
	@LinkType()
	@FindBy(linkText = "Request Help w/Salesforce")
	public WebElement requestHelpWSalesforce;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"001E000000mEZZY_00NE0000005Bwnz_link\"]")
	public WebElement sVOCRequestsSourceAccount0;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"msgBox\"]/table/tbody/tr/td[2]/div/div/a")
	public WebElement showAllResults;
	@ChoiceListType()
	@FindBy(name = "fcf")
	public WebElement recentlyViewed;
	@LinkType()
	@FindBy(linkText = "Crown KIA")
	public WebElement crownKIA;
	@ButtonType()
	@FindBy(xpath = "//input[@name=\"create_case_from_account\"]")
	public WebElement createCase;
	@LinkType()
	@FindByLabel(label = "Follow Up Date")
	public WebElement followUpDate;
	@TextType()
	@FindByLabel(label = "Approval Detail")
	public WebElement approvalDetail;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
			
}
