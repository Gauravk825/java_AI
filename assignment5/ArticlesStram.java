package assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArticlesStram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Articles> arlst = new ArrayList<>();
		arlst.add(new Articles(1001, "Trends in AI", "AI", 2023, 1000000));
		arlst.add(new Articles(1002, "Use of IOT", "IOT", 2023, 340000));
		arlst.add(new Articles(1003, "How to grow your stocks", "Business", 2018, 30000000));
		arlst.add(new Articles(1004, "New AI influencers", "AI", 2022, 270000));
		
		
		Stream<Articles> arStream = arlst.stream();
		arStream.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("****** Article created in 2023 *******");
	    Predicate<Articles> aryear = (art) -> art.getYearpub() ==2023;
	    arStream = arlst.stream();
	    arStream.filter(aryear).forEach(System.out::println);
		System.out.println();
		
		System.out.println("****** Article with Subject AI *******");
	    Predicate<Articles> subAI = (art) -> art.getSubject() == "AI";
	    arStream = arlst.stream();
	    arStream.filter(subAI).forEach(System.out::println);
		System.out.println();
		
		System.out.println("****** Grouping Articles by subject *******");
		arStream = arlst.stream();
		Map<String, List<Articles>> subMap = arStream.collect(Collectors.groupingBy(Articles::getSubject));
		System.out.println(subMap);
		System.out.println();
		
		System.out.println("****** Grouping and Counting Articles by subject *******");
		arStream = arlst.stream();
		Map<String, Long> counted = arStream.collect(Collectors.groupingBy((Articles::getSubject), Collectors.counting()));
		System.out.println(counted);
		System.out.println();
		
		System.out.println("****** Articles with more than 1k views *******");
	    Predicate<Articles> mviews = (art) -> art.getViews() >= 1000000;
	    arStream = arlst.stream();
	    long cnt = arStream.filter(mviews).count();
		System.out.println(cnt);
		System.out.println();
		
		System.out.println("****** Grouping and Counting Articles by published year *******");
		arStream = arlst.stream();
		Map<Integer, Long> count2 = arStream.collect(Collectors.groupingBy((Articles::getYearpub), Collectors.counting()));
		System.out.println(count2);
		System.out.println();
		
		

	}

}
