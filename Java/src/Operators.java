
public class Operators {

	public static void main(String[] args) {
		int a = 2;
		int b = a+2;  
		int c = a+b;
		int d = c++;
		int e = 1;
		e+=d;

		System.out.println("b = " + b);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		boolean sonuc = (a == b); // !=
		System.out.println(sonuc);
		
		
		
		a=1;b=1;c=0;   
		boolean sart1 = a==b;
		boolean sart2 = a==c;
		
		boolean sonuc1 = sart1 && sart2;
		boolean sonuc2 = sart1 || sart2;
		System.out.println("ilk �art : " + sart1);
		System.out.println("ikinci �art : " + sart2);
	
		System.out.println("ve ba�lac� : "+ sonuc1 + " veya ba�lac� : "+ sonuc2);
		
		String yazi1 = sonuc1 ? "Do�ru" : "Yanl��";
		String yazi2 = sonuc2 ? "Do�ru" : "Yanl��";
		
		System.out.println(yazi1 +"\t"+ yazi2);
		
		
		int t = 10;
		System.out.println(t == 't');
		
		
		
		
		
	}

}
