package AbstractClass;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.calculate();
		womenGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new WomenGameCalculator();
	}

}
