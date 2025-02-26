import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {
int rollNo;
int marks;

public StudentComparator(int rollno, int marks)
{
		this.rollNo = rollno;
		this.marks = marks;
}
	
public String toString()
{
	return this.rollNo+" "+this.marks;
}
	public static void main(String[] args) {
		System.out.println(StudentComparator.class.getName());
		
		List<StudentComparator> students=new ArrayList<>();
		students.add(new StudentComparator(1, 200));
		students.add(new StudentComparator(2, 900));
		students.add(new StudentComparator(3, 300));
		students.add(new StudentComparator(4, 100));
		students.add(new StudentComparator(6,400));

		Collections.sort(students,new Comparator<StudentComparator>() {

		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			return o1.marks>o2.marks? 1:-1;
			}
		});

		for (StudentComparator student : students) {
			System.out.println(student);
		}
	}
}
