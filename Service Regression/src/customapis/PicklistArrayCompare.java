package customapis;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.TestApi;
import com.provar.core.testapi.annotations.TestApiExecutor;
import com.provar.core.testapi.annotations.TestApiParameter;
import com.provar.core.testapi.annotations.TestApiParameterGroup;
import com.provar.core.testapi.annotations.TestApiParameterGroups;
import com.provar.core.testapi.annotations.TestExecutionContext;
import com.provar.core.testapi.annotations.TestLogger;

@TestApi( title="Picklist Array Compare"
        , summary="Check if the inputted picklist options equals the set that was entered in"
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"My Test APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class PicklistArrayCompare {
    
    @TestApiParameter(seq=1, 
            summary="\"Options\" in the picklist",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public String picklistChoices;
    
    @TestApiParameter(seq=2, 
            summary="Values you want to compare against the options in the picklist (CSV)",
            remarks="COMMA SEPARATED",
            mandatory=true,
            parameterGroup="inputs")
    public String expectedChoices;

    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {
    	picklistChoices = picklistChoices.substring(1, picklistChoices.length()-1);
    	
    	picklistChoices = picklistChoices.replaceAll("\\s+", "");
    	expectedChoices = expectedChoices.replaceAll("\\s+", "");
    	
    	
    	String[] p = picklistChoices.split(",");
    	String[] e = expectedChoices.split(",");

    	Arrays.sort(p);
    	Arrays.sort(e);
    	
    	Boolean isSubset = Arrays.equals(p, e);
    	
        testExecutionContext.setValue(resultName, isSubset, resultScope);
        
    }
    
}