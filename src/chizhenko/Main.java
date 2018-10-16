package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int module;
		int currentModule;
		int currentPlase;
		int row;
		
		System.out.println("Enter the width of the clock (odd)");
		num = sc.nextInt();
		sc.close();
		module = (int) (num / 2) + 1;
		
		if (num%2==0) {
			System.out.println("the entered width is even");
			return;
		}
		
		row = 1;
		currentPlase = 1;
		currentModule = module;
		do {
			
			if (Math.abs(currentPlase - module) < currentModule) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			};
			
			currentPlase = currentPlase + 1;
			
			if (currentPlase > num) {
				currentPlase = 1;
				System.out.println();
				
				if (row < module) {
					currentModule = currentModule - 1;
				} else {
					currentModule = currentModule + 1;
				}
				
				row = row + 1;
			};
			
			
		} while (row <= num);
	}

}
