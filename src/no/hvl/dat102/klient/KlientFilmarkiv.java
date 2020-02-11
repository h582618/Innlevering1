package no.hvl.dat102.klient;

import no.hvl.dat102.*;
import no.hvl.dat102.adt.FilmArkivADT;

import static no.hvl.dat102.Sjanger.*;

import java.util.Scanner;

public class KlientFilmarkiv {


	public static void main(String [] args) {
		
		FilmArkivADT FADT = new Filmarkiv(40);

<<<<<<< HEAD
		Sjanger[] sjanger = Sjanger.values();
=======
//		Sjanger[] sjanger = Sjanger.values();
>>>>>>> e9a5562e268fa966e3b8ae5bc3792274388057bd

//		FADT.leggTil(new Film(1, "Matias", "Titanic", 1996, "Brinken", sjanger[1]));
//
//		FADT.leggTil(new Film(2, "Simon", "Hulk", 1996, "Brinken", sjanger[5]));
//		FADT.leggTil(new Film(3, "Christian", "Jobs", 1996, "Brinken", sjanger[4]));
//		FADT.leggTil(new Film(4, "Matias", "Titanic", 1996, "Brinken", sjanger[2]));
//		FADT.leggTil(new Film(5, "Matias", "Bleh", 1996, "Brinken", sjanger[3]));

		Meny n = new Meny(FADT);

     	n.menyValg();
		
   

	}

	public void programGo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Trykk N for nytt Filmarkiv");
		String input = sc.nextLine();

	}

}
