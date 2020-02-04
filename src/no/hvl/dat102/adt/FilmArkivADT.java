package no.hvl.dat102.adt;

import no.hvl.dat102.*;
import no.hvl.dat102.Sjanger;

public interface FilmArkivADT {
	
	
	 Film[] hentFilmTabell();
	
     void leggTil
     (Film nyFilm);
     
     boolean slettFilm(int filmNr);
     
     Film[] finnFilm(String tekst);
     
     Film[] finnProdusent(String tekst);
     
     int antallSjanger(Sjanger sjanger);
     
     int antall();
     
     boolean finnFnr(int fnr);
     
     
}
