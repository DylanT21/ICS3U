package com.bayviewglen.HorseRacing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HorseRacing {
	public static final int NAME = 0;
	public static final int WALLET = 1;
	public static final int BET = 2;
	public static final int HORSE = 3;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("Horse Racing Input/playerData.dat"));

		int numPlayers = Integer.parseInt(scanner.nextLine());
		String[][] playerInfo = new String[numPlayers][4];
		getplayers(playerInfo, scanner);

		Scanner userInput = new Scanner(System.in);
		String[] horses = getHorses();
		//getPlayerHorse(userInput, horses );
		raceHorses(horses, horses);
		getPlayerBet(userInput, playerInfo);
		chooseHorses();

	}

	private static void chooseHorses() {
		// TODO Auto-generated method stub

	}

	private static void getplayers(String[][] playerInfo, Scanner scanner) {
		for (int i = 0; i < playerInfo.length; i++) {
			String temp = scanner.nextLine();
			playerInfo[i][NAME] = temp.split(" ")[NAME];
			playerInfo[i][WALLET] = temp.split(" ")[WALLET];

		}

	}

	public static String[] getNames(String[][] playerInfo) {
		String[] names = null;
		try {
			Scanner scanner = new Scanner(new File("Horse Racing Input/playerData.dat"));
			int numPlayers = Integer.parseInt(scanner.nextLine());
			names = new String[numPlayers];

			for (int i = 0; i < numPlayers; i++) {
				names[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return names;
	}

	public static String[] getHorses() {
		String[] horses = null;
		try {
			Scanner scanner = new Scanner(new File("Horse Racing Input/horseData.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return horses;
	}

	public static boolean alreadyInRace(String horse, String[] horsesInRace) {

		for (int i = 0; i < horsesInRace.length; i++) {
			if (horsesInRace[i].equalsIgnoreCase(horse)) {
				return true;
			}
		}

		return false;
	}

	private static String getPlayerBet(Scanner userInput, String[][] playerInfo) {
		for (int i = 0; i < playerInfo.length; i++) {
			
			
			boolean validBet = false;
			boolean validInput = false;
			String bet = "";

			while (!validBet) {
				while (!validInput) {
					System.out.println("Hello " + playerInfo[i][NAME] + ", How much would you like to bet? You Have Currently: $" + playerInfo[i][WALLET] + " in your bank.");
					bet = userInput.nextLine();

					try {
						int number = Integer.parseInt(bet);
						validInput = true;
					} catch (NumberFormatException ex) {
						System.out.println(bet + " is not a number on earth in any language.");
					}
				}

				if (Integer.parseInt(bet) < 0) {
					System.out.println("Not a valid bet try again: ");
					validInput = false;
				} else if (Integer.parseInt(bet) > Integer.parseInt(playerInfo[i][WALLET])) {
					validInput = false;
					System.out.println("You're too poor, either get more money or try again: ");
				} else {
					int tempBet = Integer.parseInt(bet);
					playerInfo[i][BET] = Integer.toString(tempBet);
					int tempWallet = Integer.parseInt(playerInfo[i][WALLET]);
					tempWallet -= Integer.parseInt(bet);
					playerInfo[i][WALLET] = Integer.toString(tempWallet);
					validBet = true;
					System.out.println("You have bet $" + playerInfo[i][BET] + " and have $" + playerInfo[i][WALLET] + " left");
					return playerInfo[i][BET];
					
				}
			}
			i++;
			
		}
		return null;

	}

	private static String[] raceHorses(String[] horses, String[] numHorses) {
		int numberOfHorses = (int) (Math.random() * 8) + 4;
		String[] raceHorses = new String[numberOfHorses];
		for (int i = 0; i < numberOfHorses; i++) {
			int randomHorse = (int) (Math.random() * horses.length) + 1;
			horses[i] = numHorses[randomHorse];
			System.out.println(horses[i]);

		}

		return horses;

	}

}
