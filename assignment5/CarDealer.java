package assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Car> carlst = new ArrayList<>();
		carlst.add(new Car("Swift", "White", 100, 700000, 2012));
		carlst.add(new Car("Duster", "Silver", 25, 1300000, 2018));
		carlst.add(new Car("HondaCity", "Black", 15, 800000, 2022));
		carlst.add(new Car("Innova", "White", 85, 2200000, 2023));
		carlst.add(new Car("Swift", "Silver", 125, 700500, 2012));
		carlst.add(new Car("Swift", "White", 100, 700000, 2014));
		
		
		Stream<Car> carStream = carlst.stream();
		carStream.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("****** Stock of White colour Swift *******");
	    Predicate<Car> carstk = (car) -> (car.getColour() == "White" && car.getModel() == "Swift");
	    carStream = carlst.stream();
	    carStream.filter(carstk).forEach((car) -> System.out.println(car.getStock()));
		System.out.println();
		
		
		System.out.println("****** Grouping Cars by model *******");
		carStream = carlst.stream();
		Map<String, List<Car>> modelMap = carStream.collect(Collectors.groupingBy(Car::getModel));
		System.out.println(modelMap);
		System.out.println();
		
		System.out.println("****** Grouping and Cars by model *******");
		carStream = carlst.stream();
		Map<String, Long> counted = carStream.collect(Collectors.groupingBy((Car::getModel), Collectors.counting()));
		System.out.println(counted);
		System.out.println();
		
		
		System.out.println("****** Sort By Price *******");
		carStream = carlst.stream();
		Comparator<Car> byprice = Comparator.comparing(Car::getPrice);
		carStream.sorted(byprice).forEach(System.out::println);
		System.out.println();
		
		System.out.println("****** Sort By Manufacturing Year *******");
		carStream = carlst.stream();
		Comparator<Car> bymanYear = Comparator.comparing(Car::getManyear);
		carStream.sorted(bymanYear).forEach(System.out::println);
		System.out.println();
		
		
		
		

	}

}
