package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Case View"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class CaseView {

	@PageTable(row = CaseHistory.class,firstRowContainsHeaders=true)
	@FindBy(xpath = "//div[contains(@class,'noStandardTab')]//tr[contains(@class, 'dataRow') and not(contains(@class, 'extraRow'))]")
	public List<CaseHistory> CaseHistoryTable;
	
	@PageRow()
	public static class CaseHistory {

		@TextType()
		@FindBy(xpath = "td[3]")
		public WebElement Action;
		

	}
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//*[@id=\"ClosedDate_ileinner\"]")
	public WebElement DateTimeClosed;
	@TextType(maxLength = 100)
	@FindBy(xpath = "//*[@id=\"00NE0000005Bwf0_ileinner\"]")
	public WebElement SVOC_Id__c;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"cas28_ileinner\"]/a")
	public WebElement Parent_Case;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"massActionForm_001E000000mEZZY_RelatedCaseList\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement Create_Case_from_account;
	@LinkType()
	@FindBy(linkText = "Show all results")
	public WebElement showAllResults;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"msgBox\"]/table/tbody/tr/td[2]/div/div/a")
	public WebElement showAllResults1;
	@LinkType()
	@FindBy(linkText = "Show all results")
	public WebElement showAllResults2;
	@TextType()
	@FindBy(xpath = "//*[@id=\"newOwn_mlktp\"]")
	public WebElement User_Queue;
	@LinkType()
	@FindBy(id = "nextApp_lkwgt")
	public WebElement UserLookup;
	@ButtonType()
	@FindByLabel(label = "Send to Next Approver")
	public WebElement sendToNextApprover;
	@LinkType()
	@FindByLabel(label = "Send an Email")
	public WebElement Send_an_Email;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"500M0000006Y9ed_RelatedEmailMessageList\"]/div[1]/div/div[1]/table/tbody/tr/td[2]/input")
	public WebElement sendAnEmail;
	@ButtonType()
	@FindBy(name = "newEmail")
	public WebElement sendAnEmail1;
	@LinkType()
	@FindBy(id = "nextApp_lkwgt")
	public WebElement LookUp;
	@ButtonType()
	@FindByLabel(label = "Send to Next Approver")
	public WebElement sendToNextApprover1;
	@ButtonType()
	@FindByLabel(label = " View ")
	public WebElement view;
	@LinkType()
	@FindBy(linkText = "#1 Power GM")
	public WebElement AccountId;
	@TextType()
	@FindBy(xpath = "//*[@id=\"cas1_ileinner\"]/a")
	public WebElement Change_Case_Owner;
	@LinkType()
	@FindBy(id = "newOwn_lkwgt")
	public WebElement newOwner;
	@TextType()
	@FindByLabel(label = "Parent Case")
	public WebElement parentCase;
			
}
