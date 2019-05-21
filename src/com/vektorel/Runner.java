package com.vektorel;

public class Runner {

	public static void main(String[] args) {
				
		
			// If ... Else If ... Else

				int sayi1=34, sayi2=4;
				
				if(sayi1>sayi2) {
					System.out.println("Sayi1 sayi2 den buyuktur");
				}
				else {
					System.out.println("Sayi2 sayi1 den buyuktur");
				}
				
				
				int not1=94,not2=87,ortalama;
				ortalama = (not2+not1)/2;
				// AA 90-100
				// BB 70-89
				// CC 50-69
				// DD 40-49
				// EE 30-39
				// FF 0-29
				
				if(ortalama>=90)
					System.out.println("Notunuz..: AA' dir");
				else if(ortalama>=70)
					System.out.println("Notunuz..: BB' dir");
				else if(ortalama>=50)
					System.out.println("Notunuz..: CC' dir");
				else if(ortalama>=40)
					System.out.println("Notunuz..: DD' dir");
				else if(ortalama>=30)
					System.out.println("Notunuz..: EE' dir");
				else
					System.out.println("Notunuz..: FF' dir");
				
				
				
				if(ortalama>=90) {
					System.out.println("Notunuz..: AA' dir");
				}
				else if(ortalama>69 && ortalama<90) {
					System.out.println("Notunuz..: BB' dir");
				}
				else if(ortalama>=50 && ortalama<70) {
					System.out.println("Notunuz..: CC' dir");
				}
				else if(ortalama>=40 && ortalama<50) {
					System.out.println("Notunuz..: DD' dir");
				}
				else if(ortalama>=30 && ortalama<40) {
					System.out.println("Notunuz..: EE' dir");
				}
				else{
					System.out.println("Notunuz..: FF' dir");
				}

	}
}
