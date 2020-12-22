package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		ArrayList <Player> list = new ArrayList<>(); 

		System.out.print("Enter the number of tax payers: "); 
		int n = sc.nextInt();
		
		for(int i = 0; i < n;i++) {
				sc.nextLine(); 
				System.out.println("Tax payer #" + (i + 1) +" data: ");
				System.out.print("Individual or company (i/c)? ");
				Character type = sc.nextLine().charAt(0);
				type = Character.toUpperCase(type); 
				System.out.print("Name: ");
				String name = sc.nextLine(); 
				System.out.print("Anual income: "); 
				Double income = sc.nextDouble(); 
				if(type.equals('I')) {
					System.out.print("Health expenditures: ");
					Double healthExpenditures = sc.nextDouble(); 
					list.add(new Individual(name, income, healthExpenditures)); 
				}else {
					System.out.print("Number of employees: ");
					Integer numberEmployees = sc.nextInt(); 
					list.add(new Company(name, income, numberEmployees));
				}
		}
		System.out.println();
		System.out.println("TAXES PAID:"); 
		Double sum = 0.0; 
		for(Player p : list) {
			System.out.println(p);
			sum += p.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $" +String.format("%.2f", sum));  //97000.00
		sc.close();
	}
}
