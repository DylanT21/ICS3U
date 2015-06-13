package com.bayviewglen.ZorkProject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Intro implements Serializable {
	

	@SuppressWarnings({ "resource", "unchecked" })
	public Game gameIntro() throws FileNotFoundException {
		Boolean done = false; 
		Boolean loadGame = false;
		while(!done){
			System.out.println("would you like to load the previous save, or start a new game?");
		String Answer = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Answer = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("There was an error during reading: " + exc.getMessage());
        }
        if(Answer.equals("load") || Answer.equals("load game")){
        	System.out.println("your previous save has been loaded");
        	Game game = readObjects();
        	return game;
       	                	          
        	
        }else if(Answer.equals("new game") || Answer.equals("new")){
        	System.out.println("A new game will be started");
        	Game game = new Game();
        	return game;
        }else{
        	System.out.println("That is an Incorrect input.");
        }
		}
		return null;
		
	}
	
	private static Game readObjects() throws FileNotFoundException {
		Game deserializedGame = null;
		try {
            FileInputStream fileIn = new FileInputStream("data/saveFile.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedGame = (Game) in.readObject();
            in.close();
            fileIn.close();
            return deserializedGame;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
		return deserializedGame;
		
	}

	}
