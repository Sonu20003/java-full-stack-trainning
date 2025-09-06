package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 11:41:47 PM
* Project  : CoreJava
* Program to display Shirt size using switch -case statement
*/

public class switchDemo3 {

	public static void main(String[] args) {
		int number;
        String size;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter ur Shirt Size:");
        number=s.nextInt();
        s.close();

        switch (number) {
            case 1:
            case 2:
            case 3:
                size="Kids";
                break;
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);

	}

}
