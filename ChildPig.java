package AngryBird;

public class ChildPig extends Pig {
	
private String name = "Anak Babi";
	
	public int totalDef() {
		return super.getDefence();
	}
	
	@Override
	public void display() {
		System.out.println("Nama\t: " + this.name + "\nDefense : " + totalDef());
	}
	
	public String getName() {
		return this.name;
	}

}
