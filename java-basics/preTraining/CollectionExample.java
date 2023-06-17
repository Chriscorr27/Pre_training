package preTraining;
import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student : ");
		n = sc.nextInt();
		ArrayList<Student> studentList = new ArrayList<>();
		HashMap<Integer,Student> studentMap = new HashMap<>();
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id , Name , age : ");
			int id,age;
			String name;
			id = sc.nextInt();
			name = sc.next();
			age = sc.nextInt();
			Student student = new Student(id,name,age);
			studentList.add(student);
			studentMap.put(id, student);
		}
		Collections.sort(studentList);
		System.out.println(studentList);
		AgeCompare ageCompare = new AgeCompare();
		Collections.sort(studentList, ageCompare);
		System.out.println(studentList);
	}

}

class AgeCompare implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
    	return s1.age - s2.age;
    }
}
