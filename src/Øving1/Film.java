package Øving1;

public class Film {
	private int fnr;
	private String producer;
	private String title;
	private int year;
	private String fstudio;
	private Sjanger sjanger;

	public Film() {
		fnr = 0;
		producer = "";
		title = "";
		year = 0;
		fstudio = "";
	}
	public Film(int fnr, String producer,String title, int year, String fstudio) {
		this.fnr = fnr;
		this.producer = producer;
		this.title = title;
		this.year = year;
		this.fstudio = fstudio;
		this.sjanger = null;
		
		
		
	}
	
}
