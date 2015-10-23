package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="InsufficientPrivileges"                                
     , summary=""
     , relativeUrl=""
     , connection="AdamGrille"
     )             
public class InsufficientPrivileges {

	@LinkType()
	@FindBy(linkText = "Insufficient Privileges Errors")
	public WebElement insufficientPrivilegesErrors;
			
}
