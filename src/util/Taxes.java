package util;

import java.util.ArrayList;

import entities.TaxPayer;

public class Taxes {
	
	public static void taxPayers(ArrayList <TaxPayer> list) {
		System.out.println("TAXES PAID:"); 
		for(TaxPayer p : list) {
			System.out.println(p);
		}
	}
	
	public static void totalTaxes(ArrayList <TaxPayer> list) {
		Double sum = 0.0;
		for(TaxPayer p : list) {
			sum += p.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $" +String.format("%.2f", sum));  //97000.00
	}

}
