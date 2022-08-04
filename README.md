# MCCamp

18.07.2022
Pazartesi
Android Nedir ? 
	Android nedir sorusunun en basit tanımı “Bir işletim sistemidir”. 23 Eylül 2008 de ilk kez piyasaya çıkmıştır. Google ve Open Handset Alliance tarafından geliştirilmektedir. 
•	Linux tabanlıdır. 
Burada linux nedir sorusuna kısaca cevap vermek gerekirse “C ve Assembly” dilleri ile geliştirilen açık kaynak kodlu ücretsiz bir bilgisayar işletim sistemidir.
•	Özgür ve ücretsizdir
•	Açık kaynak kodludur.
Açık kaynak kod ise kısaca yazılım ile beraber kodlarınında beraberinde dağıtılmasıdır. İnceleme, değiştirme, geliştirme olanaklarını da bizlere sunar.
•	Multi-touch kullanır.
•	
VERİ TİPLERİ VE DEĞİŞKENLER
camelCasing : Paket isimleri, metod isimleri, değişken isimleri

Pascal Case : Proje isimleri, sınıf isimleri

Reusebility: tekrar tekrar kullanılabilirlik

boolean	True or false	1 byte		
char	Karakter	2 bytes	Tek karakter	single
byte	İnteger	1 byte	-128 	127
short	İnteger	2 bytes	-32768 	32767
İnt	İnteger	4 bytes	-2.147.483.648	2.147.483.647
long	İnteger	8 bytes	-2^63	2^63+1
float	İnteger	4 bytes		
double	integer	8 bytes	4.9*10^-324	1.8*10^308


Elbetteki bu tipleri sahip oldukları değer aralıklarına göre kullanmak çok mantıklı olmayacaktır. Bunun yerine tecrübe ettikçe hangi işlem için hangi veri tipi kullanılır rahatlıkla karar verebilirsiniz. Örneğin programda kullanıcının yaşıyla işlem yapacaksanız int veya bir dosyadaki verileri okuyacaksanız byte veri tipini kullanmanız en mantıklı yöntem olacaktı

Tc kimlik matematiksel işlem yapılmadığından metinsel tutulabilir. Genellikle Long olarak tutulur
Java karakter 16 bit Unicode

lengh(): İfadenin karakter uzunluğunu öğrenmek için kullanılır.
charAt(): İfade içindeki sorgulanan indise ait karakteri döndürür. İfadenin 0'dan başladığını unutmayın.
substring: İfadenin başlangıç ve bitiş indisleri arasındaki karakterleri döndürür.
lastindexOf: İfade içindeki sorgulanan karakterin bulunduğu son pozisyonu döndürür.
replace(x,y): İfade içindeki karakterler ile verilecek gelişi güzel karakterin yerini değiştirir.
toUpperCase: İfadenin karakterlerini büyük yapar.
toLowerCase: İfadenin karakterlerini küçük yapar.
parse: String veri tipini diğer veri tiplerine dönüştürür.
String ifadelerde karşılaştırma için equals() metodu ile yapılır.


 
19.07.2022
Salı
OPERATÖRLER
Aritmetik Operatörler
Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.
•	Toplama : a + b
•	Çıkarma : a – b
•	Çarpma : a * b
•	Bölme : a / b
•	Mod alma : a % b
•	1 arttırma : a++
•	1 eksiltme : b--
Karşılaştırma Operatörleri
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.
•	Eşitlik : a == b
•	Eşit Değil : a != b
•	Büyüktür : a > b
•	Küçüktür : a < b
•	Büyük Eşittir : a >= b
•	Küçük Eşittir : a <= b
Mantıksal Operatörler
Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.
•	Ve : a && b
•	Veya : a || b
•	Değil : !(a&&b)
Koşul Operatörü
Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.
•	a = 5 ;
•	b = (a == 1) ? 1 : 0
•	Çıktısı : 0








 
20.07.2022
Çarşamba
KONTROL YAPILARI
(İF-ELSE,SWİTCH-CASE)

