package test;

import operators.temeloperatorler;

public class runner {

	public static void main(String[] args) {

		// not 0-40 zayýf 
		// not 41-70 orta
		// not 71-100 iyi
		
		int not=205;
		
		if(not>=0 && not<=40)
			System.out.println("Not Zayýftýr.");
		else if(not>=41 && not<=70)
			System.out.println("Not Ortadýr.");
		else if(not>=71 && not<=100)
			System.out.println("Not Ýyidir");
		else
			System.out.println("Geçerli bir Not giriniz.");
		
	
		
	}

}
