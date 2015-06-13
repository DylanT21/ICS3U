package com.bayviewglen.ZorkProject;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Intro extends Game implements Serializable {
	

	@SuppressWarnings({ "resource", "unchecked" })
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
        	
       	                	try {
             		   FileInputStream f_in = new FileInputStream("data/savefile.dat");
             		    ObjectInputStream ois = new ObjectInputStream(f_in);
             		  Object[] playerData = (Object[])ois.readObject();
             		 currentRoom=(Room)playerData[0];
             		//  inventory=(ArrayList<String>)playerData[1];
             		  masterRoomMap=(HashMap<String, Room>)playerData[1];
             		
             		  } catch (Exception ex) {
             		   // TODO Auto-generated catch block
             		   ex.printStackTrace();
             		  }           
        	done = true;
        }else if(Answer.equals("new game") || Answer.equals("new")){
        	System.out.println("A new game will be started");
        	done = true;
        }
		}
		
		return done;
	}
	}
