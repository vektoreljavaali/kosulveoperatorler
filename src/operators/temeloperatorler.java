package operators;

public class temeloperatorler {

	// + Toplama
	// - ��kartma
	// * �arpma
	// / B�lme
	// % Mod alma
	
	public void tum_operator_islemleri() {
		
		int a=5,b=2,c=4,d=9;
		String ifade1="Ali",ifade2="Mehmet",ifade3="KARA";
		
		System.out.println("(+)-> toplama ��lemi..."+ (a+b));
		System.out.println("(-)-> ��kartma ��lemi..."+ (a-b));
		System.out.println("(*)-> �arpma ��lemi..."+ (a*b));
		System.out.println("(/)-> B�lme ��lemi..."+ (a/b));
		System.out.println("(%)-> Mod Alma ��lemi..."+ (a%b));
		
		System.out.println("(+)-> String Birle�tirme ��lemi..."+ (ifade1+" - "+ifade2));
		
		
	}
	
	public void kosullarimiz() {
		// == ifadesi iki bile�enin e�itli�ini sorgular.
		// != ifadesi iki bile�enin e�it olmama durumunu sorgular.
		// >  b�y�k m� sorusunu sorar
		// <  k���k m� sorusunu sorar
		// >= e�it ve b�y�k m� sorusunu sorar
		// <= e�it ve k���k m� sorusunu sorar
		
		int a=5;
		String isim = "muhammet";
		String parola = "123";
		
		System.out.println("muhammet e�it midir isim e");
		System.out.println(isim=="muhammet1");
		System.out.println("a say�s� be� midir..: "+ (a!=6));
		System.out.println("a say�s� 6 dan b�y�k m�d�r..: "+ (a>6));
		System.out.println("a say�s� 6 dan k���k m�d�r..: "+ (a<6));
		System.out.println("a say�s� 6 ya e�it ve b�y�k m�d�r..: "+ (a>=6));
		System.out.println("a say�s� 6 ya e�it ve k���k m�d�r..: "+ (a<=6));
			
	}
	
	public void arttirim() {
		// ++ �n�ne geldi�i say�y� bir artt�r�r.
		// -- �n�ne geldi�i say�y� bir eksiltir.
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
