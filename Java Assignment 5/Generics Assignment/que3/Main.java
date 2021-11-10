public class Main {
	public static void main(String[] args) {
		Integer[] ar = { 10, 30, 20, 50 };
		ArrayPos<Integer> arrayPos = new ArrayPos<>(ar);
		System.out.println("Array before sorting");
		arrayPos.disp(ar);
		arrayPos.swap(ar, 1, 3);
		System.out.println("Array after sorting at index 1 and 3 ");
		arrayPos.disp(ar);

	}
}
