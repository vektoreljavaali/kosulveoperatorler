package test;

import operators.temeloperatorler;

public class runner {

	public static void main(String[] args) {

		// not 0-40 zay�f 
		// not 41-70 orta
		// not 71-100 iyi
		
		int not=205;
		
		if(not>=0 && not<=40)
			System.out.println("Not Zay�ft�r.");
		else if(not>=41 && not<=70)
			System.out.println("Not Ortad�r.");
		else if(not>=71 && not<=100)
			System.out.println("Not �yidir");
		else
			System.out.println("Ge�erli bir Not giriniz.");
		
	
		
	}

}
