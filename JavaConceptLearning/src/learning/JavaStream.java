//Streams introduced in java 8 to bring the functional programming features into java.
//It is dependent to Lambda expression and collection concepts.
//As collection is a group of objects. so, to process it we use Streams.
//Streams provide different methods to process the collection data.
//Stream has multiple mechanism through which we process the data(map, filter, sorted, count). these are basically the methods which comes under Stream class.
//Filter - based on condition, the data is fetched from the collection for further processing or storing to another collection.
// filter always take boolean as parameter.
//Map - based on formula, we apply certain operation on each and every object of the collection and process it further or storing to another collection.
//we can use collect method to retrive all data after being processed by stream.
//distinct method to fetch unique data.
//there are other methods like forEach(), min(), max().
// terminal methods -Methods which is used to process the collection data - filter(), map(), flatMap(), distinct(), limit().
// non terminal methods - Methods which is used post processing of data - collect, count(), min(), max(), forEach(), toArray().

package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	int empId;
	String empName;
	int salary;

	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	

}

class ParallelStream{
	
	//The powerful feature of stream pipeline is that it can run either sequentially or in parallel.
	//All collection support parallelStream() method that returns possibly a parallel stream method.
	//Stream<Stuendt> stud = studList.parallelStream();
	List<Employee> emp = new ArrayList<>();
	public void parallelStream() {
	
		emp.add(new Employee(1, "sks", 90000));
		emp.add(new Employee(2, "ssk", 80000));
		emp.add(new Employee(3, "kumar", 66000));
		emp.add(new Employee(4, "qwe", 70000));
		emp.add(new Employee(5, "asd", 81000));
		emp.add(new Employee(6, "zxc", 75000));
		
		List<Employee> newEmpList = emp.stream().filter(n->n.getSalary()<81000).limit(2).collect(Collectors.toList());
		System.out.println(newEmpList);
		
		List<Employee> newEmpList1 = emp.parallelStream().filter(n->n.getSalary()<81000).limit(2).collect(Collectors.toList());
		System.out.println(newEmpList1);
		
		//another way
		List<Employee> newEmpList2 = emp.stream().parallel().filter(n->n.getSalary()<81000).limit(2).collect(Collectors.toList());
		System.out.println(newEmpList2);
	}
	
}

class FindAnyFindFirst {
	
	List<String> arr = Arrays.asList("car", "bus", "train", "bike", "bicycle", "bus", "car", "bus");
	List<Integer> intArr = Arrays.asList(2,1,4,6,3,5,8,7,9);
	
	public void findAnyFindFirst() {
		Optional<Integer> opt1 = intArr.stream().findAny();
		System.out.println(opt1.get());
		
		Optional<String> opt2 = arr.stream().findFirst();
		System.out.println(opt2.get());
	}
}

class AnyAllNoneMatch{
	List<String> arr = Arrays.asList("car", "bus", "train", "bike", "bicycle", "bus", "car", "bus");
	public void match() {
		
		//anyMatch will check from the collection if any of the element get a match with the condition then it will return true.
		boolean b = arr.stream().anyMatch(a->{
			return a.startsWith("car");
		});
		System.out.println(b);
		
		//allMatch will check from the collection if all of the element should match with the condition then it will return true.
		b = arr.stream().allMatch(a->{
			return a.startsWith("car");
		});
		System.out.println(b);
		
		//noneMatch will check from the collection if all the element should not match with the conditon then it will return true
		b = arr.stream().noneMatch(a->{
			return a.startsWith("car");
		});
		System.out.println(b);
	}
	
}

class Sorted{
	
	List<Integer> intArr = Arrays.asList(2,1,4,6,3,5,8,7,9);
	List<String> arr = Arrays.asList("car", "bus", "train", "bike", "bicycle", "bus", "car", "bus");
	List<Integer> sortedIntArr = intArr.stream().sorted().collect(Collectors.toList());
	
	public void sorted() {
		List<Integer> sortedIntArr = intArr.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedIntArr);
		List<String> sortedStringArr = arr.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedStringArr);
	}
	public void reverseSorted() {
		List<Integer> reverseSorted = intArr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSorted);
		List<String> reverseStringArr = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseStringArr);
	}
	
}

class MinMax {
	List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 7, 8, 9, 0);

	public void minMax() {
		Optional<Integer> minimum = i.stream().min((val1,val2)->{
			return val1.compareTo(val2);
			});//this will return 0 as it is minimum in list.
		System.out.println(minimum.get());
		
		Optional<Integer> maximum = i.stream().max((val1,val2)->{
			return val1.compareTo(val2);
			});
		System.out.println(maximum.get());
	}
}

