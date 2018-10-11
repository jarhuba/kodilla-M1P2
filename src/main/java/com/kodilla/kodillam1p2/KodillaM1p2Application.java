package com.kodilla.kodillam1p2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaM1p2Application {

	public static void main(String[] args) {
		SpringApplication.run(KodillaM1p2Application.class, args);

		ATMImpl wallOfTears = new ATMImpl();
		wallOfTears.cashPayment();
		wallOfTears.cashWithdrawal();
		wallOfTears.connectionInfo();
		ATM.infoEndWorking();
	}
}

interface ATM {
	public void cashPayment();

	public void cashWithdrawal();

	public default void connectionInfo() {
		System.out.println("Połączono lub nie z serwerem banku");
	}

	public static void infoEndWorking() {
		System.out.println("ATM off");
	}
}

class ATMImpl implements ATM {
	public void cashPayment() {
		System.out.println("Wpłacamy x");
	}

	public void cashWithdrawal() {
		System.out.println("Wypłacamy x - ygrek");
	}
}