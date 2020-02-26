package Domaci;

import java.util.Scanner;

public class Zadatak_3_0221 {

	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje;
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesi broj redova za ispis zvezdica: ");
		int red = s.nextInt();

		System.out.println("Unesi broj kolona za ispis zvezdica: ");
		int kolona = s.nextInt();

		int k, r;
		
		for (r = 1; r <= red; r++) {
			for (k = 1; k <= kolona; k++) {
				System.out.print(" * ");

			}
			System.out.println();
		}
	}
}
