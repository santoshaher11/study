import java.util.Vector;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vector<Integer> v=new Vector<>();
	v.add(1);
	v.add(2);
	System.out.println(v.capacity());
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(1);
	v.add(2);
	System.out.println(v.capacity());
	v.add(5); //Whenever I add 10th element the vector capacity is increased by double. 
	System.out.println(v.capacity());
	}

}
