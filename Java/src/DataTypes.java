
public class DataTypes {

	public static void main(String[] args) {
		
		
		byte pByte=127;
		byte nByte = -128;
        short pShort = 32767;
        short nShort = -32768;
        int nInt = -2147483648;
        int pInt = 2147483647;
        long pLong= 999999999999999999L;
        long nLong= -999999999999999999L;
        float nFloat= -42.8f;
        float pFloat= 42.8f;
        double myDouble=8.58;
        char myChar='A';
        boolean myBoolean=true;
        String myText="Merhaba";
        

        System.out.println(
        		myText+
        		"\nByte Pozitif De�eri:"+pByte+
        		"\nByte Negatif De�eri:"+nByte+
        		"\nShort Pozitif De�eri:"+pShort+
        		"\nShort Negatif De�eri:"+nShort+
        		"\nInteger De�eri:"+nInt+
        		"\nInteger De�eri:"+pInt+
        		"\nLong Negatif De�eri:"+ nLong+
        		"\nLong Pozitif De�eri:"+ pLong+
        		"\nFloat Negatif De�eri:"+nFloat+
        		"\nFloat Pozitif De�eri:"+pFloat+
        		"\nDouble De�eri:"+myDouble+
        		"\nChar De�eri:"+myChar+
        		"\nBoolean De�eri:"+myBoolean);			
        
        System.out.println("");
        
        
        
        String[] sehirler1 = new String[] {"Bursa","�stanbul","Ankara"};
        String[] sehirler2 = new String[] {"�zmir","Antalya","Mu�la"};
        sehirler2=sehirler1;
        sehirler2[1] = "Eski�ehir";
        System.out.println(sehirler1[1]);
        System.out.println(sehirler2[1]);
        
        
        int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1=sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		System.out.println("\t");
		
		String s1 = new String("test1");
		String s2 = new String("test1");
		boolean referance = s1== s2;
		boolean content = s1.equals(s2);
		boolean num = 5 == 4;
		boolean ch = 't' == 'y';
		
		System.out.println("Referans kar��la�t�rmas� : " + referance);
		System.out.println("��erik kar��la�t�rmas� : " + content);
		System.out.println("Say� kar��la�t�rmas� : " + num);
		System.out.println("Karakter kar��la�t�rmas� : " + ch);
        
	}
}
