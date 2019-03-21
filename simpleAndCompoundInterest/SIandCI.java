package epam;
//import java.lang.*;
public class SIandCI {
	

	public double simpleInterest(float principle,float timePeriod,float rateOfIntrest)
	{
		return (principle*timePeriod*rateOfIntrest)/100;
	}
	
	public double compoundInterest(float principle,float timePeriod,float rateOfIntrest)
	{
		return principle* (Math.pow((1 + rateOfIntrest / 100),timePeriod));
	}
}
