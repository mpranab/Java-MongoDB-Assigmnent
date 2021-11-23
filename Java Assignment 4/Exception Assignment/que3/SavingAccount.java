import java.io.*;

class SavingAccount {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void withDraw() throws IOException {

		double balance;
		System.out.println("Enter your balance: ");
		balance = Double.parseDouble(br.readLine());
		System.out.println("Your Balance is:Rs " + balance);
		System.out.println("Enter the amount you want to withdraw:");
		double amount = Double.parseDouble(br.readLine());
		try {
			if (amount > balance || amount == 0) {
				throw new Exception("Insufficient amount");
			} else if (amount < 0) {
				throw new Exception("Negative amounts are not allowed");
			} else {
				double currentamt = balance - amount;
				System.out.println("Amount withdrawn: " + amount);
				System.out.println("Current amount in bank: " + currentamt);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
