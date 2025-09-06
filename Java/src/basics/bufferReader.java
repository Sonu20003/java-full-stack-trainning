package basics;
import java.io.BufferedReader;

/**
 * Author   : Sonu.2
 * Date     : Aug 29, 2025
 * Time     : 10:03:27 PM
 * Project  : CoreJava
 */
import java.io.InputStreamReader;
public class bufferReader {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your name: ");
		String name = reader.readLine();
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.print("Enter your salary: ");
		int salary = Integer.parseInt(reader.readLine());
		
		System.out.println("Welcome "+name+ " , your Age is: "+age+" your salary is: INR "+salary);

		reader.close();
	}
}