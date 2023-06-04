package AngryBird;

public class Glass extends Structure {
	
	private int endurance = 1;
	private String name = "Kaca"; 
	private String color = "Biru";
	
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
