package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="HomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="AdamGrille"
     )             
public class HomePage {

	@LinkType()
	@FindBy(linkText = "Request Help w/Salesforce")
	public WebElement requestHelpWSalesforce;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
			
}
