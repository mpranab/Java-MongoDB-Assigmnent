import java.util.Scanner;

public class Exceptionque2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		try {
			throw new UnsupportedOperationException();
		} catch (UnsupportedOperationException e) {
			System.out.println("can't divide by 0");
		}
	}

}