İnsanlar durumlar karşısında çeşitli kararlar verirler ve bu kararlar farklı tepkiler ortaya çıkarır. Kontrol yapıları sayesinde programımıza hangi durumda nasıl karar vereceğini öğretip ona göre kodluyoruz.
İf-Else bloğunu basit bir şekilde anlatmak gerekirse;
eğer (şart doğru ise){
buradaki seçenek çalışır
}
değilse{
buradaki seçenek çalışır
}
Şeklinde çalışır.

Basit bir şekilde örneklendirmek gerekirse 
		int number = 9;
		if(number <10) {
			System.out.println("sayı 10 den küçüktür");
		}

Yukarıdaki örneği biraz daha genişletebiliriz. (else kullanımı)

		int number = 11;
		if(number <10) {
			System.out.println("sayı 10 den küçüktür");
		}else {
			System.out.println("Sayı 10 dan küçük değildir");
		}
Birden fazla şart koymak zorundaysak (else if kullanımı)
		int number = 10;
		if(number <10) {
			System.out.println("sayı 10'dan küçüktür.");
		}else if(number ==10){
			System.out.println("Sayı 10'a eşittir.");
		}
		else {
			System.out.println("Sayı 10'dan büyüktür.");
		}
	Switch-Case bloğunu basit bir şekilde anlatmak gerekirse;
switch (koşul){
case koşul1 doğru ise:
buradaki seçenek çalışır
dur
case koşul2 doğru ise:
buradaki seçenek çalışır
dur
}
Şeklinde çalışır.
	Basit bir şekilde örneklendirmek gerekirse;
		String grade = "CB";
		
		switch(grade) {
		case "AA":
			System.out.println("Mükemmel Not ! Geçtiniz.");
			break;
		case "BB":
			System.out.println("Süper Not ! Geçtiniz.");
			break;
		case "CB":
		case "CC":
			System.out.println("İyi Not ! Geçtiniz.");
			break;
		case "DD":
			System.out.println("Kötü Not ! Şartlı Geçtiniz.");
			break;
		case "FF":
			System.out.println("Kötü Not ! Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");
		}
 
21.07.2022
Perşembe
DÖNGÜLER
(For, While, Do-While)
Döngüler, belirli bir koşul sağlanana kadar devam eden bloklardır.
For döngüsü ile yapılan her şey while döngüsü ile, while döngüsü ile yapılan her şey for döngüsü ile de yapılabilir.
Ne kadar döndüğünü bilmediğimiz döngülerde genellikle while 
For Döngüsü
		for (int i=1;i<5;i++) {
			System.out.println(i);
		}
Çıktısı:
1
2
3
4

While Döngüsü
int i = 1;
		while(i<5) {
			System.out.println(i);
			i++;
		}
Çıktısı:
1
2
3
4
Do-While Döngüsü
int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
Çıktısı:
1
2
3
4
Örnek: Kullanıcıdan negatif sayı girene kadar sayı isteyen program.
System.out.print("Sayı Girin : ");
		Scanner input = new Scanner(System.in);
		int number;
		number = input.nextInt();
		while (number>0) {
			System.out.print("Sayı girin: ");
			number = input.nextInt();
		}
		
Aynı örneği Do-While ile yapalım
Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Sayı Girin : ");
			number = input.nextInt();
		}	
                   while (number>0);














22.07.2022
Cuma
DİZİ VE KOLEKSİYONLAR
Dizi örneği:
		String[] students = new String[3];
		students[0]="isim1";
		students[1]="isim2";
		students[2]="isim3";
		
		/*
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		*/
		
		for(String student:students) {
			System.out.println(student);
		}
Çok Boyutlu Dizi Örneği:
String[][] city = new String [2][2];
		
		city[0][0] = "Bursa";
		city[0][1] = "İstanbul";
		city[1][0] = "Eskişehir";
		city[1][1] = "Ankara";
		
		for(int i = 0; i<=1; i++) {
			for(int j = 0; j<=1; j++) {
				System.out.println(city[i][j]);
			}
		}
Koleksiyon Örneği:
double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		for (double number:myList) {
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
Koleksiyon Örneği:
double[] myList = {1.2,1.3,4.3,5.6,4};
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}}
		System.out.println("En Büyük sayı : " + max);
 
23.07.2022
Cumartesi
METOTLAR

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
 
25.07.2022
Pazartesi
TRY-CATCH EXCEPTİON

 

