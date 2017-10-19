package tp4;

import java.util.Random;

public class RandTabGenerator {
	static public int[] generate(int size) {
		int[] tab = new int[size];
		Random rand = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = rand.nextInt();
		}
		return tab;

	}
}
