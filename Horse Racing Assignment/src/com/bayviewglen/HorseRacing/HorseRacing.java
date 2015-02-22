package com.bayviewglen.HorseRacing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HorseRacing {
	public static final int NAME = 0;
	public static final int WALLET = 1;
	public static final int BET = 2;
	public static final int HORSE = 3;

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
boolean game = false;
while(!game){
		Scanner scanner = new Scanner(new File("Horse Racing Input/playerData.dat"));
		int numPlayers = Integer.parseInt(scanner.nextLine());
		String[][] playerInfo = new String[numPlayers][4];
		getplayers(playerInfo, scanner);
		Scanner userInput = new Scanner(System.in);
		boolean done = false; 
		while(!done)
		{
		String[] horses = getHorses();
		String[] horsesInRace = chooseHorses(userInput, playerInfo, horses);
		getPlayerBet(userInput, playerInfo, horsesInRace);
		startRace(horsesInRace, userInput, playerInfo);
		playAgain(userInput, done, game, playerInfo, numPlayers);
		SaveToFile(playerInfo, numPlayers);
		}
		
	}
	}
		
	

	

	private static void SaveToFile(String[][] playerInfo, int numPlayers) throws UnsupportedEncodingException {
		try {
			   PrintWriter writer = new PrintWriter("Horse Racing Input/playerData.dat");
			    writer.println(numPlayers);
			  
			   for (int i = 0; i < playerInfo.length; i++) {
			    writer.println(playerInfo[i][NAME] + " " + playerInfo[i][WALLET]);
			   }
			   writer.close();
			  } catch (FileNotFoundException e) {
			   
			   e.printStackTrace();
			  }
			 }
		
	





	private static boolean playAgain(Scanner userInput, boolean done, boolean game, String[][]playerInfo,  int numPlayers) {

	      System.out.println("Do you want to play again?");
	      while (true) {
	       String play = userInput.nextLine();
	       if (play.equalsIgnoreCase("yes")) {
	        return false;
	      
	       } else if (play.equalsIgnoreCase("no")) {
	        System.out.println(" Thanks for Playing! ");
	       }
	       try {
			SaveToFile(playerInfo, numPlayers);
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
				done = true;
				game = true;
				
			}
	              }{
	       System.out.print("Yes or no please: ");
	      }

	      
	     
		
	


	private static void startRace(String[] horsesInRace, Scanner userInput, String[][] playerInfo) {
		int temp = 0;
		boolean weather = false;
		while(!weather){
		 int track = ((int)(Math.random()*5)+1);
		 if( track == 1){
			 System.out.println(" ");
		System.out.println(" It is sunny outside,  all is normal");
		weather = true;
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ie) {
		}
		 }else if( track == 2){
			 System.out.println(" ");
			 System.out.println(" It is raining outside and the track is slippery, speed of all horses -1");
			 weather = true;
			 try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {
				}
		 }else if( track == 3){
			 System.out.println(" ");
			 System.out.println(" There is a storm outside! all of the horses are scared, speed of all horses +2");
			 weather = true;
			 try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {
				}
		 }else if( track == 4){
			 System.out.println(" ");
			 System.out.println(" It's quite cold out there! snow covers the ground , speed of all horses -2");
			 weather = true;
			 try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {
				}
		 }else if( track == 5){
			 System.out.println(" ");
			 System.out.println(" A strong crosswind blows against the horses, speed of all horses -1");
			 weather = true;
			 try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {
				}
				}
		
		
		
		
		
		
		System.out.println("The Race will start in:  ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		}
		System.out.println("");
		System.out.println("");
		System.out.println("3");
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		}
		System.out.println("2");
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		}

		System.out.println("1");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ie) {
		}

		
		String[] movement = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
		String Winner = null;
		String[][] raceData = new String[horsesInRace.length][101];
		for (int i = 0; i <= horsesInRace.length - 1; i++) {
			temp = Integer.parseInt(movement[i]);
			raceData[i][temp] = horsesInRace[i];
			System.out.println("____________________________________________________________________________________________________");
			System.out.println(((i + 1)));
			System.out.println("____________________________________________________________________________________________________");

		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ie) {

		}
		
		boolean raceIsDone = false;
		while (!raceIsDone) {
			for (int i = 0; i <= horsesInRace.length - 1; i++) {
				if(track ==1){
				temp = ((int) (Math.random() * 5) + 1);	
				}else if( track == 2){
					 temp = ((int) (Math.random() * 4) + 1);
				}else if( track == 3){
					 temp = ((int) (Math.random() * 7) + 1);
				 }else if( track == 4){
					 temp = ((int) (Math.random() * 3) + 1);
				 }else if( track == 5){
					 temp = ((int) (Math.random() * 4) + 1);
				 }
					 
				int tempMovement = Integer.parseInt(movement[i]);
				tempMovement += temp;
				if (tempMovement >= 100) {
					tempMovement = 100;
					raceIsDone = true;
					Winner = horsesInRace[i];
					System.out.println(" Congratulations! " + Winner + " won the race!");
					for(int j = 0; j < playerInfo.length; j++){
						if(playerInfo[j][HORSE].equals(Winner)){
					
					int tempWallet = Integer.parseInt(playerInfo[j][WALLET]);
					int bet =  Integer.parseInt(playerInfo[j ][BET]);
					tempWallet += bet *2; 
					playerInfo[j ][WALLET] = Integer.toString(tempWallet);
					System.out.println(playerInfo[j][NAME] + " won $" + playerInfo[j][BET]) ;
						}
					
						
					}

				} else {
					
					movement[i] = Integer.toString(tempMovement);
					raceData[i][tempMovement] = raceData[i][0];
					System.out.println("____________________________________________________________________________________________________");
					for (int j = 0; j <= tempMovement; j++) {
						System.out.print(' ');
					}
					System.out.println(((i + 1)));
					System.out.println("____________________________________________________________________________________________________");
					
				
					

				}
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException ie) {
				}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			

			}
		 }
		}
			
		
	

	private static String[] chooseHorses(Scanner userinput, String[][] playerInfo, String[] allHorses) {
		int numberOfHorses = (int) (Math.random() * 8) + 4;
		String[] raceHorses = new String[numberOfHorses];
		for (int i = 0; i < numberOfHorses; i++) {
			int j = (int) (Math.random() * allHorses.length) + 1;

			if (alreadyInRace(raceHorses, allHorses[j]))
				i--;
			else
				raceHorses[i] = allHorses[j];
		}

		return raceHorses;

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

			for (int i = 0; i < numHorses; i++) { //Works
				horses[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return horses;
	}

	public static boolean alreadyInRace(String[] horsesInRace, String horse) {

		for (int i = 0; i < horsesInRace.length; i++) {
			if (horse.equalsIgnoreCase(horsesInRace[i])) {
				return true;
			}
		}

		return false;
	}

	private static String[] getPlayerBet(Scanner userInput, String[][] playerInfo, String[] horsesInRace) {
		for (int i = 0; i < playerInfo.length; i++) {
			boolean validBet = false;
			boolean validInput = false;
			boolean validChoice = false;
			String bet = "";

			while (!validBet) {
				while (!validInput) {
					System.out.println("Hello " + playerInfo[i][NAME] + ", How much would you like to bet? You Have Currently: $" + playerInfo[i][WALLET] + " in your bank.");
					bet = userInput.nextLine();

					try {
						int number = Integer.parseInt(bet);
						validInput = true;
					} catch (NumberFormatException ex) {
						System.out.println(bet + " is not a number on earth in any language."); //WORKS!!!!!!!!!!!!!!!!!!
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
					while (!validChoice) {
						System.out.println(playerInfo[i][NAME] + ", Which horse would you like to bet on? click 0 for the list of horses in the race");

						String horseList = userInput.nextLine();

						int choice = 0;
						try {
							choice = Integer.parseInt(horseList);
						} catch (NumberFormatException ex) {

						}

						if (choice == 0) {

							for (int j = 0; j < horsesInRace.length; j++) {
								System.out.println((j + 1) + ". " + horsesInRace[j]);
								validChoice = false;
							}

						} else if (choice == 1) {
							playerInfo[i][HORSE] = horsesInRace[0];
							validChoice = true;
							System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[0]);

						} else if (choice == 2) {
							playerInfo[i][HORSE] = horsesInRace[1];
							validChoice = true;
							System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[1]);

						} else if (choice == 3) {
							playerInfo[i][HORSE] = horsesInRace[2];
							validChoice = true;
							System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[2]);

						} else if (choice == 4) {
							playerInfo[i][HORSE] = horsesInRace[3];
							validChoice = true;
							System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[3]);
						} else if (choice == 5) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[4];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[4]);
							}

						} else if (choice == 6) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[5];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[5]);
							}

						} else if (choice == 7) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[6];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[6]);
							}

						} else if (choice == 8) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[7];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[7]);
							}

						} else if (choice == 9) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[8];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[8]);
							}

						} else if (choice == 10) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[9];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[9]);
							}

						} else if (choice == 11) {
							if (choice > horsesInRace.length) {
								System.out.println("Sorry, that horse isn't in the race");
							} else if (choice <= horsesInRace.length) {
								playerInfo[i][HORSE] = horsesInRace[10];
								validChoice = true;
								System.out.println("You have bet $" + playerInfo[i][BET] + " on " + horsesInRace[10]);
							}

						} else {
							System.out.println("That is not a valid input ");
							validChoice = false;
						}
					}
				}
			}

		}
		return null;
	}
}

		