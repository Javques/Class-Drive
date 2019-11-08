//--------------------------------------
// Assignment 3 (Q2)
// Written by: Alexis Bolduc 40126092
// For COMP 248 Section FF - Fall 2019
//--------------------------------------
//Welcome to question2 of assignment 3
//purpose create a simple class
public class CPU {
	private int  generation;
	private String series;
	private double price;
	private double speed;
	private String launchDate;
	private boolean sgx; 
	
	//No arg constructor
	public CPU () {
		generation = 1 ; 
		series  = "i3";
		price = 117;
		speed = 2.93;
		launchDate = ("Q1'10");
		sgx = false; 
	}
	// Arguments set variables as supplied
	public CPU (int generation, String series, double price, double speed, String launchDate, boolean sgx) {
		this.generation = generation;
		this.series = series;
		this.price = price;
		this.speed = speed;
		this.launchDate = launchDate;
		this.sgx = sgx;
	}
	//Accessor methods
	public int getGeneration() {
		return generation;
		}
	public String getSeries() {
		return series;
	}
	public double getPrice() {
			return price;
		}
	public double getSpeed(){
		return speed;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public boolean getSgx() {
		return sgx; 
	}
	
	//mutator for the price 
	public void setPrice(double price) {
		this.price = price;
		
	}
	// priceNow method
	public double priceNow(String sQuarterYear) {
		//since the format is always the same for the quarter and year
		// we can use the substring of launchDate to determine the quarter
		// and year as 2 separate integers
		String quarterThenString = launchDate.substring(1,2);
		int quarterThen = Integer.parseInt(quarterThenString);
		String yearThenString = launchDate.substring(3);
		int yearThen = Integer.parseInt(yearThenString);
		String quarterNowString = sQuarterYear.substring(1,2);
		int quarterNow = Integer.parseInt(quarterNowString);
		String yearNowString = sQuarterYear.substring(3);
		int yearNow = Integer.parseInt(yearNowString);
		//
		int quarterTot = (yearNow-yearThen)*4 + (quarterNow-quarterThen);
		//if the sQuarterYear is before the launchDate, it will give a negative quarterTot
		// we will return the original price in that case since it has not been launched yet
		if (quarterTot < 0)
			return price;
		// the price if all goes well
		double priceNow = price - (price*quarterTot*0.02);
		// the price cannot be smaller than 0
		if (priceNow < 0)
			return 0; 
		return priceNow; 
	}
	// toString method 
	public String toString() {
		return "This CPU is "+ generation + "th generation " + series + " ("+ speed+ "GHz), launched: "+ launchDate+
				" with price: " + String.format("%.2f", price) + " USD. SGX is " + (sgx?"supported.":"not supported.");
	}
	//equals method
	public boolean equals(CPU other) {
		return(generation == other.generation && sgx== other.sgx && series.equalsIgnoreCase(other.series));
	
	}
	//isHigher method
	public boolean isHigherGeneration(CPU other) {
		return(generation > other.generation);
		 
	}
		

	
	
}
