package com.bayviewglen.ZorkProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Zork implements Serializable{
	private static Intro intro ;
	
	public static void main(String [] args) throws FileNotFoundException{
		
		intro = new Intro();
		Game game;
		System.out.println("Welcome to Chippys Cake Adventure (based off the events of a true story aka portal 2");
		game = intro.gameIntro();
		boolean save = game.play();
		if(save)
		saveGame(game);
	}

	private static void saveGame(Game game) {

		try {
			FileOutputStream fileOut = new FileOutputStream("data/saveFile.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(game);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
