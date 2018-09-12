package org.wcci.virtualPet;

public class VirtualPet {

	private int hungerLevel;
	private int thirstLevel;
	private int wasteLevel;
	private int boredomLevel;
	private int sicknessLevel;
	private int sleepinessLevel;

	public VirtualPet(int hungerLevel, int thirstLevel, int wasteLevel, int boredomLevel, int sicknessLevel,
			int sleepinessLevel) {
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
		this.boredomLevel = boredomLevel;
		this.sicknessLevel = sicknessLevel;
		this.sleepinessLevel = sleepinessLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getSicknessLevel() {
		return sicknessLevel;
	}

	public int getSleepinessLevel() {
		return sleepinessLevel;
	}

	public void giveFood(int foodAmount) {
		hungerLevel -= foodAmount;
		sleepinessLevel += 20;
		wasteLevel += foodAmount;
	}

	public void giveWater(int waterAmount) {
		thirstLevel -= waterAmount;
		hungerLevel -= 20;
		wasteLevel += waterAmount;
	}

	public void takeOutside() {
		wasteLevel -= wasteLevel;
		hungerLevel += 30;
		boredomLevel -= 20;
		sleepinessLevel += 20;
	}

	public void playWithPet(int playAmount) {
		boredomLevel -= playAmount;
		sleepinessLevel += 30;
	}

	public void takeToDoctor() {
		sicknessLevel -= sicknessLevel;
		boredomLevel += 30;
		hungerLevel += 20;
	}

	public void takeNap() {
		sleepinessLevel -= sleepinessLevel;
		boredomLevel -= 30;
	}

	public void tick() {
		hungerLevel += 20;
		thirstLevel += 20;
		boredomLevel += 40;
		sleepinessLevel += 30;
	}

	public String toString() {
		return "Hunger Level = " + this.getHungerLevel() + "; " + "Thirst Level = " + this.getThirstLevel() + "; "
				+ "Waste Level = " + this.getWasteLevel() + "; " + "Boredom Level = " + this.getBoredomLevel() + "; "
				+ "Sickness Level = " + this.getSicknessLevel() + "; " + "Sleepiness Level = "
				+ this.getSleepinessLevel();

	}
}
