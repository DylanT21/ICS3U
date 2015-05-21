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



public class Test {
	private HashMap<String, Clip> clipMap;
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
	public Test() throws InterruptedException{
		
		initAudio();
		clipMap.get("bird").start();
		Thread.sleep(5000);
		clipMap.get("bird").stop();
		clipMap.get("loudnoises").start();
		Thread.sleep(5000);
	}
	
	public void initAudio(){
		clipMap = new HashMap<String, Clip>();
		try {
			clipMap.put("bird", loadSound("Audio/BIRD.wav"));
			clipMap.put("loudnoises", loadSound("Audio/Loud Noises.wav"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		Test t = new Test();
	
	}
	
}





