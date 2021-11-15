package Java11;

public class Interest {
	@FunctionalInterface
	interface simpleinterest {
		int operations(int p, int t, int r);
	}

	public static void main(String[] args) {
		var p = 10000;
		var t = 2.5;
		var r = 6.0;
		System.out.println("The simple interest is:" + (p * t * r) / 100);

	}

}
