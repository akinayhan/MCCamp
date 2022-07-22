
public class multiDimensionalArray {

	public static void main(String[] args) {
		
		String[][] city = new String [2][2];
		
		city[0][0] = "Bursa";
		city[0][1] = "Ýstanbul";
		city[1][0] = "Eskiþehir";
		city[1][1] = "Ankara";
		
		for(int i = 0; i<=1; i++) {
			for(int j = 0; j<=1; j++) {
				System.out.println(city[i][j]);
			}
		}

	}

}
