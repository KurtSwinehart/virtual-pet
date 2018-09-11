package org.wcci.virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	static Scanner input = new Scanner(System.in);
	static String menuOption;
	static String petName;

	public static void main(String[] args) {
		System.out.println("Please select a name for your new friend: ");
		petName = input.nextLine();
		VirtualPet myVirtualPet = new VirtualPet(40, 30, 30, 30, 0, 40);
		System.out.println(petName + " is a great name for a virtual pet!");
		System.out.println("Here are the initial levels for " + petName + ":");
		System.out.println(myVirtualPet);
		System.out.println(" ");
		System.out.println("What would you like to do with " + petName + "?");

		while (!menuOption.equals("0")) {
			menuOptions();
			menuOption = input.nextLine();

			if (menuOption.equals("0")) {
				System.out.println("Goodbye...take great care of " + petName + "!");
				System.exit(0);
			} else if (menuOption.equals("1")) {
				System.out.println("Enter the amount you would like to feed " + petName);
				int foodAmount = input.nextInt();
				myVirtualPet.giveFood(foodAmount);
				System.out.println("I'm sure " + petName + " is much happier now.");
				System.out.println("What else would you like to do with " + petName + "?");
				input.nextLine();
			} else if (menuOption.equals("2")) {
				System.out.println("Enter the amount of water you would like to give " + petName);
				int waterAmount = input.nextInt();
				myVirtualPet.giveWater(waterAmount);
				System.out.println("What would you like to do with " + petName + " now?");
				input.nextLine();
			} else if (menuOption.equals("3")) {
				System.out.println("Don't forget to take a bag to pick up " + petName + "'s waste");
				int wasteAmount = 30;
				myVirtualPet.takeOutside(wasteAmount);
				System.out.println("What else would you like to do with " + petName + "?");
				input.nextLine();
			} else if (menuOption.equals("4")) {
				System.out.println("How long would you like to play with " + petName + "?");
				int playAmount = input.nextInt();
				myVirtualPet.playWithPet(playAmount);
				System.out.println("You are such a good pet owner! I'm sure " + petName
						+ " had a great time playing! What's next?");
			} else if (menuOption.equals("5")) {
				System.out.println(
						"I'm sorry " + petName + " isn't feeling well. Hope the vet is able to help " + petName);
				int medicalCareProvided = 40;
				System.out.println("Hopefully " + petName + " is feeling better now. What would you like to do now?");
				myVirtualPet.takeToDoctor(medicalCareProvided);
			} else if (menuOption.equals("6")) {
				System.out.println("Must be nice to be a virtual pet and take a nap whenever you want!");
				System.out.println("How long did " + petName + " sleep for?");
				int lengthOfNap = input.nextInt();
				myVirtualPet.takeNap(lengthOfNap);
				System.out.println("What else would you like to do with " + petName + "?");
			} else if (menuOption.equals("7")) {
				System.out.println("Here are the current levels for " + petName + ":");
				System.out.println(myVirtualPet);
			} else if (menuOption.equals("8")) {
				System.out.println(menuOption);
			}
			menuOptions();
		}
	}

	static void menuOptions() {
		System.out.println("Press 1 to give " + petName + " food");
		System.out.println("Press 2 to give " + petName + " water");
		System.out.println("Press 3 to take " + petName + " outside");
		System.out.println("Press 4 to play with " + petName);
		System.out.println("Press 5 to take " + petName + " to the vet");
		System.out.println("Press 6 to let " + petName + " take a nap");
		System.out.println("Press 7 to get updated status");
		System.out.println("Press 8 to see menu options");
		System.out.println("Press 0 to exit");
		menuOption = input.nextLine();
	}
}