package entities;

public class Individual extends TaxPayer{
	
	//Atributos 
	private Double healthExpenditures;
	//Construtores
	public Individual() {
		
	}
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	//Getters and Setters 
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	//Método de cálculo de imposto de Individual 
	@Override
	public double tax() {
		Double tax = (this.getAnualIncome() * 0.25) - (this.healthExpenditures * 0.5);
		if(this.getAnualIncome() < 20000) {
			tax = this.getAnualIncome() * 0.15;
		}
		return tax; 
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(super.toString());
		sb.append(": $" +String.format("%.2f", this.tax()));
		return sb.toString(); 
	}
	
}
