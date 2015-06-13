package com.bayviewglen.ZorkProject;
import java.io.Serializable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Puzzle {
int random = 0;

//Facility8 
//Facility10
//Facilty19
public Boolean puzzle(){
	Boolean done = false; 
	randomPuzzles();
	while(done !=true){
	if(random == 1){
		System.out.println("What room has no doors or windows?");
		System.out.println("> a box ");   
		System.out.println("> a closet");   
		System.out.println("> mushroom");   
		System.out.println("> space ");   
		 System.out.print("> ");     
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
	if(Answer.equals("mushroom") || Answer.equals("a mushroom")){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}
	}else if(random == 2){
		System.out.println("what is the center of gravity?");
		System.out.println("> of ");   
		System.out.println("> the center of the earth");   
		System.out.println("> center of mass ");   
		System.out.println("> v ");   
		 System.out.print("> ");     
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
	if(Answer.equals("v")){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}

	}else if(random == 3){
		System.out.println("What starts with an e but only has a single letter in it?");
		 System.out.print("> ");     
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
	if(Answer.equals("envelope")  || Answer.equals("an envelope") ){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}
	}else if(random == 4){
		System.out.println("Your mom went to _________");
		System.out.println("> University ");   
		System.out.println("> College");   
		System.out.println("> Trade school");   
		System.out.println("> space ");   
		 System.out.print("> ");     
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
	if(Answer.equals("college")){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}
	}else if(random == 5){
		System.out.println("hOw many hOles in a pOlO?");
		System.out.println("> 2");   
		System.out.println("> 4");   
		System.out.println("> polo");   
		System.out.println("> 42 ");   
		 System.out.print("> ");     
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
	if(Answer.equals("four") || Answer.equals("4") ){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}
	}
	else if(random == 6){
		System.out.println("What can't you eat for breakfast?");
		System.out.println("> lunch");   
		System.out.println("> dinner");   
		System.out.println("> time");   
		System.out.println("> space"); 
		 System.out.print("> ");     
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
	if(Answer.equals("lunch")|| Answer.equals("dinner")){
		done = true;
	System.out.println("good job!");
	}else{
		System.out.println("Wrong! Think again!");
	}
	}
	}
	return done;
	
}




public int randomPuzzles(){
	 random =(int)( Math.random()*6)+1; 
	return random;
	
	
}
}
			 