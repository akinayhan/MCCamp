import java.util.Scanner;

public class Example2107 {

	public static void main(String[] args) {
		
		/*
		//1) Klavyeden girilen 5 adet not bilgisinin ortalamas�n� alan program� yap�n�z.
		int score, counter=0;
		double avarage;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print(i+". S�nav Notunuzu Giriniz : ");
			score = input.nextInt();
			counter+=score;
		}
		avarage = counter/5;
		System.out.println("Not Ortalaman�z :" + avarage);
		*/
		
		
		/*
		//2) Klavyeden Girilen 10 adet notun en b�y�k ve en k�����n� bulan program� yap�n�z.
		Scanner scan = new Scanner(System.in);
		int score,max=0,min=0;
		for (int i=1; i<=10; i++)
        {
            System.out.print(i+". sayiyi giriniz: ");
            score = scan.nextInt();
            
            if (i==1)
            {
            	max=score;
                min=score;
            }
            
            if (score>max)
            	max=score;
            
            if (score<min)
                min=score;
        }
        
        System.out.println("Girilen Notlar ��inde En Y�kse�i : "+max);
        System.out.println("Girilen Notlar ��inde En D����� : "+min);
        */
		
		
		/*
		//3) Klavyeden girilen 5 adet say�n�n 10'dan b�y�k olanlar�n� sayan program� yap�n�z.
				int number, counter=0;
				Scanner input = new Scanner(System.in);
				for(int i=1;i<=5;i++) {
					System.out.print(i+". Say�y� Girin : ");
					number = input.nextInt();
					if(number>10) {
						counter++;
					}
				}
				System.out.println("10 dan b�y�k " + counter + " adet say� vard�r");		
		*/
		
		/*
		//4) klavyeden 0 say�s� girilene kadar say�lar okutunuz. irilen say�lar�n 2 kat�n� alarak ekrana sonucu yazd�r�n�z. (while-iken)
		
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Say� Girin : ");
			number = input.nextInt();
			System.out.println("Girilen Say�n�n 2 kat� : " + number*2);
		}	
		while (number != 0);
		*/
		
		/*
		//7)Klavyeden girilen 5 adet say�n�n tek tek karelerini alan program� yap�n�z.
		
		int number;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print(i+". Say�y� Girin : ");
			number = input.nextInt();
			System.out.println(i+ ". say�n�n karesi :" + number*number);
		}
		*/	
		
		
		
		//8)Klavyeden 3 not girilir. �lk notun %30'u, ikinci notun %30'u ve son notun da %40 �n� bulan program yap�n�z.
		//Sonu� olarak da 3 notun y�zdelerini toplay�p ekrana yazd�r�n�z.
		
		/*
		double exam1, exam2, exam3, average = 0, percentExam1, percentExam2, percentExam3;
		Scanner input= new Scanner(System.in);
	     
	     System.out.print("1. Vize Notunuzu Giriniz: ");
	     exam1 = input.nextDouble();
	     percentExam1= exam1*30/100;
	     System.out.println("1. S�nav�n %30'u :" + percentExam1);
	     
	     System.out.print("2. Vize Notunuzu Giriniz: ");
	     exam2=input.nextInt();
	     percentExam2= exam2*30/100;
	     System.out.println("2. S�nav�n %30'u :" + percentExam2);
	     
	     System.out.print("Final Notunuzu Giriniz: ");
	     exam3=input.nextInt();
	     percentExam3= exam3*30/100;
	     System.out.println("Final S�nav�n�n %40'� :" + percentExam3);
	     
	     average = percentExam1 + percentExam2 + percentExam3;
	     System.out.print("Sene Sonu Notunuz: " + average);
		*/
		
		/*
		//9) Klavyeden bir tam say� okutunuz. Bu Say� ile klavyeden okunan di�er 10 say�y� �arpma i�lemi uygulay�n�z.
		// Sonu�lar� ekrana yazd�r�n�z.
		Scanner input = new Scanner(System.in);
		double myNumber,number;
				System.out.print("Kendi Say�n�z� Se�iniz : ");
		myNumber = input.nextDouble();
		for(int i=1;i<=10;i++) {
			System.out.print("Bir say� Giriniz : ");
			number = input.nextDouble();
			System.out.println("Kendi Say�n�z �le �arp�m� : " + myNumber*number);
		}
		*/
		
	}
}
