
public class exceptionHandling {

	public static void main(String[] args) {
		 
		
		try {
			int[] number = new int[] {1,2,3};
			 System.out.println(number[5]);
		}catch(StringIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}catch(Exception exception) {
			System.out.println("Loglandý" + exception);
		}finally {
			System.out.println("Her türlü çalýþan bölüm");
		}
		 
		 
	}

}
