package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="LeadConvert"                                
     , summary=""
     , relativeUrl=""
     , connection="AdamGrille"
     )             
public class LeadConvert {

	@FindByLabel(label = "Convert")
	@ButtonType()
	public WebElement CustomConvert;
			
}
