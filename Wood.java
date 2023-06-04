package AngryBird;

public class Wood extends Structure {
	
	private int endurance = 2;
	private String name = "Kayu"; 
	private String color = "Coklat";
	
	public int totalEndurance() {
		return super.getEndurance() + this.endurance;
	}
	
	@Override
	public void display() {
		System.out.println("Nama\t: " + this.name);
		System.out.println("Warna\t: " + this.color);
		System.out.println("Ketahanan : " + totalEndurance());
	}
}
