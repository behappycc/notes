package GradingSystem;

public class Analysis {
	private int passes = 0;
	private int failure = 0;
	private double f1, f2, f3, f4, f5, max, min= 0;
	
	public Analysis(){
		passes = 0;
		failure = 0;
	}
	
	public Analysis(double s1, double s2, double s3, double s4, double s5){
		f1 = s1;
		f2 = s2;
		f3 = s3;
		f4 = s4;
		f5 = s5;
	}
	
	public double MaxScore(){
		max = f1;
		if(f2>max)
			max=f2;
		if(f3>max)
			max=f3;
		if(f4>max)
			max=f4;
		if(f5>max)
			max=f5;		
		return max;
	}
	
	public double MinScore(){
		min = f1;
		if(f2<min)
			min=f2;
		if(f3<min)
			min=f3;
		if(f4<min)
			min=f4;
		if(f5<min)
			min=f5;		
		return min;
	}
	
	public int statisticsPasses(){
		if(f1>60)
			passes++;
		if(f2>60)
			passes++;
		if(f3>60)
			passes++;
		if(f4>60)
			passes++;
		if(f5>60)
			passes++;
		return passes;
	}
	
	public int statisticsFailure(){
		if(f1<60)
			failure++;
		if(f2<60)
			failure++;
		if(f3<60)
			failure++;
		if(f4<60)
			failure++;
		if(f5<60)
			failure++;
		return failure;
	}
	public void displaymessage(){
		  System.out.println(" Maximum score:" + max);
		  System.out.println(" Minimum score:" + min);
		  System.out.println(" Passed students:" + passes);
		  System.out.println(" Failure students:" + failure);
	  }	 
}
