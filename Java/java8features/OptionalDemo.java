package java8features;

import java.util.Optional;

/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 4:45:27 PM
* Project  : AdvancedJava
*/

// throw Null Pointer Exception
// optionals in java are added in java 8 to handle null pointer exception
public class OptionalDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//String s="Hello World";

		String s=null; 
		//Integer a = null;
		 
		// System.out.println(s.length());
		//Optional object is a container for not null objects
		Optional<String> chkNull=Optional.ofNullable(s);
		
		if(chkNull.isPresent()) {
			System.out.println("Length of String is : "+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(chkNull.get());
		}
		else {
			System.out.println("String not Present");
		}

	}

}
