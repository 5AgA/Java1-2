
public class Movie {
	private String mid, title, director, production;
	
	public Movie() {
		mid = (int)(Math.random() * (1000 - 100) + 100) + "-" + (int)(Math.random() * (1000 - 100) + 100);
		this.title = "모름";
		this.director = "모름";
		this.production = "모름";
	}
	
	void setTitle(String t) { title = t;}
	String getTitle() { return title;}
	void setDirector(String d) { director = d;}
	String getDirector() { return director;}
	void setProduction(String p) { production = p;}
	String getProduction() { return production;}
	
	public String makeID() {
		return (int)(Math.random() * (1000 - 100) + 100) + "-" + (int)(Math.random() * (1000 - 100) + 100);
	}
	public String toString() {
		return "번호: " + this.makeID() + "\n제목: " + this.getTitle() +
				"\n감독: " + this.getDirector() + "\n제작사: " + this.getProduction() + "\n";
	}
}
