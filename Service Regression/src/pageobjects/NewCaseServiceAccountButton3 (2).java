package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="NewCaseServiceAccountButton3"
               , namespacePrefix=""
               , object="Account"
               , connection="ServiceUser"
     )             
public class NewCaseServiceAccountButton3 {

	@LinkType()
	@FindBy(linkText = "Cancellation")
	public WebElement cancellation;
	@LinkType()
	@FindBy(linkText = "Collections")
	public WebElement collections;
	@LinkType()
	@FindBy(linkText = "Collections")
	public WebElement collections1;
	
}
