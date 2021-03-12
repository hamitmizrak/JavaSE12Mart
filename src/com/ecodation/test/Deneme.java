package com.ecodation.test;

import java.util.Scanner;

public class Deneme {
	
	//+ operant
	public static String denemeMethod(String name, String surname) {// parametre
		return name + " " + surname;
	}
	
	//String
	public void commonString(String value) {
		System.out.println(value.length());
		System.out.println(value.contains("java"));
		System.out.println(value.concat(" sonuna yeni bir şey ekledim"));
		System.out.println(value.replace("java EE", "Java EE 2021"));
		System.out.println(value.isEmpty());
	}
	
	//Math
	public static void mathMethod() {
		System.out.println(Math.abs(-15));
		System.out.println(Math.max(1, 85));
		System.out.println(Math.min(1, 44));
		System.out.println(Math.round(Math.random() * 4 + 1));
	}
	
	public static double CelciusToFahranhayt(double number) {
		double result = (Math.abs(number) * 9) / 5 + 32;
		return result;
	}
	

	//String
	public void denemeMethod2() {
		// System.out.println("Merhaba Dünya");
		String isim = denemeMethod("Hamit", "Mızrak");
		String isim2 = denemeMethod("Ahmet", "Deniz");
		System.out.println(isim2.length());
		String kelime = "Java";
		int sayi = 44;
		float virgullu = 23.45f;
		System.err.printf("%s %d %f", kelime, sayi, virgullu);
		String cumle = "Merhabalar nasılsınız Java öğreniyorum @Hibernate yazmaya devam ediyorum";
		String[] dizi = cumle.split("@");
		for (String temp : dizi) {
			System.out.println(temp);
		}
	}
	
	//sayı tek mi çift mi
	public static void numberOddEven(int number) {
		if(number%2==0) {
			System.out.println("sayı çifttir");
		}else {
			System.out.println("sayı tektir");
		}
		
	}
	
	/*
		Klavyeden girilen 2 sayının;
		En büyüğü
		En küçüğü
		Karekökü
		Mutlak
		Üslü sayılar
	 */
	//
	public static void scannerMethod() {
		Scanner klavye=new Scanner(System.in);
		int sayi,sayi2;
		System.out.println("Lütfen  1.sayıyı giriniz");
		sayi=klavye.nextInt();
		System.out.println("Lütfen 2.sayıyı  giriniz");
		sayi2=klavye.nextInt();
		System.out.println("1. sayı= "+sayi+" 2.sayı= "+sayi2+ " bunlardan en büyüğü: "+Math.max(sayi, sayi2));
		System.out.println("1. sayı= "+sayi+" 2.sayı= "+sayi2+ " bunlardan en küçüğü: "+Math.min(sayi, sayi2));
		System.out.println("1. sayı= "+sayi+" 2.sayı= "+sayi2+ " bunlardan en karekök: "+Math.sqrt(sayi));
		System.out.println("1. sayı= "+sayi+" 2.sayı= "+sayi2+ " bunlardan en mutlak: "+Math.abs(sayi));
		System.out.println("1. sayı= "+sayi+" 2.sayı= "+sayi2+ " bunlardan en üstlü : "+Math.pow(sayi,sayi2));
		
	}
	
	
	public static void main(String[] args) {
		//Deneme deneme = new Deneme();
		// deneme.commonString("java EE");
		// mathMethod();
		//double sonuc = CelciusToFahranhayt(-100);
		//System.out.println(sonuc);	
		//numberOddEven(21);
		scannerMethod();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
