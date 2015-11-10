package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="BUReferralObject"                                
     , summary=""
     , relativeUrl=""
     , connection="AdamGrille"
     )             
public class BUReferralObject {

	@TextType()
	@FindBy(xpath = "//*[@id=\"a0JM0000006hK4l_RelatedEntityHistoryList_body\"]/table/tbody/tr[2]/td[3]")
	public WebElement BUReferralHistoryTableAction;
			
}
