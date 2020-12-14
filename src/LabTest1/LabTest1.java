package LabTest1;

import java.util.Scanner;

public class LabTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner (System.in);
		
		//1
		System.out.println("1.");
		System.out.print("Enter the number of items: ");
		int num = in.nextInt();
		
		System.out.print("Enter price of first item: RM");
		int item1 = in.nextInt();
		
		System.out.print("Enter quantity of first item: ");
		int quantity1 = in.nextInt();
		
		System.out.println();
		
		System.out.print("Enter price of second item: RM");
		int item2 = in.nextInt();
		
		System.out.print("Enter quantity of second item: ");
		int quantity2 = in.nextInt();
		
		System.out.println();
		
		System.out.print("Enter price of third item: RM");
		int item3 = in.nextInt();
		
		System.out.print("Enter quantity of third item: ");
		int quantity3 = in.nextInt();
		
		System.out.println();
		
		int total1 = item1 * quantity1;	
		int total2 = item2 * quantity2;
		int total3 = item3 * quantity3;
		
		double totalAll = total1 + total2 + total3;
		System.out.printf("Total price\t\t: RM%.2f" , totalAll);
		
		
		if(totalAll >= 100) {
			double discount = totalAll * 0.2;
			System.out.printf("\nDiscount received\t: RM%.2f" , discount);
		}
		
		if(totalAll <= 100) {
			double discount = totalAll * 0.1;
			System.out.printf("\nDiscount received\t: RM%.2f" , discount);
		}
		
		
		if(totalAll >= 100 ) {
			double price = totalAll - (totalAll*0.2);
			System.out.printf("\nPrice to be paid\t: RM%.2f" , price);
		}
		
		if(totalAll <= 100) {
			double price = totalAll - (totalAll*0.1);
			System.out.printf("\nPrice to be paid\t: RM%.2f" , price);
		}
		
		System.out.println();
		
		//2
		System.out.println("\n2.");
		
		System.out.print("Enter sales\t\t: RM");
		int sales = in.nextInt();
		
		System.out.print("Enter hours worked\t: ");
		int hours = in.nextInt();

		if(sales >= 150 && sales <= 300) {
			double commission = sales * 0.05;
			System.out.printf("\nCommission\t\t: RM%.2f" , commission);
		}
		
		if(sales >= 301 && sales <= 500) {
			double commission = sales * 0.10;
			System.out.printf("\nCommission\t\t: RM%.2f" , commission);
		}
		
		if(sales > 500) {
			double commission = sales * 0.15;
			System.out.printf("\nCommission\t\t: RM%.2f" , commission);
		}
		
		if(sales >= 150 && sales <= 300) {
			double wages = (sales * 0.05) + (hours * 5);
			System.out.printf("\nDaily wages\t\t: RM%.2f" , wages);
		}
		
		if(sales >= 301 && sales <= 500) {
			double wages = (sales * 0.10) + (hours * 5);
			System.out.printf("\nDaily wages\t\t: RM%.2f" , wages);
		}
		
		if(sales > 500) {
			double wages = (sales * 0.15) + (hours * 5);
			System.out.printf("\nDaily wages\t\t: RM%.2f" , wages);
		}

	}

}
