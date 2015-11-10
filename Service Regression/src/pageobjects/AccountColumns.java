package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="AccountColumns"                                
     , summary=""
     , relativeUrl=""
     , connection="ServiceTestUser"
     )             
public class AccountColumns {

	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[3]/div")
	public WebElement Column1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[4]/div")
	public WebElement Column2;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[5]/div")
	public WebElement Column3;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[6]/div")
	public WebElement Column4;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[7]/div")
	public WebElement Column5;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[8]/div")
	public WebElement Column6;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[9]/div")
	public WebElement Column7;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[10]/div")
	public WebElement Column8;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[11]/div")
	public WebElement Column9;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[12]/div")
	public WebElement Column10;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[13]/div")
	public WebElement Column11;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[14]/div")
	public WebElement Column12;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[15]/div")
	public WebElement Column13;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[16]/div")
	public WebElement Column14;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen16\"]/div/table/thead/tr/td[17]/div")
	public WebElement Column15;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"001E000000mERcs_RelatedCaseList_body\"]/table/tbody/tr[2]/td[1]/a[1]")
	public WebElement Edit;
	@TextType()
	@FindBy(xpath = "//*[@id=\"500E000000IoJle_RelatedEntityHistoryList_body\"]/table/tbody/tr[2]/td[3]")
	public WebElement Action;
			
}
