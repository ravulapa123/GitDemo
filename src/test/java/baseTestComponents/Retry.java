package baseTestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int retrycount = 0;
	int maxreTry = 1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retrycount<maxreTry)
		{
		retrycount++;
		return true;
		
		}
		return false;
	}

}
