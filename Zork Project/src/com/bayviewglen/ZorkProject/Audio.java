package com.bayviewglen.ZorkProject;
import java.io.Serializable;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Audio {
	private HashMap<String, Clip> clipMap;
	private String currentClip;
	// The method for the test program, you could just copy paste this into your
	// program and put the string for the url in the parameters.
	public static Clip loadSound(String url1) throws InterruptedException {
		Clip clip = null;
		
		try {
	       
	         File f = new File(url1);
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(f);
	         // Get a sound clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         //clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		 	return clip;
		// Be advised this only works for .wav s
	}
	public Audio() throws InterruptedException{
		
		initAudio();
		currentClip = null;
	/*
		clipMap.get("bird").start();
		Thread.sleep(20000);
		clipMap.get("bird").stop();
	*/
	}
	
	public void initAudio(){
		clipMap = new HashMap<String, Clip>();
	
		try {
		
			clipMap.put("FACILITY5", loadSound("Audio/This is Art.wav"));
			clipMap.put("FACILITY17", loadSound("Audio/Glados Air.wav"));
			clipMap.put("FACILITY16", loadSound("Audio/Serious Brain Damage.wav"));
			clipMap.put("FACILITY22", loadSound("Audio/Turrets.wav"));
			clipMap.put("HALLWAY1", loadSound("Audio/It's this way.wav"));
			clipMap.put("HALLWAY2", loadSound("Audio/Loud Noises.wav"));
			clipMap.put("FACILITY8", loadSound("Audio/Glados Pointlessly cruel.wav"));
			clipMap.put("STAIRS", loadSound("Audio/Glados Sarcasm.wav"));
			clipMap.put("FACILITY23", loadSound("Audio/smelly humans.wav"));
			clipMap.put("FACILITY10", loadSound("Audio/Glados Instructions.wav"));
			clipMap.put("FACILITY12", loadSound("Audio/BIRD.wav"));
			clipMap.put("FACILITY19", loadSound("Audio/Parents don't love you Glados.wav"));
			clipMap.put("CORRIDOR7", loadSound("Audio/Glados Pack on pounds.wav"));
			clipMap.put("CORRIDOR8", loadSound("Audio/Can't touch us.wav"));
			clipMap.put("FACILITY20", loadSound("Audio/bring your child to work  day.wav"));
			clipMap.put("POTATOROOM", loadSound("Audio/Spanish.wav"));
			clipMap.put("CORRIDOR6", loadSound("Audio/Glados SLow Clap.wav"));
			clipMap.put("CENTRALCORE", loadSound("Audio/Portal 2 - GLaDOS Ending Speech.wav"));
			clipMap.put("CENTRALCORE", loadSound("Audio/Portal 2 - Im in space.wav"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void playSound(String roomKey){
		if (currentClip != null){
			clipMap.get(currentClip).stop();
			clipMap.get(currentClip).close();
			try {
				
				 if (currentClip.equals("FACILITY5"))
					clipMap.put("FACILITY5", loadSound("Audio/This is Art.wav"));
				else if (currentClip.equals("FACILITY17"))
					clipMap.put("FACILITY17", loadSound("Audio/Glados Air.wav"));
				else if (currentClip.equals("FACILITY16"))
					clipMap.put("FACILITY16", loadSound("Audio/Serious Brain Damage.wav"));
				else if (currentClip.equals("FACILITY22"))
					clipMap.put("FACILITY22", loadSound("Audio/Turrets.wav"));
				else if (currentClip.equals("HALLWAY1"))
					clipMap.put("HALLWAY1", loadSound("Audio/It's this way.wav"));
				else if (currentClip.equals("HALLWAY2"))
					clipMap.put("HALLWAY2", loadSound("Audio/Loud Noises.wav"));
				else if (currentClip.equals("FACILITY8"))
					clipMap.put("FACILITY8", loadSound("Audio/Glados Pointlessly cruel.wav"));
				else if (currentClip.equals("STAIRS"))
					clipMap.put("STAIRS", loadSound("Audio/Glados Sarcasm.wav"));
				else if (currentClip.equals("FACILITY23"))
					clipMap.put("FACILITY23", loadSound("Audio/smelly humans.wav"));
				else if (currentClip.equals("FACILITY10"))
					clipMap.put("FACILITY10", loadSound("Audio/Glados Instructions.wav"));
				else if (currentClip.equals("FACILITY12"))
					clipMap.put("FACILITY12", loadSound("Audio/BIRD.wav"));
				else if (currentClip.equals("FACILITY19"))
				clipMap.put("FACILITY19", loadSound("Audio/Parents don't love you Glados.wav"));
				else if (currentClip.equals("CORRIDOR7"))
					clipMap.put("CORRIDOR7", loadSound("Audio/Glados Pack on pounds.wav"));
				else if (currentClip.equals("CORRIDOR8"))
					clipMap.put("CORRIDOR8", loadSound("Audio/Can't touch us.wav"));
				else if (currentClip.equals("FACILITY20"))
				clipMap.put("FACILITY20", loadSound("Audio/bring your child to work  day.wav"));
				else if (currentClip.equals("FACILITY21"))
					clipMap.put("FACILITY21", loadSound("Audio/You are a horrible person.wav"));
				else if (currentClip.equals("POTATOROOM"))
					clipMap.put("POTATOROOM", loadSound("Audio/Spanish.wav"));
				else if (currentClip.equals("CORRIDOR6"))
					clipMap.put("CORRIDOR6", loadSound("Audio/Glados SLow Clap.wav"));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			currentClip = null;
		}
		
		if (clipMap.containsKey(roomKey)){
			clipMap.get(roomKey).start();
			currentClip = roomKey;
		} 
			
	}
	
}





