package AngryBird;

public class MatildaBird extends Birds {
	
private String name = "Matilda";
	
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
		return super.getPower() + 3;
	}
	
	@Override
	public void displaySkill() {
		System.out.println("Matilda menyerang dan menjatuhkan telur, "
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
