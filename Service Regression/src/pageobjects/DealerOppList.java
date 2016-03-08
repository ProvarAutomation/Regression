package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="DealerOppList"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class DealerOppList {

	@FindBy(className = "DateElement")
	@TextType()
	public WebElement CloseDate;
	@LinkType()
	@FindBy(xpath = "//tr[15]//a[2]")
	public WebElement del;
			
}
