package entities;

public abstract class Player {
	
	//Atributos 
	private String name; 
	private Double anualIncome; 
	//Construtor
	public Player() {
		
	}
	public Player(String name, Double anualIncome) {
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
	//M�todos abstratos 
	public abstract double tax(); 
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(this.name); 
		return sb.toString();
	}
}
