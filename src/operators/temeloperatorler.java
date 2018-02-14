package operators;

public class temeloperatorler {

	// + Toplama
	// - Çýkartma
	// * Çarpma
	// / Bölme
	// % Mod alma
	
	public void tum_operator_islemleri() {
		
		int a=5,b=2,c=4,d=9;
		String ifade1="Ali",ifade2="Mehmet",ifade3="KARA";
		
		System.out.println("(+)-> toplama Ýþlemi..."+ (a+b));
		System.out.println("(-)-> Çýkartma Ýþlemi..."+ (a-b));
		System.out.println("(*)-> Çarpma Ýþlemi..."+ (a*b));
		System.out.println("(/)-> Bölme Ýþlemi..."+ (a/b));
		System.out.println("(%)-> Mod Alma Ýþlemi..."+ (a%b));
		
		System.out.println("(+)-> String Birleþtirme Ýþlemi..."+ (ifade1+" - "+ifade2));
		
		
	}
	
	public void kosullarimiz() {
		// == ifadesi iki bileþenin eþitliðini sorgular.
		// != ifadesi iki bileþenin eþit olmama durumunu sorgular.
		// >  büyük mü sorusunu sorar
		// <  küçük mü sorusunu sorar
		// >= eþit ve büyük mü sorusunu sorar
		// <= eþit ve küçük mü sorusunu sorar
		
		int a=5;
		String isim = "muhammet";
		String parola = "123";
		
		System.out.println("muhammet eþit midir isim e");
		System.out.println(isim=="muhammet1");
		System.out.println("a sayýsý beþ midir..: "+ (a!=6));
		System.out.println("a sayýsý 6 dan büyük müdür..: "+ (a>6));
		System.out.println("a sayýsý 6 dan küçük müdür..: "+ (a<6));
		System.out.println("a sayýsý 6 ya eþit ve büyük müdür..: "+ (a>=6));
		System.out.println("a sayýsý 6 ya eþit ve küçük müdür..: "+ (a<=6));
			
	}
	
	public void arttirim() {
		// ++ önüne geldiði sayýyý bir arttýrýr.
		// -- önüne geldiði sayýyý bir eksiltir.
		// +=
		// -=
		// *=
		// /=
		
		
		int a=5,b=7,toplam=10;
		
		//toplam = toplam + a;
		toplam +=a;
		System.out.println("toplam +=a......:"+ toplam);
		a=5;toplam=10;
		//toplam = toplam / a; 
		toplam /=a;
		System.out.println("toplam /=a......:"+ toplam);
		a=5;toplam=10;
		//toplam = toplam - a;
		toplam -=a;
		System.out.println("toplam -=a......:"+ toplam);
		a=5;toplam=10;
		//toplam = toplam * a;
		toplam *=a;
		System.out.println("toplam *=a......:"+ toplam);
		a=5;toplam=10;
		//toplam = toplam % a;
		toplam %=a;
		System.out.println("toplam %=a......:"+ toplam);
	
		
		
	}
	
	
	
	
	
	
	
	
}
