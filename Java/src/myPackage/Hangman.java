package myPackage;
/**
 * Author   : Sonu.2
 * Date     : Aug 31, 2025
 * Time     : 8:47:40 PM
 * Project  : CoreJava
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Hangman {

	private static List<List<String>> art;
	static Scanner sc;
	public static void main(String[] args) throws InterruptedException {
		art = new ArrayList<>();
		sc = new Scanner(System.in);
		createArt();

		List<String> animals = Arrays.asList(
	            "Tiger", "Elephant", "Kangaroo", "Zebra", "Giraffe",
	            "Leopard", "Cheetah", "Wolf", "Fox", "Bear",
	            "Dolphin", "Seal", "Otter", "Moose", "Hippopotamus",
	            "Rhinoceros", "Camel", "Deer", "Panda", "Buffalo"
	        );

	        List<String> cities = Arrays.asList(
	            "Paris", "London", "Tokyo", "Berlin", "Rome",
	            "New York", "Sydney", "Toronto", "Bangkok", "Dubai",
	            "Seoul", "Singapore", "Barcelona", "Istanbul", "Moscow",
	            "Mumbai", "Cape Town", "Athens", "Rio de Janeiro", "Venice"
	        );

	        List<String> birds = Arrays.asList(
	            "Peacock", "Parrot", "Sparrow", "Eagle", "Owl",
	            "Flamingo", "Pelican", "Seagull", "Woodpecker", "Kingfisher",
	            "Crow", "Magpie", "Pigeon", "Duck", "Swan",
	            "Goose", "Heron", "Falcon", "Stork", "Hummingbird"
	        );

	        List<String> fruits = Arrays.asList(
	            "Mango", "Apple", "Banana", "Grapes", "Pineapple",
	            "Orange", "Strawberry", "Papaya", "Guava", "Pomegranate",
	            "Cherry", "Pear", "Plum", "Peach", "Watermelon",
	            "Lychee", "Coconut", "Blueberry", "Kiwi", "Raspberry"
	        );

	        List<String> elements = Arrays.asList(
	            "Hydrogen", "Helium", "Lithium", "Carbon", "Nitrogen",
	            "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium",
	            "Aluminium", "Silicon", "Phosphorus", "Sulfur", "Chlorine",
	            "Argon", "Calcium", "Iron", "Copper", "Zinc"
	        );

	        List<String> countries = Arrays.asList(
	            "India", "Canada", "Japan", "Brazil", "Australia",
	            "Germany", "France", "Italy", "China", "Russia",
	            "Mexico", "Spain", "South Korea", "Thailand", "United Kingdom",
	            "United States", "Egypt", "Turkey", "South Africa", "Indonesia"
	        );

		Random random = new Random();
		int num = random.nextInt(0, 6);

		switch(num) {
			case 0:
				System.out.println("Hint: Your word is an \"Amimal\"");
				StartGame(0, animals);
				break;
			case 1:
				System.out.println("Hint: Your word is a \"City\"");
				StartGame(1, cities);
				break;
			case 2:
				System.out.println("Hint: Your word is a \"Bird\"");
				StartGame(2, birds);
				break;
			case 3:
				System.out.println("Hint: Your word is a \"Fruit\"");
				StartGame(3, fruits);
				break;
			case 4:
				System.out.println("Hint: Your word is an \"Element\"");
				StartGame(4, elements);
				break;
			default:
				System.out.println("Hint: Your word is a \"Country\"");
				StartGame(5, countries);
		}
		sc.close();
	}

	private static void StartGame(int i, List<String> list) {
		int miss = 0;
		
		String theWord = list.get(new Random().nextInt(0, list.size()));
		StringBuilder result = new StringBuilder();
		Set<Character> container = new HashSet<>();
		Set<Character> rsc = new HashSet<>();
		
		int len = theWord.length();
		printResult(miss, len, rsc, theWord);
		for(char ch : theWord.toLowerCase().toCharArray()) {
			result.append('_');
			container.add(ch);
			
		}
		boolean win = false;
		
		while(!win && miss < 6) {
			System.out.print("Enter your guess: ");
			char guess = sc.next().toLowerCase().charAt(0);
			
			if(container.contains(guess) && !rsc.contains(guess)) rsc.add(guess);
			else miss++;
			win = printResult(miss, len, rsc, theWord);
			ArtGenerator(miss);
		}
		if(win) {
			System.out.println("You won !");
			System.out.println("Miss count: "+miss);
		} else {
			System.out.println("You lose !");
			System.out.println("The word was: "+theWord);
		}
		
	}

	private static boolean printResult(int miss, int len, Set<Character> container, String word) {
		boolean win = true;;
		for(Character ch : word.toLowerCase().toCharArray()) {
			if(container.contains(ch)) System.out.print(ch+" ");
			else {
				win = false;
				System.out.print("_ ");
			}
		}
		System.out.println();
		return win;
	}

	private static void ArtGenerator(int i) {
		for(String str : art.get(i)) {
			System.out.println(str);
		}
	}

	private static void createArt() {
		List<String> l1 = new ArrayList<>();
		l1.add("+-----------");
		l1.add("|     |     ");
		l1.add("|           ");
		l1.add("|           ");
		l1.add("|           ");
		l1.add("|           ");
		l1.add("+-----------");

		List<String> l2 = new ArrayList<>();
		l2.add("+-----------");
		l2.add("|     |     ");
		l2.add("|     O     ");
		l2.add("|           ");
		l2.add("|           ");
		l2.add("|           ");
		l2.add("+-----------");

		List<String> l3 = new ArrayList<>();
		l3.add("+-----------");
		l3.add("|     |     ");
		l3.add("|     O     ");
		l3.add("|     |     ");
		l3.add("|           ");
		l3.add("|           ");
		l3.add("+-----------");

		List<String> l4 = new ArrayList<>();
		l4.add("+-----------");
		l4.add("|     |     ");
		l4.add("|     O     ");
		l4.add("|    /|     ");
		l4.add("|           ");
		l4.add("|           ");
		l4.add("+-----------");

		List<String> l5 = new ArrayList<>();
		l5.add("+-----------");
		l5.add("|     |     ");
		l5.add("|     O     ");
		l5.add("|    /|\\    ");
		l5.add("|           ");
		l5.add("|           ");
		l5.add("+-----------");

		List<String> l6 = new ArrayList<>();
		l6.add("+-----------");
		l6.add("|     |     ");
		l6.add("|     O     ");
		l6.add("|    /|\\    ");
		l6.add("|    /      ");
		l6.add("|           ");
		l6.add("+-----------");

		List<String> l7 = new ArrayList<>();
		l7.add("+-----------");
		l7.add("|     |     ");
		l7.add("|     O     ");
		l7.add("|    /|\\    ");
		l7.add("|    / \\    ");
		l7.add("|           ");
		l7.add("+-----------");

		art.add(l1);
		art.add(l2);
		art.add(l3);
		art.add(l4);
		art.add(l5);
		art.add(l6);
		art.add(l7);
	}
}
