package AngryBird;

public class Stone extends Structure {
	
	private int endurance = 3;
	private String name = "Batu"; 
	private String color = "Abu";
	
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
