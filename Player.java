package AngryBird;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {
	
	public static void askName() {
		System.out.println("------------------------------");
		System.out.println("|   Welcome To The Angry Bird   |");
		System.out.println("------------------------------");
		System.out.print("\nHi, Before starting this game, Please enter your name : ");
		String name = input();
		System.out.println("===>> Hi " + name + ", Enjoy this game ^_^");
		System.out.println("\n\n======= GAME ON =======\n");
	}
	
	private static String input() {
		String userInput = " ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			userInput = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInput;
	}
	
}
