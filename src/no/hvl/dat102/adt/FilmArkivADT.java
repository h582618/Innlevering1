package no.hvl.dat102.adt;

import no.hvl.dat102.*;
import no.hvl.dat102.Sjanger;

public interface FilmArkivADT {
<<<<<<< HEAD

	/**
	 * 
	 * @return returnerer en peker på film tabell.
	 */
	Film[] hentFilmTabell();

	/**
	 * Legger til en film nyFilm bakerst i tabellen Øker deretter antall med 1
	 * 
	 * @param nyFilm er en film man legger til.
	 */
	void leggTil(Film nyFilm);

	/**
	 * 
	 * Søker igjennom tabellen Hvis filmer på angitt plass ikke er lik null, så
	 * finner den filmen i tabellen med gjeldende filmnr gitt i paramteren. Sletter
	 * når funnet, hvis ikke returnerer den false. Tetter igjen hull med bakerste
	 * objekt, å reduserer antall med 1.
	 * 
	 * @param filmNr brukes for å sammenligne filmNr
	 * @return boolean verdi, true hvis slettet, false hvis ikke.
	 */
	boolean slettFilm(int filmNr);

	/**
	 * Lager en boolean kalt innholder, som returner true hvis filmen inneholder
	 * tekst. Hvis den inneholder gitt tekst, legges filmen i den nye tabellen fa.
	 * 
	 * @param tekst Brukes til å sammenligne med getTitle metoden.
	 * @return film tabell som inneholder tekst i parameter.
	 * @see Film.getTitle()
	 */
	Film[] finnFilm(String tekst);

	/**
	 * Lager en boolean kalt innholder, som returner true hvis filmen inneholder
	 * prod. Hvis den inneholder gitt prod, legges filmen i den nye tabellen fa.
	 * 
	 * @param prod Brukes til å sammenligne med getProducer metoden.
	 * @return Returner film tabell som inneholder prod i parameter.
	 * @see Film.getProducer()
	 */
	Film[] finnProdusent(String tekst);

	/**
	 * Kjører en loop som sjekker om filmer ikke er lik null. Hvis ikke sjekker den
	 * at sjanger er lik getSjanger(), øker int med 1.
	 * 
	 * @param sjanger i paramateren brukes til å sammenligne med getSjanger()
	 * @return int, antall sjanger.
	 */
	int antallSjanger(Sjanger sjanger);

	/**
	 * @return antall filmer i tabellen.
	 */
	int antall();

=======
	
	
	 Film[] hentFilmTabell();
	
     void leggTil
     (Film nyFilm);
     
     boolean slettFilm(int filmNr);
     
     Film[] finnFilm(String tekst);
     
     Film[] finnProdusent(String tekst);
     
     int antallSjanger(Sjanger sjanger);
     
     int antall();
     
     boolean finnFnr(int fnr);
     
     
>>>>>>> e9a5562e268fa966e3b8ae5bc3792274388057bd
}
