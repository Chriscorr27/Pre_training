package preTraining;

public class Student implements Comparable<Student>{
	private int id;
	public int age;
	public String name;
	public int phyMarks,chemMarks,mathsMarks;
	private double percentage;
	final private double numberOfSubject=3.0;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name) {//parameters constructor
		this.id = id;
		this.name = name;
	}
	public Student(int id,String name,int age) {//parameters constructor
		this.id = id;
		this.name = name;
		this.age=age;
	}
	public void setMarks(int phyMarks,int chemMarks,int mathsMarks) {
		this.phyMarks = phyMarks;
		this.chemMarks = chemMarks;
		this.mathsMarks = mathsMarks;
		this.percentage = ((this.phyMarks+this.chemMarks+this.mathsMarks))/this.numberOfSubject;
	}
	public double getPercentage() {
		return this.percentage;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.id - s.id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id : "+this.id+" , Name : "+this.name+" , Age : "+this.age;
	}
	

}
