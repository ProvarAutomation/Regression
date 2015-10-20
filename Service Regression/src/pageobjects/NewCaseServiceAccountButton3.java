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
               , connection="Admin"
     )             
public class NewCaseServiceAccountButton3 {

	@LinkType()
	@FindBy(linkText = "Order Entry")
	public WebElement orderEntry;
	
}
