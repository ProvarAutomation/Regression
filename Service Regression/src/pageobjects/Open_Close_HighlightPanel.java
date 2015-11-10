package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Open_ Close_ Highlight Panel"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class Open_Close_HighlightPanel {

	@LinkType()
	@FindBy(xpath="(//div[contains(@class,'layout-mini')])[2]")
	public WebElement openHighlighPanel;
	
	@LinkType()
	@FindBy(xpath="(//div[contains(@class,'layout-mini')])[1]")
	public WebElement closeHighlighPanel;
	
	@TextType
	@FindBy(xpath="//*[@id=\"ext-gen218\"]")
	public WebElement SVOCMasterId;
			
}
