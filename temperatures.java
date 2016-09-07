// This is a skeleton for any java program
// author:  student name
import java.util.*;
public class temperatures 
{ // when used, the name of the new class will replace the class Skeleton
        public static void main(String[] args) 
        {  Scanner input = new Scanner(System.in);
	//this program calculates temperature of a locations 
	System.out.print("this progrm calculates and prints average monthly temperatures"); 
	// declare variables 
	double totalhigh=0, totallow=0, totalrange=0;
	int high, low, range;
	int count, zipcode;
	int average, highest, lowest, len;
	double percent;
	String [] months =  {"january", "fabruary", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
	String formathd = "months    high      low      range\n";
	width=formathd.length();	
	// ask and get the zipcode 
	System.out.print("what is the zipcode of the tempertures' location? ");
	zipcode=input.nextInt();
	
	
	// loop into input and add students points until you complete the number of students in the class 
	for(count=0; count<months.length; count++)	
		{
		// get the high average of the month
		System.out.print("enter the average high for"+months[count]);
		high[count]=input.nextInt();
		// get the low average of the month
		System.out.print("enter the average low for"+months[count]);
		low[count]=input.nextInt();
		// calculate the range
		range[count]=high[count]-low[count];
		
		// calculate the total of high low and range	
		totalhigh=high[count]+totalhigh;	
		totallow=low[count]+totallow;
		totalrange=range[count]+totalrange;	
			
			
		// pass all arrays to others methods
		double avghigh=average(high, 12);
		avghigh=average(low, 12);
		avghigh=average(range, 12);

		avghigh=highest(high,12);
		avghigh=highest(low, 12);
		avghigh=highest(range, 12);


		avghigh=lowest(high,12);
		avghigh=lowest(low,12);
		avghigh=lowest(range,12);
		}
	System.out.print("temperatures for zipcode: "+zipcode);
        System.out.print(formathd);
        for(int j = 0; j< months.length; j++){
			System.out.println(months[j]+ "   " + high[j]+ "          " + low[j]+"          "+ range[j]);
	}

        System.out.print("annual average:     "+avg1+"       "+avg2+"      "+avg3);
	System.out.print("highest month:      "+high[largest]+"   "+low[largest]+"   "+range[largest]);
        System.out.print("lowest month:       "+high[smallest]+"  "+low[smallest]+"   "+range[smallest]);
	}// end of main method
	{Public Static double average(int[]array, int len) 
	{	
	int totalavg1=0, totalavg2=0, totalavg3=0;
	int avg1, avg2, avg3;
	for (int i=0; i<month.length; i++) {
		totalavg1=high[i]+totalavg1;
	        avg1=totalavg1/12;
		
		totalavg2=low[i]+totalavg2;
		avg2=totalavg2/12;

		totalavg3=range[i]+totalavg3;
		avg3=totalavg3/12;
	}

	}
	}
       {public static int highest(int[]array, int len) 
	{ int largest = Integer.MIN_VALUE;
		for (int b=0;b<months.length;b++)
		{ if (high[b] > largest) {
			largest = high[b]; }

		if (low[b] > largest) {
			largest = low[b]; }
		
		if (range[b] > largest) {
			largest = range[b]; }
		}
	}
	}
       {public static int lowest(int[]array, int len)  
	{ int smallest = Integer.MAX_VALUE; 
		for (int f=0; f<month.length;f++) 
		{ if (smallest > high[f]) {
			smallest = high[f]; }
		
		if (smallest > low[f]) {
			smallest = low[f]; }

		if (smallest > range[f]) { 
			smallest = range[f]; }
		}
	}
       }
} // end of class        
