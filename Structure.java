package AngryBird;

public abstract class Structure {
	
	private static int endurance;
	
	public Structure() {
		this.endurance = 0;
	}
	
	public void display() {
		System.out.println("Ketahanan : " + this.endurance);
	}
	
	public static int getEndurance() {
		return endurance;
	}
    

}
