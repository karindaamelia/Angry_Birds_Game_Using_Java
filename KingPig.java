package AngryBird;

import java.util.ArrayList;

public class KingPig extends Pig {
	private String name = "Raja Babi";
	private Glass glass;
	private Wood wood;
	private Stone stone;
	
	public int totalDef() {
		return super.getDefence() + super.getDefHarness() + super.getDefHat();
	}
	
	@Override
	public void display() {
		System.out.println("Nama\t: " + this.name + "\nDefense : " + totalDef());
	}
	
	public String getName() {
		return this.name;
	}
}
