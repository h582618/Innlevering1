package Øving1;

import java.util.Scanner;

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
		System.out.println("L for å legge inn");
		System.out.println("S for å slette");
		System.out.println("F for å Søke og hente filmer med en gitt delstreng");
		System.out.println("P for å Søke og filmer utifra delstreng til en produsnet");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String slett,delstreng, size ;

		boolean run = true;
		
		while(run) {
		System.out.println(" ");
		switch (input) {
		case "L":
			Film f = new Film();
			film.leggTil(f);
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

		case "Q":
			run = false;
			break;

		default:
			System.out.println("Feil input");
		}
		System.out.println("-----");
		input = sc.nextLine();
		}
	}
}
