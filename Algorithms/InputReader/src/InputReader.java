import java.util.Scanner;

public class InputReader {

	public static void main(String[] args) {
		
		//Never use nexLine() instead use next 
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Entered name is "+name);
		System.out.println("Enter your Age");
		sc.skip("\r\n");
		Double age=Double.parseDouble(sc.nextLine());
		System.out.println("Entered age is"+age);
		System.out.println("Enter your birthyear");
		int year=sc.nextInt();
		System.out.println("Entered birth year is "+year);
		System.out.println("Enter your last name");
		sc.skip("\r\n");
		String lastname=sc.nextLine();
		System.out.println("Last name is "+lastname);
		
		System.out.println("Enter your city");
		String city =sc.next();
		System.out.println("City "+city);
		sc.close();
	}

}