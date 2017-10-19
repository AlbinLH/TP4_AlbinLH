package tp4;

public class LongestDiagonal {
	
	static public double Distance(int a, int b, int c, int d) {
		double distance;
		distance = Math.sqrt(Math.pow(b-a, 2)+Math.pow(d-c, 2));
		return distance;
	}
	
	static public double Diago(int [][] tab) {
		int a;
		int b;
		int c;
		int d;
		double distance;
		double max = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = i; j < tab.length; j++) {
				a = tab[i][0];
				b = tab[i][1];
				c = tab[j][0];
				d = tab[j][1];
				distance = Distance(a, b, c, d);
				if (distance > max) {
					max = distance;
				}
			}
		}
		return(max);
	}
	
	
	
	
	
}