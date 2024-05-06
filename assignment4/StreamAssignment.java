package assignment4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;


public class StreamAssignment {
	
	public static void main(String [] args) {
		//List<String> str1 = new ArrayList<>();
		//Collections.addAll(str1, "Red", "orange", "Yelllow", "green", "Blue", "indigo", "Voilet");
		
		String[] colstr = {"Red", "orange", "Yelllow", "green", "Blue", "indigo", "Voilet"};
		Stream<String> strup =  Stream.of(colstr);
		//str1.stream();
		List<String> strstream2 = strup.map((s) -> (s.toUpperCase())).collect(Collectors.toList());
		System.out.println(strstream2);
		
		Stream<String> strlow =  Stream.of(colstr);
		List<String> strstream3 = strlow.map((s) -> (s.toLowerCase())).collect(Collectors.toList());
		System.out.println(strstream3);
		
		Stream<String> strasc =  Stream.of(colstr);
		List<String> strstream4 = strasc.filter((s) -> (s.toUpperCase().charAt(0)<'M')).sorted().collect(Collectors.toList());
		System.out.println(strstream4);
		
		Stream<String> strdesc =  Stream.of(colstr);
		List<String> strstream5 = strdesc.filter((s) -> (s.toUpperCase().charAt(0)<'M')).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(strstream5);
		
		Stream<String> strlen =  Stream.of(colstr);
		List<String> strstream6 = strlen.filter((s) -> (s.length() > 5)).collect(Collectors.toList());
		System.out.println(strstream6);
		
		
	}

}
