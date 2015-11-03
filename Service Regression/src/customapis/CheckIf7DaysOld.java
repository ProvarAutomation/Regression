package customapis;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

@TestApi( title="Check If 7 Days Old"
        , summary="Checks to see if a date submitted is 7 days or more in the past"
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"My Test APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class CheckIf7DaysOld {
    
    @TestApiParameter(seq=1, 
            summary="Submitted date",
            remarks="The date you want to check",
            mandatory=true,
            parameterGroup="inputs")
    public String oldDateString;
    
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

    	// Put our implementation logic here.
    	String oldDateString2 = oldDateString.substring(0, oldDateString.indexOf(' '));
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    	Date oldDate = null;
    	try {
			oldDate = sdf.parse(oldDateString2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	long oldMs = oldDate.getTime();
    	long currentMs = System.currentTimeMillis();
    	
    	Boolean testResult = false;
    	if((currentMs - oldMs) > 6.048e8) {
    		testResult = true;
    	}
    	
        // Store the result (if appropriate).
    	String dummyResult = this.getClass().getName() + " result";
        testExecutionContext.setValue(resultName, testResult, resultScope);
        
    }
    
}
