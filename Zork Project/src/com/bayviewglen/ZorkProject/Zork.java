package com.bayviewglen.ZorkProject;


public class Zork {

	private Intro intro ;
	public static void main(String [] args){
		intro = new Intro();
		Game game = new Game();
		System.out.println("Welcome to Chippys Cake Adventure (based off the events of a true story aka portal 2");
		intro.gameIntro();
		game.play();
	}

}
