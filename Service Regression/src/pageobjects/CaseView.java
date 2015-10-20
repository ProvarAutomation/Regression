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

	@TextType(maxLength = 100)
	@FindBy(xpath = "//*[@id=\"00NE0000005Bwf0_ileinner\"]")
	public WebElement SVOC_Id__c;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"cas28_ileinner\"]/a")
	public WebElement Parent_Case;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"massActionForm_001E000000mEZZY_RelatedCaseList\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement Create_Case_from_account;
			
}
