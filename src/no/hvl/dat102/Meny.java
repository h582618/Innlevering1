package no.hvl.dat102;

import java.util.Scanner;

import no.hvl.dat102.adt.FilmArkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmArkivADT film;

	public Meny(FilmArkivADT film) {
		tekstgr = new Tekstgrensesnitt();
		this.film = film;
	}

	public void menyValg() {

		System.out.println("Meny");
		System.out.println("-----------");
		System.out.println("N for nytt arkiv");
		System.out.println("G for Eksisterende Arkiv");
		boolean run1 = true;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String eNavn, antallS;

		while (run1) {
			switch (input) {
			case "N":
				System.out.println("Antall på ny arkiv");
				antallS = sc.nextLine();
				int antall = Integer.parseInt(antallS);
				film = new Filmarkiv(antall);
				run1 = false;
				break;
			case "G":
				System.out.println("Navn på eksisterende arkiv");
				eNavn = sc.nextLine();
				Fil.lesFraFil(film, eNavn);
				run1 = false;
				break;
			default:
				System.out.println("Feil input");
				break;
			}
		}
<<<<<<< HEAD
		
=======

>>>>>>> e9a5562e268fa966e3b8ae5bc3792274388057bd
		System.out.println("L for å legge inn");
		System.out.println("S for å slette");
		System.out.println("F for å Søke og hente filmer med en gitt delstreng");
		System.out.println("P for å Søke og filmer utifra delstreng til en produsent");
		System.out.println("T for å skrive ut statestikk");
		System.out.println("W for å skrive Arkiv til Fil");

		input = sc.nextLine();

		String slett, delstreng, size, navnF, fNavn,fStudio,fProdusent,fSjanger;
		int fAar, filmnr;
		boolean run2 = true;

		while (run2) {
			System.out.println(" ");
			switch (input) {
			case "L":
				
				filmnr = film.antall() + 1;
				System.out.println("Tast inn Tittel");
				fNavn = sc.nextLine();
				
				System.out.println("Produsent");
				fProdusent = sc.nextLine();
				
				System.out.println("År");
				fAar = Integer.parseInt(sc.nextLine());
				
				System.out.println("Studio");
				fStudio = sc.nextLine();
				
				System.out.println("Sjanger");
				fSjanger = sc.nextLine();
				Film f = new Film(filmnr, fProdusent, fNavn, fAar, fStudio, Sjanger.valueOf(fSjanger.toUpperCase()));
//				int fnr, String producer,String title, int year, String fstudio, Sjanger sjanger
				
				film.leggTil(f);
				System.out.println(fNavn + " lagt til med film numer " + filmnr);
				break;
			case "S":
				System.out.println("Tast inn Film nr");
				slett = sc.nextLine();
				int fnr = Integer.parseInt(slett);
				if (film.slettFilm(fnr)) {
					System.out.println("Filmen slettet");
				} else {
					System.out.println("Fant ikke film");
				}
				break;
			case "F":
				System.out.println("Tast inn Tittel");
				delstreng = sc.nextLine();
				tekstgr.delFilm(delstreng, film);

				break;
			case "P":
				System.out.println("Tast inn Produsent");
				delstreng = sc.nextLine();
				tekstgr.delProdusent(delstreng, film);

				break;
			case "T":
				tekstgr.skrivUtStatistikk(film);

				break;
			case "W":
				System.out.println("Navn på fil");
				navnF = sc.nextLine();
				Fil.skrivTilFil(film, navnF);
				System.out.println(navnF + " er opprettet");
				break;

			case "Q":
				System.out.println("Meny avsluttet");
				run2 = false;
				break;

			default:
				System.out.println("Feil input");
			}
			System.out.println("-----");
			input = sc.nextLine();
			
		}
		sc.close();
		System.out.println("");
	}
}
