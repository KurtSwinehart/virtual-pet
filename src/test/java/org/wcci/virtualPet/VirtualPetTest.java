package org.wcci.virtualPet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {

	int hungerLevel = 80;
	int thirstLevel = 70;
	int wasteLevel = 90;
	int boredomLevel = 90;
	int sicknessLevel = 70;
	int sleepinessLevel = 80;
	private VirtualPet underTest = new VirtualPet(hungerLevel, thirstLevel, wasteLevel, boredomLevel, sicknessLevel,
			sleepinessLevel);

	@Test
	public void shouldDecreaseHungerFrom80To30ByFeedingIt() {
		underTest.giveFood(50);
		int check = underTest.getHungerLevel();
		assertThat(check, is(30));
	}

	@Test
	public void shouldDecreaseThirstFrom70To40ByGivingWater() {
		underTest.giveWater(30);
		int check = underTest.getThirstLevel();
		assertThat(check, is(40));
	}

	@Test
	public void shouldDecreaseWasteFrom90To0ByTakingOutside() {
		underTest.takeOutside();
		int check = underTest.getWasteLevel();
		assertThat(check, is(0));
	}

	@Test
	public void shouldDecreaseBoredomFrom90To50ByPlaying() {
		underTest.playWithPet(40);
		int check = underTest.getBoredomLevel();
		assertThat(check, is(50));
	}

	@Test
	public void shouldDecreaseSicknessFrom70To10ByTakingToDoctor() {
		underTest.takeToDoctor(60);
		int check = underTest.getSicknessLevel();
		assertThat(check, is(10));
	}

	@Test
	public void shouldDecreaseSleepinessFrom80To20ByNapping() {
		underTest.takeNap(60);
		int check = underTest.getSleepinessLevel();
		assertThat(check, is(20));
	}

	@Test
	public void shouldIncreaseHungerBy20WhenTick() {
		underTest.tick();
		int check = underTest.getHungerLevel();
		assertThat(check, is(100));
	}

	@Test
	public void shouldIncreaseHungerBy40When2Ticks() {
		underTest.tick();
		underTest.tick();
		int check = underTest.getHungerLevel();
		assertThat(check, is(120));
	}

	@Test
	public void shouldIncreaseSleepinessBy20ByFeedingIt() {
		underTest.giveFood(50);
		int check = underTest.getSleepinessLevel();
		assertThat(check, is(100));
	}

	@Test
	public void shouldIncreaseWasteLevelByFoodAmountByFeedingIt() {
		underTest.giveFood(20);
		int check = underTest.getWasteLevel();
		assertThat(check, is(110));
	}

	@Test
	public void shouldDecreaseBoredomBy20WhenTakeOutside() {
		underTest.takeOutside();
		int check = underTest.getBoredomLevel();
		assertThat(check, is(70));
	}

	@Test
	public void shouldIncreaseBoredomBy40WhenTick() {
		underTest.tick();
		int check = underTest.getBoredomLevel();
		assertThat(check, is(130));
	}
}
