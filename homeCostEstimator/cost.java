package epam;

public class cost {

	public double costEstimation(int materialType,boolean isAutomated, double areaOfHouse) 
	{
		int cost = 0;
		if(materialType==0)
			cost = 1200;
		else if(materialType==1)
			cost = 1500;
		else if(materialType==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return areaOfHouse*cost;
	}
}
