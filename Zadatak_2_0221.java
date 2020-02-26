package Domaci;

import java.util.Scanner;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */

		Scanner s = new Scanner(System.in);

		int a = 9;
		int b = 250;
		int i;
		int counter = 0;

		for (i = a; i <= b; i++) {

			if (i % 3 == 0)
				counter++;

		}
		System.out.println(counter);

	}

}
