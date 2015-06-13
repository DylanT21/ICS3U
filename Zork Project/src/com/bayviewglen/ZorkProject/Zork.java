package com.bayviewglen.ZorkProject;
import java.io.Serializable;


public class Zork {
	private static Intro intro ;
	
	public static void main(String [] args){
		
		intro = new Intro();
		Game game = new Game();
		System.out.println("Welcome to Chippys Cake Adventure (based off the events of a true story aka portal 2");
		intro.gameIntro();
		game.play();
	}

}
