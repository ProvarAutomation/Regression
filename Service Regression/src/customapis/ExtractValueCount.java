package customapis;


import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.model.base.java.NamedValueListValueImpl;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Extract Count from NamedValueListValueImpl"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"My Test APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class ExtractValueCount {
    
    @TestApiParameter(seq=1, 
            summary="NamedValueListValueImpl ",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public NamedValueListValueImpl param;
    
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
//    	Integer count = -1;
//    	int result = 0;
    	// Put our implementation logic here.
    	testLogger.info("Hello from " + this.getClass().getName());
    	testLogger.info(param.toString());
    	
    	String iCantBelieveThisHasToBeDoneThisWay = param.toString();
    	String wow = iCantBelieveThisHasToBeDoneThisWay.substring(
    			iCantBelieveThisHasToBeDoneThisWay.indexOf(':') + 1, iCantBelieveThisHasToBeDoneThisWay.indexOf(','));
    	wow = wow.replaceAll("\\s+","");
    	Integer count = Integer.parseInt(wow);
    	testExecutionContext.setValue(resultName, count, resultScope);
//    	if(param.containsKey("valueCount")) {
//    		testLogger.info("NamedValueListValueImpl contains valueCount");
//    		count = (Integer) param.get("valueCount");
//    		result = count;
//    	} else {
//    		testLogger.info("valueCount not found in NameValueListValueImpl");
//    	}
//    	
//        // Store the result (if appropriate).
//    	if(count != -1) {
//    		testExecutionContext.setValue(resultName, result, resultScope);
//    	} else {
//    		testExecutionContext.setValue(resultName, "Error", resultScope);
//    	}
    }
    
}
