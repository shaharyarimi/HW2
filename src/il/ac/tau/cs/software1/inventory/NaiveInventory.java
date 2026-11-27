package il.ac.tau.cs.software1.inventory;

/*
 * A simple array-based Inventory (Question 6).
 */
public class NaiveInventory implements Inventory {

	private static final int INITIAL_CAPACITY = 100;

	private Collectible [] collectibles;
	private int counts = 0;
	//       - an array of Collectibles (it may be larger than the number of items actually stored)
	//       - an int that counts how many items are actually stored

	public NaiveInventory() {
		collectibles = new Collectible[INITIAL_CAPACITY];
	}

	@Override
	public void collect(Collectible collectible) {
		if (counts == collectibles.length){
			Collectible [] newColl = new Collectible [2*counts];
			for (int i=0; i< counts; i++)
			{
				newColl[i] = this.collectibles[i];
			}
			newColl[counts] = collectible;
			counts ++;
			this.collectibles = newColl;
		}
		else{
		    this.collectibles[counts] = collectible;
			counts ++;
		}


	}

	@Override
	public float getTotalWeight() {
		float sum = 0;
		for(int i =0; i<counts; i++){
			sum += collectibles[i].getWeight();
		}
		return sum;
	}

	@Override
	public int getCurrentCount() {
		return counts;
	}

	// Returns the array of Collectibles that is stored in the field of this class
	public Collectible[] getCollArr() {
		return collectibles;
	}
}
