
public class Methods {

	public static void main(String[] args) {
		
		
		add();
		
		String message = giveCity();
		System.out.println(message);
		
		int number = plus(5,7);
		System.out.println(number);
		int total = plus(1,2,3,4,5);
		System.out.println(total);
		
	}
	
	public static void add() {
		System.out.println("Eklendi");
	}
	
	public static void delete() {
		System.out.println("Silindi");
	}
	
	public static void update() {
		System.out.println("Güncellendi");
	}
	
	public static int plus(int number1,int number2) {
		return number1+number2;
	}
	
	public static String giveCity() {
		return "Bursa";
	} 
	
	public static int plus(int... numbers) {
		int total = 0;
		for (int number:numbers) {
			total+=number;
		}
		return total;
	} 
	
}
