package com.bayviewglen.ZorkProject;


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
			clipMap.put("FACILITY2", loadSound("Audio/BIRD.wav"));
			clipMap.put("FACILITY3", loadSound("Audio/Loud Noises.wav"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void playSound(String roomKey){
		if (clipMap.containsKey(roomKey)){
			clipMap.get(roomKey).start();
			currentClip = roomKey;
		}else if (currentClip != null){
			clipMap.get(currentClip).stop();
		}
			
	}
	
}





