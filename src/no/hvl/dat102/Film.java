package no.hvl.dat102;

public class Film {
	private int fnr;
	private String producer;
	private String title;
	private int year;
	
	private String fstudio;
	private Sjanger sjanger;

	public Film() {
	}
	public Film(int fnr, String producer,String title, int year, String fstudio, Sjanger sjanger) {
		this.fnr = fnr;
		this.producer = producer;
		this.title = title;
		this.year = year;
		this.fstudio = fstudio;
		this.sjanger = sjanger;
		
	}
	
	public int getFnr() {
		return fnr;
	}
	public void setFnr(int fnr) {
		this.fnr = fnr;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getFstudio() {
		return fstudio;
	}
	public void setFstudio(String fstudio) {
		this.fstudio = fstudio;
	}
	public Sjanger getSjanger() {
		return sjanger;
	}
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	
}
