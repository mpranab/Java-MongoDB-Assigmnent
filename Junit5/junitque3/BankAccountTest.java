package junitque3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount acc1 = new BankAccount(20000.00);

		assertThrows(InsufficientFundsException.class, () -> acc1.withDraw(21000.0));

	}

}
