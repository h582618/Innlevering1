package Øving1;

import static Øving1.Sjanger.ACTION;
import static Øving1.Sjanger.COMEDY;
import static Øving1.Sjanger.DRAMA;
import static Øving1.Sjanger.FANTASY;
import static Øving1.Sjanger.FICTION;
import static Øving1.Sjanger.HORROR;
import static Øving1.Sjanger.MYSTERY;
import static Øving1.Sjanger.ROMANCE;
import static Øving1.Sjanger.THRILLER;

public class Tester extends Filmarkiv{

	public Tester(int n) {
		super(n);
		
	}

	public static void main(String[] args) {
		
		Filmarkiv FADT = new Tester(20);
		
		Sjanger [] sjanger = new Sjanger[] {DRAMA,
				ACTION,
				HORROR,
				COMEDY,
				FICTION,
				FANTASY,
				ROMANCE,
				THRILLER,
				MYSTERY};
		
		FADT.leggTil(new Film(1,"Matias","Titanic",1996,"Brinken",sjanger[1]));

		FADT.leggTil(new Film(2,"Simon","Hulk",1996,"Brinken",sjanger[5]));
		FADT.leggTil(new Film(3,"Christian","Jobs",1996,"Brinken",sjanger[4]));
		FADT.leggTil(new Film(4,"Matias","Titanic",1996,"Brinken",sjanger[2]));
		FADT.leggTil(new Film(5,"Matias","Bleh",1996,"Brinken",sjanger[3]));
		
		
        Meny n = new Meny(FADT);
		
		n.menyValg();
		
	}

}
