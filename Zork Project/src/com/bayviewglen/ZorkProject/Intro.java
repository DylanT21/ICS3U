package com.bayviewglen.ZorkProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Intro {
	

	public boolean gameIntro() {
		Boolean done = false; 
		while(!done){
			System.out.println("would you like to load the previous save, or start a new game?");
		String Answer = "";
        BufferedReader reader = 
            new BufferedReader(new InputStreamReader(System.in));
        try {
            Answer = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("There was an error during reading: "
                                + exc.getMessage());
        }
        if(Answer.equals("load") || Answer.equals("load game")){
        	System.out.println("your previous save has been loaded");
        	done = true;
        }else if(Answer.equals("new game") || Answer.equals("new")){
        	System.out.println("A new game will be started");
        	done = true;
        }
		}
		
		return done;
	}
	}
