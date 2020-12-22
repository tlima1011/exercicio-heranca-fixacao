package entities;

public class Company extends TaxPayer{
	
	//Atributos 
	private Integer numberEmployees;
	//Construtores
	public Company() {
		
	}
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	//Getters and Setters 
	public Integer getNumberEmployees() {
		return numberEmployees;
	}
	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	//Métodos para calculo de imposto dentro de Company 
	@Override
	public double tax() {
		Double tax = this.getAnualIncome() * 0.16;  
		if(this.numberEmployees > 10) {
			tax = this.getAnualIncome() * 0.14;
		}
		return tax; 
	}
	
	public String toString() { 
		StringBuilder sb = new StringBuilder(); 
		sb.append(super.toString());
		sb.append(": $" +String.format("%.2f", this.tax()));
		return sb.toString(); 
	}
}
