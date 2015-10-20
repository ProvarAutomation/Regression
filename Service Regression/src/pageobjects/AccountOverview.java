package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="AccountOverview"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class AccountOverview {

	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'RelatedAccountSalesTeam_link')]")
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
	@FindBy(xpath = "//a[contains(@id,'RelatedHistoryList_link')]")
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
			
}