package pageobjects;

import org.openqa.selenium.WebElement;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="AccountHierarchyPage"
               , namespacePrefix=""
               , object="account"
               , connection="ServiceUser"
     )             
public class AccountHierarchyPage {

	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='hierarchyResultsPanel']")
	public WebElement hierarchyResultsPanel;
	@ChoiceListType(values = { @ChoiceListValue(value = "Bill To"),
			@ChoiceListValue(value = "Business"),
			@ChoiceListValue(value = "Primary to Secondary") })
	@VisualforceBy(componentXPath = "apex:selectList[@id='ddHierarchyTypeList']")
	public WebElement hierarchyType;
	@ChoiceListType(values = { @ChoiceListValue(value = "Bill To"),
			@ChoiceListValue(value = "Business"),
			@ChoiceListValue(value = "Primary to Secondary") })
	@VisualforceBy(componentXPath = "apex:selectList[@id='ddHierarchyTypeList']")
	public WebElement hierarchyType1;
	
}
