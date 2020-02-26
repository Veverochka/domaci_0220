package Domaci;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). - primer: ako
		 * korisnik unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner s = new Scanner(System.in);

		int unos = 0;
		int broj = 0;
		int i = 0; // ovo je referenca
		int zbir = 0;

		// System.out.println("Koliko brojeva zelite da bude u zbiru: ");
		// unos = s.nextInt(); // ovo je broj brojeva; zadajes za racunanje

		while (broj >= 0) {
			for (i = 0; i <= unos; i++) {
				System.out.println(" Unesite brojeve za zbir: ");
				broj = s.nextInt(); // ovo unosi korisnik
				if (broj < 0)
					break;
				zbir += broj;
			}
			System.out.println("Zbir je  " + zbir);
		}
		System.out.println("Negativan broj prekida sabiranje.");

	}
}
