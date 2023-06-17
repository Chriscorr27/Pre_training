package preTraining;
import java.util.*;
public class basic {

	public basic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student : ");
		n = sc.nextInt();
		Student[] studentList = new Student[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id and Name : ");
			int id;
			String name;
			id = sc.nextInt();
			name = sc.next();
			Student student = new Student(id,name);
			System.out.print("Enter phy , chem , maths marks : ");
			int phyMarks,chemMarks,mathsMarks;
			phyMarks = sc.nextInt();
			chemMarks = sc.nextInt();
			mathsMarks = sc.nextInt();
			student.setMarks(phyMarks, chemMarks, mathsMarks);
			studentList[i] = student;
		}
		for(int i=0;i<n;i++) {
			Student student = studentList[i];
			double percentage = student.getPercentage();
			if(percentage>=75) {
				System.out.println(student.name +" is passed with distict rank");
			}else if(percentage>=60) {
				System.out.println(student.name+" is passed with first class rank");
			}else if(percentage>=50) {
				System.out.println(student.name+" is passed with second class rank");
			}else if(percentage>=35) {
				System.out.println(student.name+" is passed");
			}else{
				System.out.println(student.name+" is failed");
			}
		}
		
	}

}
