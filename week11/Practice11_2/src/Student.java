
public class Student {
	private int id, tuition;
	private double gpa;
	
	void setId(int id) { this.id = id; }
	void setTuition(int tuition) { this.tuition = tuition; }
	void setGpa(double gpa) { this.gpa = gpa; }
	int getId() { return id; }
	int getTuition() { return tuition; }
	double getGpa() { return gpa; }
	
	public Student() {
		this(0, 0, 0.0);
	}
	
	public Student(int id, int tuition, double gpa) {
		setId(id);
		setTuition(tuition);
		setGpa(gpa);
	}
	
	public String toString() {
		return "id=" + getId() + " tuition=" + getTuition() + " gpa" + getGpa() + 
				" 장학금=0";
	}
}
