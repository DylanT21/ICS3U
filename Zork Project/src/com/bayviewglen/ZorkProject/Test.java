package com.bayviewglen.ZorkProject;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Test {

	// The method for the test program, you could just copy paste this into your
	// program and put the string for the url in the parameters.
	public void playSound(String url1) {
		 try {
	         // Open an audio input stream.
	        //URL url = this.getClass().getClassLoader().getResource(url1);
	         File f = new File(url1);
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(f);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		 System.out.println();
		// Be advised this only works for .wav s
	}
	public Test(){
		
	}
	public static void main(String[] args){
		Test t = new Test();
		t.playSound("Audio/Spanish.wav");
	}
	
}

