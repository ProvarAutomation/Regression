package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityCreate"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class OpportunityCreate {

	@TextType()
	@FindBy(id = "errorDiv_ep")
	public WebElement pageErrors;
	@BooleanType()
	@FindBy(id = "01uE0000004UbZb")
	public WebElement select;
			
}
