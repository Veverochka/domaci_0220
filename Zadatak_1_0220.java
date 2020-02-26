package Domaci;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		/*Napisati program koji racuna sumu parnih brojeva 
		 * i proizvod neparnih brojeva od 0 do n
		 * za resavanje ovog zadatka koristiti samo jednu petlju
		 * (ne jednu vrstu petlje, vec samo jednu petlju)
		 * podrazumeva se da se n ucitava preko standardnog ulaza
*/
		Scanner s = new Scanner (System.in);
		
		int i;
		int suma = 0;
		double proizvod = 0;
		
		System.out.println("Uneti pozitivan broj do koga zelite racunanje:");
		int n = s.nextInt();
		
		while (n>= 0) {
		for (i=0 ; i<=n ; i++) {
			if (i%2==0) suma = suma + i;
			else proizvod = proizvod/i;
		}
		System.out.println("Suma parnih brojeva je " + suma);
		System.out.println("Proizvod neparnih brojeva je " + proizvod);
		n = s.nextInt();
					
	} System.out.println("Greska! Unesite pozitivan broj.");
	}
}
