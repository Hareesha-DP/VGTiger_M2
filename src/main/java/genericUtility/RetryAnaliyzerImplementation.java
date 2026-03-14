package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnaliyzerImplementation implements IRetryAnalyzer {
	
	int count = 1;
	int maxCount = 4;			//after analyzing manually

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		//1<=4 --->true . retry..........2<=4 ---->true , retry.....
		//4<=4 --->true , retry ........5<=4 -----> false , stop retry
		while(count <= maxCount) {
			count++;
			return true;
		}
		
		return false;
	}
	
	

}
