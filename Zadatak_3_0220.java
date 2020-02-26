package Domaci;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise.
		 * 
		 * Napisati po 2 primera o svakom, koristeci promenljive a, b, c koje su i
		 * deklarisane i definisane (kao sto smo na tabli vezbali na casu)
		 * 
		 */

// post i pre increment 
		int a = 5;
		int b = 10;
		int c = 20;
		
		a = a++ + ++b + ++c;
			// a=5(raste na 6) + b=(raste na 11)11 + c= (raste na 21)21 =>> a=37
			// a=37; b=11; c=21
		System.out.println(a);

		b = ++b + c++ + a++;
			// b=(raste na 12)12 + c= 21(raste na 22) + a= 37(raste na 38) =>> b= 70
			//a=38; b=70; c=22
		System.out.println(b);
		
		c = ++a + b++ + c++;
			// a=(raste na 39)39 + b=70(raste na 71) +c=22(raste na 23) =>> c= 131
			// a=39. b=71,c= 131
		System.out.println(c);
		
		c = ++a + b++ + ++c;
			//a=(raste na 40)40 + b=71(raste na 72) + c= (raste na 132)132 =>> c= 243
			//a=40, b=72, c=243
		System.out.println(c);
		

// post i pre decrement 
		
		c = --a - b-- + c--;
			//a=39 - b=72 (smanjuje se na 71) + c=243 (smanjuje se na 242) = >> c=  210
			//a=39, b=71 , c=210
		System.out.println(c);
		
		c = a-- - --b + b--;
			// a=39(38) - b=70 + b=70(69) = >> c=39
			// a=38, b=69, c=39
		System.out.println(c);
		
		b = b-- - a++ - --c;
			// b=69(68) - a=38(39) - c=38 =>> b= -7
			//a= 39, b=-7, c=38
		System.out.println(b);
		
		a = --b + c++ - a--;
			// b=-8 + c=38(39) - a=39(38) =>> a= -9
			//a=-9, b=-8, c-39
		System.out.println(a);
		
		
		
	}

}
