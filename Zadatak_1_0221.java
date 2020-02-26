package Domaci;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 * >>> ne da imam problema sa ovim kodom , nego samo tako... :)
		 * 
		 */

		Scanner s = new Scanner(System.in);
		float cena = 0;
		int i = 0;
		int racun = 0;

		System.out.println("Uputstvo: ");
		System.out.println("IZaberite broj 1 kako biste unesi atikle iz korpe u racun. Pratite dajla uputstva.");
		System.out.println("1 - ubacivanje artikala na racun. ");
		System.out.println("");

		System.out.println("Izaberite korak:");
		int opcija = s.nextInt();
		
		if (opcija!=1) System.out.println("Pogresan izbor opcije");
		else {
			switch (opcija) {
			default: 
				System.out.println("Hvala sto ste koristili nase usluge.");
				break;
					
			case 1:

				System.out.println("Unesite ukupan broj proizvoda:");
				int korpa = s.nextInt();

				for (i = 0; i < korpa; i++) {
					System.out.println("Unesite cenu proizvoda: ");
					
					cena = s.nextFloat();
					racun += cena;
				
				}
				System.out.println("Ukupan iznos Vaseg racuna je: " + racun);
		


				if (cena <= 0) {
					System.out.println("Cena mora biti veca od 0. POkusajte ponovo. Unesite broj 1 za onovni unos u kasu.");
					opcija = s.nextInt();
				} 
	
				
			
			case 2:
				System.out.println("Doslo je vreme da platite. Unesite iznos koji uplacujete: ");
				float novac = s.nextFloat();

				if (novac >= racun) {
					float kusur = novac - racun;
					System.out.println("Vas kusur je: " + kusur);
					racun = 0;

				} else {
					System.out.println("Nije dovoljno sredstava za racun.Pokusajte ponovo. Unesite broj 1 za pristup kasi.");
					opcija = s.nextInt();
					break;
					// i nemam ideju kako da resim ponovljenu iterciju gde izbacuje samo brojeve za
					// uplatu
				}
			case 0: 
					System.out.println("Hvala sto ste koristili nase usluge.");
					break;	
				
			
			}
			
			
		
	}
 }
}

