package PkgMain;
import java.util.Scanner;


public class cMain{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double Tuit, Perc, TotalCost;
		System.out.println("What is the current cost of tuition at your scool?");
		Tuit = input.nextDouble();
		System.out.println("What is the expected percent increase to tuition per year?");
		Perc= input.nextDouble();
		TotalCost = 0;
		for(int i=1;i<=4;i++){
			TotalCost=TotalCost+Tuit;
			Tuit=Tuit+(Tuit*Perc/100);
		}
		System.out.println("Your total cost for college will be "+TotalCost);
	}
}