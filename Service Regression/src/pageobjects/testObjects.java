package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="testObjects"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceTestUser"
     )             
public class testObjects {

	@LinkType()
	@FindBy(linkText = "Opportunity Team[0]")
	public WebElement opportunityTeam0;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"001E000000mERcs_RelatedCaseList_link\"]")
	public WebElement cases;
			
}
