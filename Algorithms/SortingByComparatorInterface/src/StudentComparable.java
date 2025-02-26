import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
int rollNo;
int marks;

public StudentComparable(int rollno, int marks)
{
		this.rollNo = rollno;
		this.marks = marks;
}

@Override
public int compareTo(StudentComparable arg0) {
	return this.marks>arg0.marks? 1:-1;
}
	
public String toString()
{
	return this.rollNo+" "+this.marks;
}

	public static void main(String[] args) {
		System.out.println(StudentComparable.class.getName());
		
		StudentComparable s1=new StudentComparable(1, 200);
		StudentComparable s2=new StudentComparable(2, 900);
		StudentComparable s3=new StudentComparable(3, 300);
		StudentComparable s4=new StudentComparable(4, 100);
		
		List<StudentComparable> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(new StudentComparable(6,400));

		Collections.sort(students);
		
		for (StudentComparable student : students) {
			System.out.println(student);
		}
	}
}
