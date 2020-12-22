package entities;

public abstract class TaxPayer {
	
	//Atributos 
	private String name; 
	private Double anualIncome; 
	//Construtor
	public TaxPayer() {
		
	}
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	//Getters and Setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	//Métodos abstratos 
	public abstract double tax(); 
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(this.name); 
		return sb.toString();
	}
}
