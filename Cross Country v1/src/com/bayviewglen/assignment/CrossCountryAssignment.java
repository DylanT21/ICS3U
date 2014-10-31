//This program is designed to collect and  display data (in the proper format) based on user input.
//The user will input a runner's name, time for their first mile, second mile, and for the whole race.
//Split time are calculated, and displayed in an individual chart with the runner's name.
//Times are inputed and displayed in the format: mm:ss.ss
//After the user has inputed 5 runners, they are displayed in a large chart, and the program ends.
package com.bayviewglen.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {
	public static final int SECONDS_PER_MINUTE = 60;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);//adding keyboard to allow the user to input data
		DecimalFormat formatter = new DecimalFormat("00.000");//formatter is used to only allow 3 decimal places.

		System.out.print("Please enter first and last name here: ");
		String nameP1 = keyboard.nextLine();//name of the first contestant  

		System.out.print("Please input " + nameP1 + "'s time to the end of the first mile in the format in mm:ss.ss: ");
		String mile1P1 = keyboard.nextLine();//mile1 takes the input 
		int minMile1P1 = Integer.parseInt(mile1P1.substring(0, mile1P1.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec1P1 = minMile1P1 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec1P1 = Double.parseDouble(mile1P1.substring(mile1P1.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsP1 = sec1P1 + minInSec1P1; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP1 + "'s time to the end of the second mile in the format in mm:ss.ss: ");
		String mile2P1 = keyboard.nextLine();//mile2 takes the input 
		int minMile2P1 = Integer.parseInt(mile2P1.substring(0, mile2P1.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec2P1 = minMile2P1 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec2P1 = Double.parseDouble(mile2P1.substring(mile2P1.indexOf(':') + 1));//takes the seconds from the input
		double totalseconds2P1 = sec2P1 + minInSec2P1; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP1 + "'s time to complete the 5km: in the format in mm:ss.ss:");
		String fivekmP1 = keyboard.nextLine();//fivekm takes the input 
		int minMilefivekmP1 = Integer.parseInt(fivekmP1.substring(0, fivekmP1.indexOf(':')));//this line divides the minutes from the seconds
		int minInSecfivekmP1 = minMilefivekmP1 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double secfivekmP1 = Double.parseDouble(fivekmP1.substring(fivekmP1.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsfivekmP1 = secfivekmP1 + minInSecfivekmP1; // adds both the seconds and the minutes(in seconds)

		double totalsecondssplt2P1 = totalseconds2P1 - totalsecondsP1; //using the inputed data to find the other splits
		double totalsecondssplt3P1 = totalsecondsfivekmP1 - totalseconds2P1;

		int totalminssplit1P1 = (int) totalsecondsP1 / SECONDS_PER_MINUTE;// converting back to minutes 
		String totalsecondssplit1P1 = formatter.format(totalsecondsP1 - totalminssplit1P1 * SECONDS_PER_MINUTE); //format ensures only 3 decimal places

		int totalminssplit2P1 = (int) totalsecondssplt2P1 / SECONDS_PER_MINUTE;
		String totalsecondssplit2P1 = formatter.format(totalsecondssplt2P1 - totalminssplit2P1 * SECONDS_PER_MINUTE);

		int totalminssplit3P1 = (int) totalsecondssplt3P1 / SECONDS_PER_MINUTE;
		String totalsecondssplit3P1 = formatter.format(totalsecondssplt3P1 - totalminssplit3P1 * SECONDS_PER_MINUTE);

		int totalminswholeraceP1 = (int) totalsecondsfivekmP1 / SECONDS_PER_MINUTE;
		String totalsecondswholeraceP1 = formatter.format(totalsecondsfivekmP1 - totalminswholeraceP1 * SECONDS_PER_MINUTE);//this is the same data as the fivekm data

		String finaltimesplit1P1 = totalminssplit1P1 + ":" + totalsecondssplit1P1;
		String finaltimesplit2P1 = totalminssplit2P1 + ":" + totalsecondssplit2P1; // making strings for each oof the split to be displayed in the chart.
		String finaltimesplit3P1 = totalminssplit3P1 + ":" + totalsecondssplit3P1;
		String finaltimewholeraceP1 = totalminswholeraceP1 + ":" + totalsecondswholeraceP1;

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("------------------");
		System.out.println("Runner: " + nameP1);// %210 leaves just enough space for the input time, while %-20 has enough for most names.
		System.out.printf("%-20s%-10s\n", "Split One", finaltimesplit1P1); //%-20: the - puts the information on the left side(like a graph in Math)
		System.out.printf("%-20s%-10s\n", "Split Two", finaltimesplit2P1);
		System.out.printf("%-20s%-10s\n", "Split Three", finaltimesplit3P1);
		System.out.printf("%-20s%-10s\n", "Total time", finaltimewholeraceP1);

		System.out.println("--------------------------------------------------------------------------------------");

		System.out.print("Please enter first and last name here: ");
		String nameP2 = keyboard.nextLine();//name of the contestant  

		System.out.print("Please input " + nameP2 + "'s time to the end of the first mile in the format in mm:ss.ss: ");
		String mile1P2 = keyboard.nextLine();//mile1 takes the input 
		int minMile1P2 = Integer.parseInt(mile1P2.substring(0, mile1P2.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec1P2 = minMile1P2 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec1P2 = Double.parseDouble(mile1P2.substring(mile1P2.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsP2 = sec1P2 + minInSec1P2; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP2 + "'s time to the end of the second mile in the format in mm:ss.ss: ");
		String mile2P2 = keyboard.nextLine();//mile2 takes the input 
		int minMile2P2 = Integer.parseInt(mile2P2.substring(0, mile2P2.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec2P2 = minMile2P2 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec2P2 = Double.parseDouble(mile2P2.substring(mile2P2.indexOf(':') + 1));//takes the seconds from the input
		double totalseconds2P2 = sec2P2 + minInSec2P2; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP2 + "'s time to complete the 5km: in the format in mm:ss.ss:");
		String fivekmP2 = keyboard.nextLine();//fivekm takes the input 
		int minMilefivekmP2 = Integer.parseInt(fivekmP2.substring(0, fivekmP2.indexOf(':')));//this line divides the minutes from the seconds
		int minInSecfivekmP2 = minMilefivekmP2 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double secfivekmP2 = Double.parseDouble(fivekmP2.substring(fivekmP2.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsfivekmP2 = secfivekmP2 + minInSecfivekmP2; // adds both the seconds and the minutes(in seconds)

		double totalsecondssplt2P2 = totalseconds2P2 - totalsecondsP2; //using the inputed data to find the other splits
		double totalsecondssplt3P2 = totalsecondsfivekmP2 - totalseconds2P2;

		int totalminssplit1P2 = (int) totalsecondsP2 / SECONDS_PER_MINUTE;// converting back to minutes 
		String totalsecondssplit1P2 = formatter.format(totalsecondsP2 - totalminssplit1P2 * SECONDS_PER_MINUTE); //format ensures only 3 decimal places

		int totalminssplit2P2 = (int) totalsecondssplt2P2 / SECONDS_PER_MINUTE;
		String totalsecondssplit2P2 = formatter.format(totalsecondssplt2P2 - totalminssplit2P2 * SECONDS_PER_MINUTE);

		int totalminssplit3P2 = (int) totalsecondssplt3P2 / SECONDS_PER_MINUTE;
		String totalsecondssplit3P2 = formatter.format(totalsecondssplt3P2 - totalminssplit3P2 * SECONDS_PER_MINUTE);

		int totalminswholeraceP2 = (int) totalsecondsfivekmP2 / SECONDS_PER_MINUTE;
		String totalsecondswholeraceP2 = formatter.format(totalsecondsfivekmP2 - totalminswholeraceP2 * SECONDS_PER_MINUTE);//this is the same data as the fivekm data

		String finaltimesplit1P2 = totalminssplit1P2 + ":" + totalsecondssplit1P2;
		String finaltimesplit2P2 = totalminssplit2P2 + ":" + totalsecondssplit2P2; // making strings for each oof the split to be displayed in the chart.
		String finaltimesplit3P2 = totalminssplit3P2 + ":" + totalsecondssplit3P2;
		String finaltimewholeraceP2 = totalminswholeraceP2 + ":" + totalsecondswholeraceP2;

		System.out.println();
		System.out.println("Runner two Summary");
		System.out.println("------------------");
		System.out.println("Runner: " + nameP2);// %210 leaves just enough space for the input time, while %-20 has enough for most names.
		System.out.printf("%-20s%-10s\n", "Split One", finaltimesplit1P2); //%-20: the - puts the information on the left side(like a graph in Math)
		System.out.printf("%-20s%-10s\n", "Split Two", finaltimesplit2P2);
		System.out.printf("%-20s%-10s\n", "Split Three", finaltimesplit3P2);
		System.out.printf("%-20s%-10s\n", "Total time", finaltimewholeraceP2);

		System.out.println("--------------------------------------------------------------------------------------");

		System.out.print("Please enter first and last name here: ");
		String nameP3 = keyboard.nextLine();//name of the contestant  

		System.out.print("Please input " + nameP3 + "'s time to the end of the first mile in the format in mm:ss.ss: ");
		String mile1P3 = keyboard.nextLine();//mile1 takes the input 
		int minMile1P3 = Integer.parseInt(mile1P3.substring(0, mile1P3.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec1P3 = minMile1P3 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec1P3 = Double.parseDouble(mile1P3.substring(mile1P3.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsP3 = sec1P3 + minInSec1P3; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP3 + "'s time to the end of the second mile in the format in mm:ss.ss: ");
		String mile2P3 = keyboard.nextLine();//mile2 takes the input 
		int minMile2P3 = Integer.parseInt(mile2P3.substring(0, mile2P3.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec2P3 = minMile2P3 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec2P3 = Double.parseDouble(mile2P3.substring(mile2P3.indexOf(':') + 1));//takes the seconds from the input
		double totalseconds2P3 = sec2P3 + minInSec2P3; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP3 + "'s time to complete the 5km: in the format in mm:ss.ss:");
		String fivekmP3 = keyboard.nextLine();//fivekm takes the input 
		int minMilefivekmP3 = Integer.parseInt(fivekmP3.substring(0, fivekmP3.indexOf(':')));//this line divides the minutes from the seconds
		int minInSecfivekmP3 = minMilefivekmP3 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double secfivekmP3 = Double.parseDouble(fivekmP3.substring(fivekmP3.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsfivekmP3 = secfivekmP3 + minInSecfivekmP3; // adds both the seconds and the minutes(in seconds)

		double totalsecondssplt2P3 = totalseconds2P3 - totalsecondsP3; //using the inputed data to find the other splits
		double totalsecondssplt3P3 = totalsecondsfivekmP3 - totalseconds2P3;

		int totalminssplit1P3 = (int) totalsecondsP3 / SECONDS_PER_MINUTE;// converting back to minutes 
		String totalsecondssplit1P3 = formatter.format(totalsecondsP3 - totalminssplit1P3 * SECONDS_PER_MINUTE); //format ensures only 3 decimal places

		int totalminssplit2P3 = (int) totalsecondssplt2P3 / SECONDS_PER_MINUTE;
		String totalsecondssplit2P3 = formatter.format(totalsecondssplt2P3 - totalminssplit2P3 * SECONDS_PER_MINUTE);

		int totalminssplit3P3 = (int) totalsecondssplt3P3 / SECONDS_PER_MINUTE;
		String totalsecondssplit3P3 = formatter.format(totalsecondssplt3P3 - totalminssplit3P3 * SECONDS_PER_MINUTE);

		int totalminswholeraceP3 = (int) totalsecondsfivekmP3 / SECONDS_PER_MINUTE;
		String totalsecondswholeraceP3 = formatter.format(totalsecondsfivekmP3 - totalminswholeraceP3 * SECONDS_PER_MINUTE);//this is the same data as the fivekm data

		String finaltimesplit1P3 = totalminssplit1P3 + ":" + totalsecondssplit1P3;
		String finaltimesplit2P3 = totalminssplit2P3 + ":" + totalsecondssplit2P3; // making strings for each oof the split to be displayed in the chart.
		String finaltimesplit3P3 = totalminssplit3P3 + ":" + totalsecondssplit3P3;
		String finaltimewholeraceP3 = totalminswholeraceP3 + ":" + totalsecondswholeraceP3;

		System.out.println();
		System.out.println("Runner three Summary");
		System.out.println("------------------");
		System.out.println("Runner: " + nameP3);// %210 leaves just enough space for the input time, while %-20 has enough for most names.
		System.out.printf("%-20s%-10s\n", "Split One", finaltimesplit1P3); //%-20: the - puts the information on the left side(like a graph in Math)
		System.out.printf("%-20s%-10s\n", "Split Two", finaltimesplit2P3);
		System.out.printf("%-20s%-10s\n", "Split Three", finaltimesplit3P3);
		System.out.printf("%-20s%-10s\n", "Total time", finaltimewholeraceP3);

		System.out.println("--------------------------------------------------------------------------------------");

		System.out.print("Please enter first and last name here: ");
		String nameP4 = keyboard.nextLine();//name of the contestant  

		System.out.print("Please input " + nameP4 + "'s time to the end of the first mile in the format in mm:ss.ss: ");
		String mile1P4 = keyboard.nextLine();//mile1 takes the input 
		int minMile1P4 = Integer.parseInt(mile1P4.substring(0, mile1P4.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec1P4 = minMile1P4 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec1P4 = Double.parseDouble(mile1P4.substring(mile1P4.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsP4 = sec1P4 + minInSec1P4; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP4 + "'s time to the end of the second mile in the format in mm:ss.ss: ");
		String mile2P4 = keyboard.nextLine();//mile2 takes the input 
		int minMile2P4 = Integer.parseInt(mile2P4.substring(0, mile2P4.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec2P4 = minMile2P4 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec2P4 = Double.parseDouble(mile2P4.substring(mile2P4.indexOf(':') + 1));//takes the seconds from the input
		double totalseconds2P4 = sec2P4 + minInSec2P4; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP4 + "'s time to complete the 5km: in the format in mm:ss.ss:");
		String fivekmP4 = keyboard.nextLine();//fivekm takes the input 
		int minMilefivekmP4 = Integer.parseInt(fivekmP4.substring(0, fivekmP4.indexOf(':')));//this line divides the minutes from the seconds
		int minInSecfivekmP4 = minMilefivekmP4 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double secfivekmP4 = Double.parseDouble(fivekmP4.substring(fivekmP4.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsfivekmP4 = secfivekmP4 + minInSecfivekmP4; // adds both the seconds and the minutes(in seconds)

		double totalsecondssplt2P4 = totalseconds2P4 - totalsecondsP4; //using the inputed data to find the other splits
		double totalsecondssplt3P4 = totalsecondsfivekmP4 - totalseconds2P4;

		int totalminssplit1P4 = (int) totalsecondsP4 / SECONDS_PER_MINUTE;// converting back to minutes 
		String totalsecondssplit1P4 = formatter.format(totalsecondsP4 - totalminssplit1P4 * SECONDS_PER_MINUTE); //format ensures only 3 decimal places

		System.out.println(nameP4 + "'s time for the first split is: " + totalminssplit1P4 + ":" + totalsecondssplit1P4);//display both the minutes and seconds with a ":" in-between 

		int totalminssplit2P4 = (int) totalsecondssplt2P4 / SECONDS_PER_MINUTE;
		String totalsecondssplit2P4 = formatter.format(totalsecondssplt2P4 - totalminssplit2P4 * SECONDS_PER_MINUTE);

		System.out.println(nameP4 + "'s time for the second split is: " + totalminssplit2P4 + ":" + totalsecondssplit2P4);

		int totalminssplit3P4 = (int) totalsecondssplt3P4 / SECONDS_PER_MINUTE;
		String totalsecondssplit3P4 = formatter.format(totalsecondssplt3P4 - totalminssplit3P4 * SECONDS_PER_MINUTE);

		System.out.println(nameP4 + "'s time for the thrid split is: " + totalminssplit3P4 + ":" + totalsecondssplit3P4);

		int totalminswholeraceP4 = (int) totalsecondsfivekmP4 / SECONDS_PER_MINUTE;
		String totalsecondswholeraceP4 = formatter.format(totalsecondsfivekmP4 - totalminswholeraceP4 * SECONDS_PER_MINUTE);//this is the same data as the fivekm data

		System.out.println(nameP4 + "'s time for the whole race is: " + totalminswholeraceP4 + ":" + totalsecondswholeraceP4);

		String finaltimesplit1P4 = totalminssplit1P4 + ":" + totalsecondssplit1P4;
		String finaltimesplit2P4 = totalminssplit2P4 + ":" + totalsecondssplit2P4; // making strings for each oof the split to be displayed in the chart.
		String finaltimesplit3P4 = totalminssplit3P4 + ":" + totalsecondssplit3P4;
		String finaltimewholeraceP4 = totalminswholeraceP4 + ":" + totalsecondswholeraceP4;

		System.out.println();
		System.out.println("Runner four Summary");
		System.out.println("------------------");
		System.out.println("Runner: " + nameP4);// %210 leaves just enough space for the input time, while %-20 has enough for most names.
		System.out.printf("%-20s%-10s\n", "Split One", finaltimesplit1P4); //%-20: the - puts the information on the left side(like a graph in Math)
		System.out.printf("%-20s%-10s\n", "Split Two", finaltimesplit2P4);
		System.out.printf("%-20s%-10s\n", "Split Three", finaltimesplit3P4);
		System.out.printf("%-20s%-10s\n", "Total time", finaltimewholeraceP4);

		System.out.println("--------------------------------------------------------------------------------------");

		System.out.print("Please enter first and last name here: ");
		String nameP5 = keyboard.nextLine();//name of the contestant  

		System.out.print("Please input " + nameP5 + "'s time to the end of the first mile in the format in mm:ss.ss: ");
		String mile1P5 = keyboard.nextLine();//mile1 takes the input 
		int minMile1P5 = Integer.parseInt(mile1P5.substring(0, mile1P5.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec1P5 = minMile1P5 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec1P5 = Double.parseDouble(mile1P5.substring(mile1P5.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsP5 = sec1P5 + minInSec1P5; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP5 + "'s time to the end of the second mile in the format in mm:ss.ss: ");
		String mile2P5 = keyboard.nextLine();//mile2 takes the input 
		int minMile2P5 = Integer.parseInt(mile2P5.substring(0, mile2P5.indexOf(':')));//this line divides the minutes from the seconds
		int minInSec2P5 = minMile2P5 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double sec2P5 = Double.parseDouble(mile2P5.substring(mile2P5.indexOf(':') + 1));//takes the seconds from the input
		double totalseconds2P5 = sec2P5 + minInSec2P5; // adds both the seconds and the minutes(in seconds)

		System.out.print("Please input " + nameP5 + "'s time to complete the 5km: in the format in mm:ss.ss:");
		String fivekmP5 = keyboard.nextLine();//fivekm takes the input 
		int minMilefivekmP5 = Integer.parseInt(fivekmP5.substring(0, fivekmP5.indexOf(':')));//this line divides the minutes from the seconds
		int minInSecfivekmP5 = minMilefivekmP5 * SECONDS_PER_MINUTE;//changes the minutes into seconds
		double secfivekmP5 = Double.parseDouble(fivekmP5.substring(fivekmP5.indexOf(':') + 1));//takes the seconds from the input
		double totalsecondsfivekmP5 = secfivekmP5 + minInSecfivekmP5; // adds both the seconds and the minutes(in seconds)

		double totalsecondssplt2P5 = totalseconds2P5 - totalsecondsP5; //using the inputed data to find the other splits
		double totalsecondssplt3P5 = totalsecondsfivekmP5 - totalseconds2P5;

		int totalminssplit1P5 = (int) totalsecondsP5 / SECONDS_PER_MINUTE;// converting back to minutes 
		String totalsecondssplit1P5 = formatter.format(totalsecondsP5 - totalminssplit1P5 * SECONDS_PER_MINUTE); //format ensures only 3 decimal places

		int totalminssplit2P5 = (int) totalsecondssplt2P5 / SECONDS_PER_MINUTE;
		String totalsecondssplit2P5 = formatter.format(totalsecondssplt2P5 - totalminssplit2P5 * SECONDS_PER_MINUTE);

		int totalminssplit3P5 = (int) totalsecondssplt3P5 / SECONDS_PER_MINUTE;
		String totalsecondssplit3P5 = formatter.format(totalsecondssplt3P5 - totalminssplit3P5 * SECONDS_PER_MINUTE);

		int totalminswholeraceP5 = (int) totalsecondsfivekmP5 / SECONDS_PER_MINUTE;
		String totalsecondswholeraceP5 = formatter.format(totalsecondsfivekmP5 - totalminswholeraceP5 * SECONDS_PER_MINUTE);//this is the same data as the fivekm data

		String finaltimesplit1P5 = totalminssplit1P5 + ":" + totalsecondssplit1P5;
		String finaltimesplit2P5 = totalminssplit2P5 + ":" + totalsecondssplit2P5; // making strings for each oof the split to be displayed in the chart.
		String finaltimesplit3P5 = totalminssplit3P5 + ":" + totalsecondssplit3P5;
		String finaltimewholeraceP5 = totalminswholeraceP5 + ":" + totalsecondswholeraceP5;

		System.out.println();
		System.out.println("Runner five Summary");
		System.out.println("------------------");
		System.out.println("Runner: " + nameP5);// %210 leaves just enough space for the input time, while %-20 has enough for most names.
		System.out.printf("%-20s%-10s\n", "Split One", finaltimesplit1P5); //%-20: the - puts the information on the left side(like a graph in Math)
		System.out.printf("%-20s%-10s\n", "Split Two", finaltimesplit2P5);
		System.out.printf("%-20s%-10s\n", "Split Three", finaltimesplit3P5);
		System.out.printf("%-20s%-10s\n", "Total time", finaltimewholeraceP5);

		System.out.println();
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "name", "Split One", "Split Two", "Split Three", "Total Time");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nameP1, finaltimesplit1P1, finaltimesplit2P1, finaltimesplit3P1, finaltimewholeraceP1);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nameP2, finaltimesplit1P2, finaltimesplit2P2, finaltimesplit3P2, finaltimewholeraceP2);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nameP3, finaltimesplit1P3, finaltimesplit2P3, finaltimesplit3P3, finaltimewholeraceP3);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nameP4, finaltimesplit1P4, finaltimesplit2P4, finaltimesplit3P4, finaltimewholeraceP4);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nameP5, finaltimesplit1P5, finaltimesplit2P5, finaltimesplit3P5, finaltimewholeraceP5);
		keyboard.close();

	}

}
