import java.util.ArrayList;

public class Sample<T extends Number> {

	T value;
	
	public void show(T input)
	{
	System.out.println(input);	
		
	}
	
	public void show_1(ArrayList<? extends T> input )
	{
	System.out.println(input);	
		
	}
	
	public T getValue() {
		return value;
	}



	public void setValue(T value) {
		this.value = value;
	}



	public static void main(String[] args) {
		Sample<Integer> s=new Sample<>();
		Sample<Float>s1=new Sample<>();
		
		s.value=10;
		System.out.println(s.getValue());
		
		s1.value=12.12F;
		System.out.println(s1.getValue());
		
		s.show(12);
		
		s.show_1(new ArrayList<Integer>());
	}

}
