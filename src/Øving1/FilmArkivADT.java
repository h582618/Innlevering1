package Øving1;

public interface FilmArkivADT {
	
	 Film[] hentFilmTabell();
	
     void leggtil(Film nyFilm);
     
     boolean slettFilm(int filmNr);
     
     Film[] finnFilm(String tekst);
     
     Film[] finnProdusent(String tekst);
     
     int antallSjanger(Sjanger sjanger);
     
     int antall();
     
     
}
