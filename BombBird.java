package AngryBird;

public class BombBird extends Birds {
	
private String name = "Bomb";
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void display() {
		System.out.println("Nama\t: " + this.name + "\nPower\t: " + super.getPower());
	}
	
	@Override
	public int birdSkill() {
		return super.getPower() + 4;
	}
	
	@Override
	public void displaySkill() {
		System.out.println("Bomb menyerang dan meledakkan diri, "
				+ "menghasilkan damage sebesar : "
				+ birdSkill());	
	}
	
	@Override
	public int attack(int enemyDef) {
		int damage = birdSkill();
		int remainHP = enemyDef - damage;
		
		if(remainHP < 1) {
			remainHP = 0;
		}
		
		return remainHP;
		
	}
	
	@Override
	public void displayAttack(int enemyDef) {
		displaySkill();
		
		System.out.println("Kekuatan Pertahanan yang tersisa : " + attack(enemyDef));
	}
}
