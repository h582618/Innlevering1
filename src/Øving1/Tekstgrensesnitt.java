package Øving1;

import static Øving1.Sjanger.*;

public class Tekstgrensesnitt {

	public void visFilm(Film film) {

	}

	public void delFilm(String delstreng, FilmArkivADT filmer) {

		Film[] f = filmer.finnFilm(delstreng);

		for (int i = 0; i < f.length; i++) {
			if (f[i] != null) {
				System.out.println(f[i].getTitle());
			}
		}
	}

	public void delProdusent(String delstreng, FilmArkivADT filmer) {

		Film[] f = filmer.finnProdusent(delstreng);

		for (int i = 0; i < f.length; i++) {
			if (f[i] != null) {
				System.out.println(f[i].getTitle());
			}
		}
	}

	public void skrivUtStatistikk(FilmArkivADT filmer) {

		Sjanger[] sjanger = new Sjanger[] { DRAMA, ACTION, HORROR, COMEDY, FICTION, FANTASY, ROMANCE, THRILLER,
				MYSTERY };

		int antallS[] = new int[filmer.antall()];

		for (int i = 0; i < filmer.antall(); i++) {
			antallS[i] = filmer.antallSjanger(sjanger[i]);
		}

		System.out.println(filmer.antall());

		for (int i = 0; i < antallS.length; i++) {
			System.out.println(sjanger[i] + " " + antallS[i]);
		}
	}

}
