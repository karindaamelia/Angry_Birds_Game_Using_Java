package AngryBird;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner userInput = new Scanner(System.in);
	
	static ArrayList<String> bird = new ArrayList<String>();

	static RedBird red = new RedBird();
	static ChuckBirds chuck = new ChuckBirds();
	static TheBluesBird blues = new TheBluesBird();
	static BombBird bomb = new BombBird();
	static MatildaBird matilda = new MatildaBird();

	static KingPig king = new KingPig();
	static AdultPig adult = new AdultPig();
	static ChildPig child = new ChildPig();

	static Wood wood = new Wood();
	static Glass glass = new Glass();
	static Stone stone = new Stone();

	static int totalDefEnemies;
	
	public static void main(String[] args) throws IOException {
		
		String choose1;
		boolean start = true;
        
        System.out.println("==================================");
        System.out.println("||  WELCOME TO THE ANGRY BIRDS  ||");
        System.out.println("==================================");
        
        System.out.println("\nAre you ready to start this game ??? (Y/N)");
		System.out.println("\t(Y) --> YES");
		System.out.println("\t(N) --> NO");
		
		while(start == true) {
			System.out.print("\nEnter your Choise : ");
			choose1 = userInput.next();
			System.out.println();
			
			if(choose1.equalsIgnoreCase("Y")) {
				System.out.println();
				Player.askName();
				
				pickingEnemies();

				Birds();
				
				System.out.println("\nApakah kamu ingin memulai serangan? (y/n)");
				String yn = userInput.next();
				
				if (yn.equalsIgnoreCase("y")) {
					gameON();
				} else if(yn.equalsIgnoreCase("n")) {
					System.out.println("Sampai Jumpa");
				} else {
					System.out.println("Harusnya kamu memilih dengan benar, sampai jumpa!");
				}
				
				start = false;
				
			} else if(choose1.equalsIgnoreCase("N")) {
				System.out.println("\n===== THANK YOU ^_^ =====");
				start = false;
				break;
			} else {
				System.err.println("\nThis option is not available");
				System.out.println("Please enter again!! ");
			}
		}
	}
	
	public static void Birds() {

		System.out.println("===== ListBird =====");
		System.out.println("1. Red Bird");
		System.out.println("2. Chuck Bird");
		System.out.println("3. Blues Bird");
		System.out.println("4. Bomb Bird");
		System.out.println("5. Matilda Bird\n");
		int choosen;
		for (int i = 0; i < 4; i++) {
			System.out.print("Pilih : ");
			choosen = userInput.nextInt();
			if (choosen >= 1 && choosen <= 5) {
				choosenBird(choosen);
			} else {
				System.out.println("Salah Pilih!");
				i -= 1;
			}
		}

		System.out.println("\nTim Angry Birds : ");
		for (int i = 0; i < 4; i++) {
			System.out.println((i+1) + ". " + bird.get(i));
		}
	}
	
	public static void pickingEnemies() {
		king.display();
		int defKing = randomEnemies(king.totalDef(), wood.totalEndurance(), glass.totalEndurance(),
				stone.totalEndurance());
		displayEnemies(king.getName(), defKing);

		adult.display();
		int defAdult = randomEnemies(adult.totalDef(), wood.totalEndurance(), glass.totalEndurance(),
				stone.totalEndurance());
		displayEnemies(adult.getName(), defAdult);

		child.display();
		int defChild = randomEnemies(child.totalDef(), wood.totalEndurance(), glass.totalEndurance(),
				stone.totalEndurance());
		displayEnemies(child.getName(), defChild);

		totalDefEnemies = defKing + defAdult + defChild;
		System.out.println("\nTotal Kekuatan Pertahanan : " + totalDefEnemies);
	}
	
	public static void gameON() {
		
		System.out.println("\n======= PENYERANGAN =======");
		int defensePower = totalDefEnemies;
		
		for (int i = 0; i < bird.size(); i++) {
			if (defensePower > 0) {
				if (bird.get(i) == "Red") {
					red.displayAttack(defensePower);
					defensePower -= red.birdSkill();
				} else if (bird.get(i) == "Chuck") {
					chuck.displayAttack(defensePower);
					defensePower -= chuck.birdSkill();
				} else if (bird.get(i) == "Blues") {
					blues.displayAttack(defensePower);
					defensePower -= blues.birdSkill();
				} else if (bird.get(i) == "Bomb") {
					bomb.displayAttack(defensePower);
					defensePower -= bomb.birdSkill();
				} else if (bird.get(i) == "Matilda") {
					matilda.displayAttack(defensePower);
					defensePower -= matilda.birdSkill();
				}
			} else {
				i = 10;
			}
		}
		
		if (defensePower <= 0) {
			System.out.println("\n======= ANGRY BIRDS WIN =======");
		} else {
			System.out.println("\n======= PIGGIES WIN =======");
		}
	}

	public static void choosenBird(int x) {
		if (x == 1) {
			bird.add(red.getName());
		} else if (x == 2) {
			bird.add("Chuck");
		} else if (x == 3) {
			bird.add("Blues");
		} else if (x == 4) {
			bird.add("Bomb");
		} else if (x == 5) {
			bird.add("Matilda");
		}
	}

	public static int randomEnemies(int a, int x, int y, int z) {
		int defTotal;
		ArrayList<Integer> my_list = new ArrayList<Integer>();

		my_list.add(x);
		my_list.add(y);
		my_list.add(z);

		int index = 0;

		for (int i = 0; i < my_list.size(); i++) {
			index = (int) (Math.random() * my_list.size());

		}

		defTotal = a + my_list.get(index);

		return defTotal;
	}

	public static void displayEnemies(String name, int def) {
		if (name == "Raja Babi") {
			if (def == 6) {
				System.out.println("Raja Babi yang dilindungi Kayu berwarna coklat, Kekuatan pertahanan : " + def);
			} else if (def == 5) {
				System.out.println("Raja Babi yang dilindungi Kaca berwarna biru, Kekuatan pertahanan : " + def);
			} else if (def == 7) {
				System.out.println("Raja Babi yang dilindungi Batu berwarna abu, Kekuatan pertahanan : " + def);
			}
		} else if (name == "Babi Dewasa") {
			if (def == 5) {
				System.out.println("Babi Dewasa yang dilindungi Kayu berwarna coklat, Kekuatan pertahanan : " + def);
			} else if (def == 4) {
				System.out.println("Babi Dewasa yang dilindungi Kaca berwarna biru, Kekuatan pertahanan : " + def);
			} else if (def == 6) {
				System.out.println("Babi Dewasa yang dilindungi Batu abu, Kekuatan pertahanan : " + def);
			}
		} else if (name == "Anak Babi") {
			if (def == 3) {
				System.out.println("Anak Babi yang dilindungi Kayu, Kekuatan pertahanan : " + def);
			} else if (def == 2) {
				System.out.println("Anak Babi yang dilindungi Kaca, Kekuatan pertahanan : " + def);
			} else if (def == 4) {
				System.out.println("Anak Babi yang dilindungi Batu, Kekuatan pertahanan : " + def);
			}
		}
	}
	
	
	
}
