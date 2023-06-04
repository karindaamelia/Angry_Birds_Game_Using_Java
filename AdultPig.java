package AngryBird;

public class AdultPig extends Pig{
	
private String name = "Babi Dewasa";
	
	public int totalDef() {
		return super.getDefence() + super.getDefHarness();
	}
	
	@Override
	public void display() {
		System.out.println("Nama\t: " + this.name + "\nDefense : " + totalDef());
	}
	
	public String getName() {
		return this.name;
	}
}
