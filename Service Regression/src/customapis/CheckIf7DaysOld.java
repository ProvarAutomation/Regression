package customapis;


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

    	int spaceIndex = 0;
    	String oldDateString2 = null, timeStamp = null;
    	Date oldDate = null;
    	long oldMs, currentMs;
    	Boolean testResult;
    	// Put our implementation logic here.
    	testLogger.info("Reading in: " + oldDateString);
    	
    	spaceIndex = oldDateString.indexOf(' ');
    	oldDateString2 = oldDateString.substring(0, spaceIndex);
    	timeStamp = oldDateString.substring(spaceIndex);
    	
    	testLogger.info("Date: " + oldDateString2 +" | Time: " + timeStamp);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    	try {
			oldDate = sdf.parse(oldDateString2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	oldMs = oldDate.getTime() + convertTimeStampToMs(timeStamp);
    	
    	currentMs = System.currentTimeMillis();

    	testLogger.info("Comparing " + oldDate + " to the current time (" + currentMs + ")");
    	
    	testResult = false;
    	testLogger.info(currentMs + " - " + oldMs + " > 1 week (in ms)?");
    	if((currentMs - oldMs) > 6.048e8) {
    		testLogger.info("YES! " + oldDateString2 + " is (more than) a week old");
    		testResult = true;
    	} else {
    		testLogger.info("NO! " + oldDateString2 + " is not a week old");
    		testResult = false;
    		
    	}
    	
        testExecutionContext.setValue(resultName, testResult, resultScope);
        
    }
    
    private long convertTimeStampToMs(String timestamp) {
    	try {
    		SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");
    	    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
    	    
			timestamp = date24Format.format(date12Format.parse(timestamp));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    	
    	long time = 0;
    	int index = timestamp.indexOf(':');
    	time += Integer.parseInt(timestamp.substring(0, index)) * 3.6e+6;
    	time += Integer.parseInt(timestamp.substring(index+1)) * 60000;
    	
    	    	
    	return time;
    }
}
