
package commands.demo;
import java.util.Scanner;

public class ElectricityBill {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Units;	
		double Total_Amount;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
		Total_Amount = Electricity(Units);
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}
	public static double Electricity(int Units)
	{
		double Amount, Sur_Charge, Total_Amount;
		if (Units < 30)
	  	{
	        Amount = Units * 2.50;
	  		Sur_Charge = 25;  	
	  	} 
	  	else if (Units>31&&Units <= 100)
	  	{
	  		Amount = Units * 3.5;
	  		Sur_Charge = 35; 	
	  	}
	  	else if (Units>=71)
	  	{
	  		Amount = Units *4.5;
	  		Sur_Charge = 45; 	
	  	}
	  	else
	  	{
		   	Amount = Units* 7.75; 
		   	Sur_Charge = 55; 
		}
		
		Total_Amount = Amount + Sur_Charge;
		return Total_Amount;
	}
}