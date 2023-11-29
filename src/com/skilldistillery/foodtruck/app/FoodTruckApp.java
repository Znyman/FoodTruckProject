package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck fleet[] = new FoodTruck[5];
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		foodTruckApp.run();

	}

	public void run() {
		getFoodTruckInput();
		displayMenu();
		keyboard.close();
	}

	// get input for FoodTrucks
	public void getFoodTruckInput() {

		for (int i = 0; i < fleet.length; i++) {
			System.out.println("What is the name of the food truck?");
			String truckName = keyboard.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("What kind of food does the truck serve?");
			String truckFoodType = keyboard.nextLine();
			System.out.println("What is the rating for this food truck?");
			double truckRating = keyboard.nextDouble();
			fleet[i] = new FoodTruck(truckName, truckFoodType, truckRating);
			keyboard.nextLine();
		}
	}

	// display menu
	public void displayMenu() {

		int userOption = 0;

		while (userOption != 4) {
			System.out.println("(1) Would you like to list all existing food trucks?");
			System.out.println("(2) Would you like to see the average rating of the food trucks?");
			System.out.println("(3) Would you like to see the highest rated food truck?");
			System.out.println("(4) Would you like to quit the program?");
			System.out.println("Please enter the number corresponding to the menu item to choose your option.");
			System.out.println("Ex: Enter '1' to display all existing food trucks.");
			userOption = keyboard.nextInt();

			switch (userOption) {
			case 1:
				displayFoodTrucks();
				continue;
			case 2:
				System.out
						.println("The average rating for all entered food trucks is: " + calculateFleetRatingAverage());
				continue;
			case 3:
				System.out.println("The highest rated food truck is: " + findHighestRatedTruck());
				continue;
			case 4:
				System.out.println("Goodbye.");
				break;
			}
		}
	}

	// display food trucks
	public void displayFoodTrucks() {
		for (FoodTruck truck : fleet) {
			if (truck != null) {
				System.out.println(truck);
			}
		}
	}

	// calculate average
	public double calculateFleetRatingAverage() {
		double average = 0;
		int existingTrucks = 0;
		for (FoodTruck truck : fleet) {
			if (truck != null) {
				average += truck.getRating();
				existingTrucks++;
			}
		}
		return average /= existingTrucks;
	}

	// find highest rated truck
	public FoodTruck findHighestRatedTruck() {
		FoodTruck highestRatedTruck = fleet[0];
		for (FoodTruck truck : fleet) {
			if (truck != null) {
				if (truck.getRating() > highestRatedTruck.getRating()) {
					highestRatedTruck = truck;
				}
			}
		}
		return highestRatedTruck;
	}

}
