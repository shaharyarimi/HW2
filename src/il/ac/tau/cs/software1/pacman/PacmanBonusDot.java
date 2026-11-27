package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;

public class PacmanBonusDot extends PacmanBonus {

	public PacmanBonusDot(PacmanGridComponent initialPosition) {
		super(initialPosition);
		this.imageComponent = new ImageComponent("bonus-dot");
		this.bonusScore = 10;
	}

	// The two methods below belong to the Collectible interface (Question 8)

	@Override
	public float getWeight() {
		float weight = 1;
		return weight ;
	}

	@Override
	public float getPrice() {
		float price =12;
		return price;
	}
}
