package com.bayviewglen.ZorkProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Intro {
	

	public boolean gameIntro() {
		Boolean done = false; 
		while(!done){
			System.out.println("would you like to load the previous save?");
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
        if(Answer == "load"){
        	System.out.println("fuck this shit");
        	done = true;
        }
		}
		
		return done;
	}
	}
