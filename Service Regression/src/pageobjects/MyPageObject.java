package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//*[@id=\"crmForm\"]/table/tbody/tr[6]/td[2]")
	public WebElement CRM;
			
}
