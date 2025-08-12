package ch10.exercise;

public class Account {
	private String accountNo;
	private String accountOwner;
	private Long balance;
//	private String password; // 4자리 숫자형태

	// 생성자
	public Account(String accountNo, String accountOwner, Long balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
//		this.password = password;
	}

	public Account() {
	}

	// 접근자
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	// 메서드

	public long deposit(Long money) {
		return this.balance += money;
	}

	public long withdraw(Long money) {
		return this.balance -= money;
	}

	@Override
	public String toString() {
		return String.format("%s\t %s\t %d", accountNo, accountOwner, balance);
	}

}
