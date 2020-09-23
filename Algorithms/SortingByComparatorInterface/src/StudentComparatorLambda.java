import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorLambda {
int rollNo;
int marks;

public StudentComparatorLambda(int rollno, int marks)
{
		this.rollNo = rollno;
		this.marks = marks;
}
	
public String toString()
{
	return this.rollNo+" "+this.marks;
}
	public static void main(String[] args) {
		System.out.println(StudentComparatorLambda.class.getName());

		List<StudentComparatorLambda> students=new ArrayList<>();
		students.add(new StudentComparatorLambda(1, 200));
		students.add(new StudentComparatorLambda(2, 900));
		students.add(new StudentComparatorLambda(3, 300));
		students.add(new StudentComparatorLambda(4, 100));
		students.add(new StudentComparatorLambda(6,400));

		Collections.sort(students,(o1,o2)->{
			return o1.marks>o2.marks? 1:-1;
		});

		for (StudentComparatorLambda student : students) {
			System.out.println(student);
		}
	}
}
