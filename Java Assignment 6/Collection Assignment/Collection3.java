import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose between following options:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int choose = sc.nextInt();
		TreeSet<Employee> emp = null;
		switch (choose) {
		case 1:
			emp = new TreeSet<>(new IdComp());
			break;
		case 2:
			emp = new TreeSet<>(new NameComp());
			break;
		case 3:
			emp = new TreeSet<>(new DeptComp());
			break;
		case 4:
			emp = new TreeSet<>(new SalComp());
			break;
		default:
			System.out.println("Invalid Option");
		}
		emp.add(new Employee(10, "Ms Dhoni", "IT", 2000));
		emp.add(new Employee(11, "Virat", "Management", 2200));
		emp.add(new Employee(12, "Rahul", "HR", 1800));
		emp.add(new Employee(13, "Rohit", "Management", 1900));
		emp.add(new Employee(14, "Hardik", "HR", 2100));
		emp.add(new Employee(16, "Raina", "Training", 2400));
		emp.add(new Employee(15, "Suriya", "IT", 2000));
		emp.add(new Employee(19, "Rishab", "IT", 2300));
		emp.add(new Employee(17, "Jadeja", "HR", 1900));
		emp.add(new Employee(18, "Bumrah", "Management", 1700));

		for (Employee e : emp) {
			System.out.println(e);
		}
	}

}

class IdComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class NameComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}
}

class DeptComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}

class SalComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Employee {

	int id;
	String name;
	String department;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}