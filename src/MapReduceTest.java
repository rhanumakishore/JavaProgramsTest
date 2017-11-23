import java.util.ArrayList;
import java.util.List;

/**
 * * Java Program to demonstrate how to do map reduce in Java. Map, reduce also
 * * known as fold is common operation while dealing with Collection in Java.
 * * @author Javin Paul
 */
public class MapReduceTest {
	public static void main(String args[]) {
		List<MapReduceEmployee> peoples = new ArrayList<>();
		peoples.add(new MapReduceEmployee(101, "Victor", 23));
		peoples.add(new MapReduceEmployee(102, "Rick", 21));
		peoples.add(new MapReduceEmployee(103, "Sam", 25));
		peoples.add(new MapReduceEmployee(104, "John", 27));
		peoples.add(new MapReduceEmployee(105, "Grover", 23));
		peoples.add(new MapReduceEmployee(106, "Adam", 22));
		peoples.add(new MapReduceEmployee(107, "Samy", 224));
		peoples.add(new MapReduceEmployee(108, "Duke", 29));
		double average = calculateAverage(peoples);
		System.out.println("Average age of employees are (classic way) : " + average);
		average = averageByMapReduce(peoples);
		System.out.println("Average age of employees are (lambda way) : " + average);
	}

	/**
	 * * Java Method to calculate average from a list of object without using *
	 * lambdas, doing it on classical java way. * @param employees * @return
	 * average age of given list of Employee
	 */
	private static double calculateAverage(List<? extends MapReduceEmployee> employees) {
		int totalEmployee = employees.size();
		double sum = 0;
		for (MapReduceEmployee e : employees) {
			sum += e.getAge();
		}
		double average = sum / totalEmployee;
		return average;
	}

	/**
	 * * Java method which uses map reduce to calculate average of list of
	 * employees * in JDK 8. * @param peoples * @return average age of given
	 * list of Employees
	 */
	private static double averageByMapReduce(List<? extends MapReduceEmployee> peoples) {
		return peoples.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
	}
}

class MapReduceEmployee {
	private final int id;
	private final String name;
	private final int age;

	public MapReduceEmployee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge(){ return age; }
}
