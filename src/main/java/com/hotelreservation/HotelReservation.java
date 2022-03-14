package com.hotelreservation;

import java.util.ArrayList;

public class HotelReservation {

	//ArrayList of class Hotel 
	private static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	
	public ArrayList<Hotel> getHotelList() {
		return hotelList;
	}

	/*Add hotel from Hotel.java
	 * creating object oh hotel class
	 * add object to ArrayList  to store Hotel data
	 * */
	public static void addHotel(String name, int price) {
		Hotel hotel = new Hotel(name, price);
		hotelList.add(hotel);
	}

	public static int countNoOfHotels() {
		return hotelList.size();//getting no of hotels
	}

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system");
		//Added hotel name and their Rate for Regular Customer according to given usecase
		Hotel lakeWood = new Hotel("Lakewood", 110 );
		Hotel bridgeWood = new Hotel("Bridgewood", 160);
		Hotel ridgeWood = new Hotel("Ridgewood", 220);
		hotelList.add(lakeWood);
		hotelList.add(bridgeWood);
		hotelList.add(ridgeWood);
		System.out.println(hotelList);
	}
}