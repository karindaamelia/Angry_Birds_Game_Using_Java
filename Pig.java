package AngryBird;

public abstract class Pig {
	private int defence;
	private int defHat = 1;
	private int defHarness = 2;	
	
	public Pig() {
		this.defence = 1;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public int getDefHat() {
		return this.defHat;
	}
	
	public int getDefHarness() {
		return this.defHarness;
	}
	
	public void display() {
		System.out.println("Kekuatan pertahanan Babi " + this.defence);
	}
}
