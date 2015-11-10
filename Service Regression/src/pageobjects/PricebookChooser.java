package pageobjects;

import org.openqa.selenium.WebElement;
import com.provar.core.testapi.annotations.*;

@Page( title="PricebookChooser"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceUser"
     )             
public class PricebookChooser {

	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement CancelInChooser;
			
}
