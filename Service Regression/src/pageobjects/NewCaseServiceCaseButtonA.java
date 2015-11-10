package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="NewCaseServiceCaseButtonA"
               , namespacePrefix=""
               , object="Case"
               , connection="ServiceUser"
     )             
public class NewCaseServiceCaseButtonA {

	@LinkType()
	@FindBy(linkText = "DS Emails")
	public WebElement dSEmails;
	
}
