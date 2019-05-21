package com.vektorel;

import java.util.Scanner;

public class RunnerSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Islem Sec(1-4)...:");
		int secim = sc.nextInt();
		
		switch (secim) {
		case 1:System.out.println("Toplama Secildi");
			break;
		case 2:System.out.println("Cikarma Secildi");
			break;
		case 3:System.out.println("Carpma Secildi");
			break;
		case 4:System.out.println("Bolme Secildi");
			break;
		default:System.out.println("Lutfen Gecerli bir Deger Giriniz.");
			break; }

	}
}
