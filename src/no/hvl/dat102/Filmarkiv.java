
package no.hvl.dat102;

import no.hvl.dat102.adt.FilmArkivADT;

public class Filmarkiv implements FilmArkivADT {

	private Film[] filmer;
	private int lagtTil;

	public Filmarkiv() {

	}

	public Filmarkiv(int n) {
		filmer = new Film[n];
	}

	@Override
	public void leggTil(Film film) {
		filmer[lagtTil] = film;
		lagtTil++;
	}

	@Override
	public boolean slettFilm(int fnr) {

		int i = 0;
		while (i < lagtTil) {
			if (filmer[i] != null && filmer[i].getFnr() != 0) {

				if (filmer[i].getFnr() == fnr) {
					filmer[i] = filmer[lagtTil];
					filmer[lagtTil] = null;
					lagtTil--;
					return true;
				}
			}
			i++;
		}
		return false;
	}

	@Override
	public Film[] finnFilm(String tekst) {

		boolean inneholder = false;
		String titler = "";
		Film[] fa = new Film[lagtTil];
		int j = 0;

		for (int i = 0; i < lagtTil; i++) {
			titler = filmer[i].getTitle();
			inneholder = titler.toUpperCase().contains(tekst.toUpperCase());
			if (inneholder) {
				fa[j] = filmer[i];
				j++;
			}
		}
		return fa;

	}

	@Override
	public Film[] finnProdusent(String prod) {

		boolean contains = false;
		String titler = "";
		Film[] fa = new Film[lagtTil];
		int j = 0;

		for (int i = 0; i < lagtTil; i++) {
			titler = filmer[i].getProducer();
			contains = titler.contains(prod);
			if (contains) {
				fa[j] = filmer[i];
				j++;
			}
		}
		return fa;

	}

	@Override
	public int antall() {
		return lagtTil;
	}

	@Override
	public Film[] hentFilmTabell() {
		return filmer;
	}

	@Override
	public int antallSjanger(Sjanger sjanger) {
		int j = 0;
		for (int i = 0; i < lagtTil; i++) {

			if (filmer[i] != null && filmer[i].getSjanger() != null) {
				if (filmer[i].getSjanger().equals(sjanger)) {
					j++;
				}
			}
		}
		return j;

	}
	
	public boolean finnFnr(int fnr) {
		
		for(int i = 0; i < lagtTil; i++) {
			if(filmer[i].getFnr() == fnr) {
				return true;
			}
		}
		return false;
	}

}
