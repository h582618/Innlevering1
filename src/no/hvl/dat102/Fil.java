package no.hvl.dat102;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat102.adt.FilmArkivADT;

public class Fil {

	public static String path = "/Users/matia/Filmarkiv/";
	final static String SKILLE = "#";

	public static void lesFraFil(FilmArkivADT filmarkiv, String filnavn) {

		try {
			FileReader Fil = new FileReader(path + filnavn + ".txt");
			BufferedReader leser = new BufferedReader(Fil);

			int linenumber = 1;

			String line;
			String[] Film = null;

			int fnr;
			String producer;
			String title;
			int year;

			String fstudio;
			Sjanger sjanger;

			while (leser.ready()) {
				line = leser.readLine();
				Film = line.split(SKILLE);

				fnr = Integer.parseInt(Film[0]);

				producer = Film[1];

				title = Film[2];

				year = Integer.parseInt(Film[3]);

				fstudio = Film[4];

				Sjanger v = Sjanger.valueOf(Film[5]);

				Film f = new Film(fnr, producer, title, year, fstudio, v);

				filmarkiv.leggTil(f);

				linenumber++;

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void skrivTilFil(FilmArkivADT filmarkiv, String filnavn) {

		try {

			FileWriter Fil = new FileWriter(path + filnavn + ".txt");
			PrintWriter utfil = new PrintWriter(Fil);

			Film[] f = filmarkiv.hentFilmTabell();
			for (int i = 0; i < filmarkiv.antall(); i++) {
				
				System.out.println("Test");
//				if(!(sjekkFnr(filmarkiv,filnavn))) {
				
				utfil.print(f[i].getFnr());
				utfil.print(SKILLE);
				utfil.print(f[i].getProducer());
				utfil.print(SKILLE);
				utfil.print(f[i].getTitle());
				utfil.print(SKILLE);
				utfil.print(f[i].getYear());
				utfil.print(SKILLE);
				utfil.print(f[i].getFstudio());
				utfil.print(SKILLE);
				utfil.println(f[i].getSjanger());
				
//			}
			}
			utfil.close();

		} catch (IOException e) {
			System.out.println("Feil ved skriving til fil : " + e);
			System.exit(3);
		}

	}

	public static void lagFil(FilmArkivADT film, String navn) {
		File fil = new File(navn);
		skrivTilFil(film, navn);
	}
}