Basit try-catch örneği;
try {
			int[] number = new int[] {1,2,3};
			 System.out.println(number[5]);
		}catch(Exception exception) {
			System.out.println(exception);
		}finally {
			System.out.println("Her türlü çalışan bölüm");
		}
Exception örneği;
try {
			int[] number = new int[] {1,2,3};
			 System.out.println(number[5]);
		}catch(StringIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}catch(Exception exception) {
			System.out.println("Loglandı" + exception);
		}finally {
			System.out.println("Her türlü çalışan bölüm");
		}
 
25.07.2022
Pazartesi
TREADİNG
package Threading;

public class StopwatchThread implements Runnable{

	private Thread thread;
	private String threadName;
	
	public StopwatchThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluşturuluyor : " + threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Çalıştırılıyor : " + threadName);
		try {
			for(int i=1; i<=10; i++) {
				System.out.println(threadName+" : " + i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException exception){
			System.out.println("Kesildi : "+threadName);
		}
		System.out.println("Thread bitti : "+ threadName);
	}
	public void start() {
		System.out.println("Thread nesnesi oluşuyor");
		if(thread==null) {
			thread = new Thread(this,threadName);
			thread.start();
		}
	}
}

package Threading;

public class Threading {

	public static void main(String[] args) {
		StopwatchThread thread1 = new StopwatchThread("thread1");
		StopwatchThread thread2 = new StopwatchThread("thread2");
		StopwatchThread thread3 = new StopwatchThread("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}
}
Çıktısı:

Oluşturuluyor : thread1
Oluşturuluyor : thread2
Oluşturuluyor : thread3
Thread nesnesi oluşuyor
Thread nesnesi oluşuyor
Thread nesnesi oluşuyor
Çalıştırılıyor : thread1
Çalıştırılıyor : thread2
thread1 : 1
thread2 : 1
Çalıştırılıyor : thread3
thread3 : 1
thread1 : 2
thread3 : 2
thread2 : 2
thread3 : 3
thread1 : 3
thread2 : 3
thread3 : 4
thread1 : 4
thread2 : 4
thread3 : 5
thread1 : 5
thread2 : 5
thread3 : 6
thread1 : 6
thread2 : 6
thread3 : 7
thread1 : 7
thread2 : 7
thread3 : 8
thread1 : 8
thread2 : 8
thread3 : 9
thread1 : 9
thread2 : 9
thread3 : 10
thread1 : 10
thread2 : 10
Thread bitti : thread3
Thread bitti : thread1
Thread bitti : thread2

 
27.07.2022
Çarşamba
CLASS
CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

	STACK
101	customerManager1
102	customerManager2
	
	
HEAP
{add1,update1,del1}
{add2,update2,del2}



----------------------
----------------------



CustomerManager customerManager = new CustomerManager();  //Garbange collection
	CustomerManager customerManager2 = new CustomerManager();
	customerManager=customerManager2;
	customerManager.Add();
	customerManager.Remove();
	customerManager.Update();
	STACK
102	customerManager1
102	customerManager2
	
	

	STACK
101	customerManager1
102	customerManager2
	
	
HEAP
{add1,update1,del1}
{add2,update2,del2}



--------------
--------------


*New pahalıdır. Sadece ihtiyaç duyulduğunda kullanılmalıdır.
CustomerManager customerManager;








Değer Tip Referans Tip

Değer Tip : integer,double, float byte değişkenleri değer tiptir. Value Type
Her şey stack te oluşur. 
int number1 = 10;
	int number2 = 20;
		
	number2 = number1;
	number1=30;
	System.out.println("number2 : " + number2);
Çıktısı: 10
Referans Tip : Diziler referans tiptir. 	
	int[] numbers1 = new int[]{1,2,3};
	int[] numbers2 = new int[]{4,5,6};
	numbers2 = numbers1;
	numbers1[0]=10;
	System.out.println("ikinci dizinin ilk elemanı : " + numbers2[0]);
	Çıktısı: 10
Değerler Heap te oluşur. İki değişken aynı nesneyi tutar. (Aslında bir nesne vardır.)

OVERLOADING (Üzerine Yazma)
Bütün operasyonlar için ortak kod yazılırken operasyona özel de kod yazılabilir. Özel kod ortak kodu ezer.

public class Calculate {
	public int plus(int number1,int number2) {
		return number1+number2;
	}	
	
	public int plus(int number1,int number2,int number3) {
		return number1+number2+number3;
	}
}

		Calculate calculate = new Calculate();
		calculate.plus(2, 3);
		calculate.plus(2,3,5);
 
28.07.2022
Perşembe

ABSTRACT CLASS
•	Classlar ile yapısal anlamda bir farkı yoktur. 
•	Bir class sadece bir sınıfı intehit (miras alabilir) edebilir. 
•	Abstract bir sınıfın abstract olabilmesi için absctract imzası ile beslenmesi gerekli.
•	Abstract bir sınıfın abstract olabilmesi için absctract imzası ile beslenmesi gerekli.
•	Abstract bir classta illa bir abstract olmak zorunda değil. 
(tamamlanmış operasyon/abstract operasyon/ikisi de )
•	Abstract classlar asla new lenemez. (ezilerek kullanılabilir ama tavsiye edilmez.)


INTERFACES
•	Bir class kabul edilmezler. Classlar gibi referans tutabilirler. 
•	Bir class birden fazla interface yi implement edebilir.
•	Interface’ler de abstract’lar gibi new’lenemezler.


Bir class birden fazla interface’yi implemente edebilir.
İnterfaceler referans tutucu olarak kullanılır.
 
29.07.2022
Cuma
INHERITENCE (Miras)
İki nesne arasında miras durumu. Bir nesne diğerine miras bırakır.
Yazılımcının amacı değişime direnmeyen programlar yazmaktır.

POLİMORFİZM (Çok Biçimlilik)
Referans tiplerin birbirinin(aralarında inheritence olan) referansını tutması itibari ile olan durumdur.

 
	30.07.2022
Cumartesi
OVERRİDİNG
Java Overriding Kullanım Kuralları
•	Üst sınıf içerisinde yer alan private metotlar override işlemine tabi tutulmaz. Aksi takdirde hata alınır.
•	Override ettiğimiz bir metodun erişim belirleyicisinin seviyesini düşüremeyiz fakat yükseltebiliriz.
•	Üst sınıftan miras aldığımız bir metodun dönüş tipini veya parametrelerini değiştiremeyiz.
•	Static ve Final olarak tanımlı metotları override edemeyiz.
•	Üst sınıfımızdaki ve alt sınıfımızda bulunan override edeceğimiz metot isimleri aynı olmalıdır.
•	Constructor (Yapıcı / Kurucu) metotlar override edilemez.
Java Overriding Kullanımının Avantajları
•	Temiz, sade ve anlaşılır kod satırları oluşturmamıza imkan sağlar.
•	Bir sınıfın hangi yapıda duruş sergileyeceğini ve metotların işlevlerinin nasıl uygulanacağını tanımlamamıza imkan sağlar.

 
01.08.2022
Pazartesi
CLASES WİTH ATTRIBUTES
Classlar ilgili operasyonları özellikleri tutarlar. Bir class ın içerisinde başka bir class ı kullanabiliriz. 
Single responsibilty principle   
Tek sorumluluk prensibi : bir class sadece bir işi yapar. Bir metod bir if bloğu sadece bir iş yapar.
Product : ürün nesnesine ait özellikler
ProductManager: ürün ile ilgili operasyonlar. (add,update…)

ENCAPSULATION

Kullanıcıyı herhangi bir alanı kullanmak için kısıtlamayı öngörür.
public class Product {
	
	private int id;         //private sadece tanımlandığı blokta geçerlidir
	String name;            //default public gelir
	String description;
	double price;
	int stockAmount;
private String code;  //özel

	
}

GETTER-SETTER
this : içinde bulunulan class

Sınıfımıza ait private değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için Getter metodu yazmalıyız. Nesneye ait bu metot çağrıldığında geriye bir değer döndürmeli ve bu değer bizim istediğimiz private değişken olmalı.

Biz getter metodu ile private olan değişkenimize ulaştık. Peki bu değişkenin değerini değiştirmek istediğimizde ne yapmalıyız ? Bir sınıfa ait private bir değişkenin değerini değiştirmek için, setter metodu yazılmalıdır.
 
01.08.2022-02.08.2022
Çarşamba-Perşembe
SOLID NEDİR ? 

Yazılımda sürdürülebilirliği desteklemek adına kullanılan prensiplerdir.
Yazılım: İnsanların gündelik aktivitelerinin bilgisayar sistemleri ile kolay hale getirilmesi.
Yazılımda değişim dediğimiz olay söz konusudur. Sürekli yeni ihtiyaçlar sürekli düzenlemeler yazılımın doğasında vardır. Yazılım yap bitir değildir. Mevzuatlar değişir, insanların ihtiyaçlı değişiyor, daha iyi daha performanslı hale getirilmesi gerekiyor bu yüzden sürdürülebilir yazılım çıkartmamız gerekiyor.

Değişiklik geldiğinde direnç göstermemelidir. 

SOLİD PRENSİPLERİ:
•	Single Responsibility
•	Open Closed
•	Liskov’s Substitution
•	Interface Segregation
•	Dependency Inversion

Single Responsibility (Tek Sorumluluk Prensibi)
Yazılım geliştirirken her bloğun her her metodun her class ın her katmanın sadece ve sadece bir görevi vardır. Hiçbir zaman bir bloğun içinde iki tane iş yapımaz. Bir class ın içinde iki farklı nesne üretilemez. Bir katmanda o katmanın dışında iş yapılmaz.


Open Closed Principle(Açıklık-Kapalılık)
	Gelişime açık değişime kapalılık.
Örneğin;
Class CustomerDal  {
Public void add(Database database)  {
İf(database == Database.Oracle)
		{ görev}
Else if (databse == Database.SqlServer)
{görev}
YERİNE;

{
//(new lemek sağlıklı değildir.)
//IOC Container (Ninject,AutoFac, StrıctıreMap, Castle Windsor)
CustomerManager customerManager = new CustomerManager(new EFCustomerDal());
customerManager.Add()
}

	Class CustomerManager  :ICustomerService{
Private ICustomerDal _customerDal;
		Public CustomerManager(ICustomerDal customerDal)   {
			_customerDal = customerDal;  }
Public void add(){ 
_customerDal.Add();   }
class EFCustomerDal : ICustomerDal  {
	public void add(){
		sysout(“ADDED BY EF”)   }}
class NhCustomerDal : ICustomerDal  {
	public void add(){
		sysout(“ADDED BY NH”)   }}
class DapperCustomerDal : ICustomerDal   {
	public void add(){
		sysout(“ADDED BY Dapper”)   }}
internal interface ICustomerDal   { 
void Add()    }

Loosely Coupled (Gevşek bağlılık) 

Liskov Substitution Principle(  )
•	Nesneler sırf birbirine benziyor diye birbirinin yerine kullanılmaz.
•	Alt sınıflar türetilen üst sınıflar yerine kullanılır.
Müşteri  Bireysel Müşteri
	    Kurumsal Müşteri
Örneğin;
Class Customer {
	int Id;
	String customerNumber;
Class Customer extends Customer{
	String firstName;
	String lastName;
String tcNo:
Class Customer extends Customer {
	String vergiNo:
	String unvan;


Interfaces Segregation()
•	Tek arayüz yerine birden fazla daha özel arayüz kullanılmalıdır.
•	İnterfaceler doğru parçalara ayrılmalıdır.
Örneğin ;
İnterface IPayable {
Void Pay();
İnterface IWorkable {
Void Work();
İnterface IEatabe {
Void Eat(); 
Class CompanyWorker :IWorker, IEatable, IPayable {
	Public void Eat() {}
	Public void Pay () {}
	Public void Work() {}
Class OutsourceWorker :IWorker, IPayable {
	Public void Pay () {}
	Public void Work() {}
Class CompanyWorker :IWorker {
	Public void Work() {}

Dependency Inversion()
•	Bir katman başka bir katmana gevşek bağımlı olmalıdır. 
•	İki class birbiri içerisinde new’lenmez. 
•	Bağımlılıklar olabildiğince az olmalıdır.
•	Sınıf Bağımlılıkları soyut kullanılır.