class DistinctCountLimit {

	List<String> arr = Arrays.asList("car", "bus", "train", "bike", "bicycle", "bus", "car", "bus");

	public void distinct() {

		// with Distinct we can take unique elements only from the object and it
		// discards the duplicate items.
		arr.stream().distinct().forEach(a -> System.out.print(a + " "));
		System.out.println();
	}

	public void count() {
		// with count we can count the number of element in the collection.
		long i = arr.stream().count();
		print(i);
	}

	public void distinctWithCount() {
		long i = arr.stream().distinct().count();
		print(i);
	}

	public void limit() {
		// we can take limited number of element with the help of limit.
		arr.stream().limit(3).forEach(i -> System.out.println(i));// it will print first 3 elements of the list.
	}

	public void print(long i) {
		System.out.println(i);
	}
}

class FlatMap {
	// FlatMap is used to combine multiple object of same type into a single object.
	List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
	List<Integer> arr2 = Arrays.asList(6, 7, 8, 9, 10);
	List<List<Integer>> bigList = Arrays.asList(arr1, arr2);

	public void flatMap() {
		bigList.stream().flatMap(l -> l.stream()).forEach(l -> System.out.print(l + " "));
		System.out.println();
		bigList.stream().flatMap(l -> l.stream().map(l2 -> l2 * 2)).forEach(l -> System.out.print(l + " "));
	}

}

class MapWithFilter {

	public void mapWithFilter() {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "sks", 90000));
		emp.add(new Employee(2, "ssk", 80000));
		emp.add(new Employee(3, "kumar", 66000));

		// another way to add employee to the list
		List<Employee> emp1 = Arrays.asList(new Employee(1, "sks", 90000), new Employee(2, "ssk", 80000),
				new Employee(3, "kumar", 66000));

		emp1.stream().filter(e -> e.getSalary() > 70000)
				.map(e -> new Employee(e.getEmpId(), e.getEmpName(), e.getSalary() * 2))
				.forEach(e -> System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getSalary()));
	}
}

class MapStream {
//with Map we can process all object and perform certain operations to transform it.
	public void mapStream() {

		List<String> arr = Arrays.asList("car", "bus", "train", "bike", "bicycle");

		List<String> arr2 = arr.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(arr2);

		arr.stream().map(n -> n.length()).forEach(n -> System.out.print(n + " "));
		System.out.println();
		// another way to print.
		arr.stream().map(n -> n.length()).forEach(System.out::print);
	}
}

class FilterStream {
	public void filterStream() {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		// Another way to create ArrayList.
		List<Integer> arr1 = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
		List<Integer> arr2 = new ArrayList<>();

		// without using streams.
		for (int n : arr1) {
			if ((n & 1) == 0)// checking if the number is even or not.
				arr2.add(n);// storing the number in arr2 object.
		}

		// with Stream
		System.out.println(arr2);
		List<Integer> arr3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 21, 22, 23, 24, 25, 30, 35, 40, 45,
				50);
		List<Integer> arr4 = new ArrayList<>();
		arr4 = arr3.stream().filter(n -> (n & 1) == 0).collect(Collectors.toList());
		System.out.println(arr4);

		// we can also print directly through stream.
		arr3.stream().filter(n -> (n & 1) == 0).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// alternate way to print, without using Lambda exp in forEach.
		arr3.stream().filter(n -> (n & 1) == 0).forEach(System.out::print);
		System.out.println();

		// Another example with more complex filter predicates.
		List<String> names = Arrays.asList("ssk", "skss", "kumar", "abcdefgh", "1234567890");
		names.stream().filter(n -> n.length() > 3 && n.length() < 9).forEach(n -> System.out.print(n + " "));
	}
}

public class JavaStream {
	public static void main(String args[]) {

		FilterStream fs = new FilterStream();
		// fs.filterStream();

		MapStream ms = new MapStream();
		// ms.mapStream();

		MapWithFilter mf = new MapWithFilter();
		// mf.mapWithFilter();

		FlatMap fm = new FlatMap();
		// fm.flatMap();

		DistinctCountLimit d = new DistinctCountLimit();
//		d.distinct();
//		d.count();
//		d.distinctWithCount();
//		d.limit();
		
		MinMax mn = new MinMax();
		//mn.minMax();
		
		Sorted st = new Sorted();
		//st.sorted();
		//st.reverseSorted();
		
		AnyAllNoneMatch aan = new AnyAllNoneMatch();
		//aan.match();
		
		FindAnyFindFirst fff = new FindAnyFindFirst();
		//fff.findAnyFindFirst();
		
		ParallelStream ps = new ParallelStream();
		ps.parallelStream();

	}

}
