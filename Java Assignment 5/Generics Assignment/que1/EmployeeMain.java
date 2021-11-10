import java.util.HashSet;

public class EmployeeMain {
	public static void main(String[] args) {
		HashSet<Employee> a = new HashSet<>();
		a.add(new Employee(7, "Pranab", 2000000, "Java"));
		a.add(new Employee(8, "Debasish",1500000, "Python"));
		printhashSet(a);
	}

	public static void printhashSet(HashSet<Employee> h) {
		for (Employee temp : h) {
			System.out.println(temp);
		}
	}
}
