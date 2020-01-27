package no.hvl.dat102.klient;

import no.hvl.dat102.*;
import no.hvl.dat102.adt.FilmArkivADT;

import static no.hvl.dat102.Sjanger.*;

import java.util.Scanner;

public class KlientFilmarkiv {

	public static void main(String[] args) {

		FilmArkivADT FADT = new Filmarkiv(40);

		Sjanger[] sjanger = Sjanger.values();

		FADT.leggTil(new Film(1, "Matias", "Titanic", 1996, "Brinken", sjanger[1]));

		FADT.leggTil(new Film(2, "Simon", "Hulk", 1996, "Brinken", sjanger[5]));
		FADT.leggTil(new Film(3, "Christian", "Jobs", 1996, "Brinken", sjanger[4]));
		FADT.leggTil(new Film(4, "Matias", "Titanic", 1996, "Brinken", sjanger[2]));
		FADT.leggTil(new Film(5, "Matias", "Bleh", 1996, "Brinken", sjanger[3]));

		Meny n = new Meny(FADT);

//		n.menyValg();
		
		int [] test = {
				1,2,3,4,5,6
		};
		
		System.out.print(harDuplikat(test,5));

	}

	public void programGo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Trykk N for nytt Filmarkiv");
		String input = sc.nextLine();

	}

	public static boolean harDuplikat (int tabell[], int n){// n er antall elementer 
		for (int indeks = 0; indeks <= n-2; indeks++){
		for (int igjen = indeks + 1; igjen <= n-1; igjen++){ 
			if(tabell[indeks] == tabell[igjen])
		return true;
		}
		}return false;
}// metod

}
