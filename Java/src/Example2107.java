import java.util.Scanner;

public class Example2107 {

	public static void main(String[] args) {
		
		/*
		//1) Klavyeden girilen 5 adet not bilgisinin ortalamasýný alan programý yapýnýz.
		int score, counter=0;
		double avarage;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print(i+". Sýnav Notunuzu Giriniz : ");
			score = input.nextInt();
			counter+=score;
		}
		avarage = counter/5;
		System.out.println("Not Ortalamanýz :" + avarage);
		*/
		
		
		/*
		//2) Klavyeden Girilen 10 adet notun en büyük ve en küçüðünü bulan programý yapýnýz.
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
        
        System.out.println("Girilen Notlar Ýçinde En Yükseði : "+max);
        System.out.println("Girilen Notlar Ýçinde En Düþüðü : "+min);
        */
		
		
		/*
		//3) Klavyeden girilen 5 adet sayýnýn 10'dan büyük olanlarýný sayan programý yapýnýz.
				int number, counter=0;
				Scanner input = new Scanner(System.in);
				for(int i=1;i<=5;i++) {
					System.out.print(i+". Sayýyý Girin : ");
					number = input.nextInt();
					if(number>10) {
						counter++;
					}
				}
				System.out.println("10 dan büyük " + counter + " adet sayý vardýr");		
		*/
		
		/*
		//4) klavyeden 0 sayýsý girilene kadar sayýlar okutunuz. irilen sayýlarýn 2 katýný alarak ekrana sonucu yazdýrýnýz. (while-iken)
		
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Sayý Girin : ");
			number = input.nextInt();
			System.out.println("Girilen Sayýnýn 2 katý : " + number*2);
		}	
		while (number != 0);
		*/
		
		/*
		//7)Klavyeden girilen 5 adet sayýnýn tek tek karelerini alan programý yapýnýz.
		
		int number;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print(i+". Sayýyý Girin : ");
			number = input.nextInt();
			System.out.println(i+ ". sayýnýn karesi :" + number*number);
		}
		*/	
		
		
		
		//8)Klavyeden 3 not girilir. Ýlk notun %30'u, ikinci notun %30'u ve son notun da %40 ýný bulan program yapýnýz.
		//Sonuç olarak da 3 notun yüzdelerini toplayýp ekrana yazdýrýnýz.
		
		/*
		double exam1, exam2, exam3, average = 0, percentExam1, percentExam2, percentExam3;
		Scanner input= new Scanner(System.in);
	     
	     System.out.print("1. Vize Notunuzu Giriniz: ");
	     exam1 = input.nextDouble();
	     percentExam1= exam1*30/100;
	     System.out.println("1. Sýnavýn %30'u :" + percentExam1);
	     
	     System.out.print("2. Vize Notunuzu Giriniz: ");
	     exam2=input.nextInt();
	     percentExam2= exam2*30/100;
	     System.out.println("2. Sýnavýn %30'u :" + percentExam2);
	     
	     System.out.print("Final Notunuzu Giriniz: ");
	     exam3=input.nextInt();
	     percentExam3= exam3*30/100;
	     System.out.println("Final Sýnavýnýn %40'ý :" + percentExam3);
	     
	     average = percentExam1 + percentExam2 + percentExam3;
	     System.out.print("Sene Sonu Notunuz: " + average);
		*/
		
		/*
		//9) Klavyeden bir tam sayý okutunuz. Bu Sayý ile klavyeden okunan diðer 10 sayýyý çarpma iþlemi uygulayýnýz.
		// Sonuçlarý ekrana yazdýrýnýz.
		Scanner input = new Scanner(System.in);
		double myNumber,number;
				System.out.print("Kendi Sayýnýzý Seçiniz : ");
		myNumber = input.nextDouble();
		for(int i=1;i<=10;i++) {
			System.out.print("Bir sayý Giriniz : ");
			number = input.nextDouble();
			System.out.println("Kendi Sayýnýz Ýle Çarpýmý : " + myNumber*number);
		}
		*/
		
	}
}
