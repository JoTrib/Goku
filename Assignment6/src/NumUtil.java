
public class NumUtil {
	
	static  double getpower(double x,int n) {
		double sum=0;
		while(n!=0) {
			
			sum+=x*x;
			n--;
			
		}
		return sum;
	}
	static long getFactorial(int num)
	{
		int result=1;
		for(int i=1;i<num;i++) {
			
			result+=result*i;
			
		}
		return result;
		
	}
	
	
}
