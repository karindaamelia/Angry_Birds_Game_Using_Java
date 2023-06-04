package AngryBird;

public abstract class Birds implements Skills {
	private String name;
	private int power;

	
	public Birds() {
		this.power = 2;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void display() {
		System.out.println("Bird Power " + this.power);
	}
}
