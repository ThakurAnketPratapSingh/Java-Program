package com.anket.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount other) throws Exception {
		if (! this.currency.equals(other.currency)) {
//			throw new Exception("Currencies Don't Match "+ this.currency + " & " + other.currency);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match "+ this.currency + " & " + other.currency);
		}
		this.amount = this.amount + other.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptioRunner {
	
	public static void main(String[] args) throws Exception {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}
