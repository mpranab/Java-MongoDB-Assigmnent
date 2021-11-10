@FunctionalInterface
interface ArithmeticOperation {
	int operation(int a, int b);
}
public class ArithmeticOperations {
	public static void main(String[] args) {
		System.out.println("Addition:");
		ArithmeticOperation Add = (a, b) -> (a + b);
		System.out.println(Add.operation(100, 50));
		System.out.println("-----------------");
		System.out.println("Subtraction:");
		ArithmeticOperation Sub = (a, b) -> (a - b);
		System.out.println(Sub.operation(100, 50));
		System.out.println("-----------------");
		System.out.println("Multiplication:");
		ArithmeticOperation Mul = (a, b) -> (a * b);
		System.out.println(Mul.operation(100, 50));
		System.out.println("-----------------");
		System.out.println("Division:");
		ArithmeticOperation Div = (a, b) -> (a / b);
		System.out.println(Div.operation(100, 50));
	}
}