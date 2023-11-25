package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	private static int nextTruckId;
	private int truckId;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck(String name, String foodType, double rating) {
		this.truckId = ++nextTruckId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return name + " which serves " + foodType + ", has a rating of " + rating + ", and it's truck ID is: " + truckId + ".";
	}
}
