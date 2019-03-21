package epam;

public class calculator {

	public int addition(int x,int y)
	{
		return x+y;
	}
	public int multiplication(int x,int y)
	{
		return x*y;
	}
	public float division(float x,float y)
	{
		if(y!=0)
			return x/y;
		else
			throw new ArithmeticException("Divising by Zero");
	}
}
