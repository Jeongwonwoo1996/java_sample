package ch10.exercise2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BankApplication3 {
	// 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.
	// 계좌번호는 유일해야 함.
	// - 비밀번호는 숫자 4자리로만 입력해야 함.(Optional)
	// 2. 예금은 금액 제한 없음
	// 입금시 계좌번호만 알면 입금할 수 있음
	// 3. 잔고보다 큰 금액은 인출할 수 없음 (마이너스 통장 X)
	// 출금시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음(Optional)
	// 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음
	// 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는1 경우에만 변경할 수 있음(Optional)
	// 배열 대신 데이터를 무한정 담을 수 있는 ArrayList을 이용하여 프로그램을 수정해보기

	public static void main(String[] args) {
		String msg = """
				-------------------------------------------------
				1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택>
				""";

		Scanner in = new Scanner(System.in);

		List<Account> accounts = new LinkedList<>();
		String menu = "";
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요~");
				break;
			}
			switch (menu) {
			case "1" -> { // 계좌생성
				createAccount(in, accounts);
			}
			case "2" -> { // 목록 출력
				listAccounts(accounts);
			}
			case "3" -> { // 입금
				depositAccount(in, accounts);
			}
			case "4" -> { // 출금
				withdrawAccount(in, accounts);
			}
			default -> System.out.println("메뉴 번호를 확인하세요");
			}
		}

	}

	private static boolean isDuplicated(List<Account> accounts, String accountNo) {
		for (Account account : accounts) {
			if (account.getAccountNo().equals(accountNo)) {
				return true;
			}
		}
		return false;
	}

	private static int findAccount(List<Account> accounts, String accountNo) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNo().equals(accountNo)) {
				return i;
			}
		}
		return -1;
	}

	private static boolean createAccount(Scanner in, List<Account> accounts) {
		String msg1 = """
				-------
				계좌생성
				-------""";
		System.out.println(msg1);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		System.out.print("계좌주 : ");
		String accountOwner = in.nextLine();
		System.out.print("비밀번호 : ");
		String password = in.nextLine();
		System.out.print("비밀번호 (재입력) : ");
		String password1 = in.nextLine();
		System.out.print("초기 입금액 : ");
		long balance = Long.parseLong(in.nextLine());
		// 계좌번호가 유일한지 체크 추가 ??? 어떻게 하는게 더 효율적인지 생각해보기
		if (isDuplicated(accounts, accountNo)) {// 계좌번호 중복
			System.out.println("계좌번호가 중복되어 계좌 생성을 할 수 없습니다ㅣ 다시 입력하세요");
		} else if (accountNo.isBlank() || accountOwner.isBlank() || !password.equals(password1) || balance <= 0) {
			System.out.println("계좌 생성을 위한 필수값이 입력되지 않았거나 비밀번호가 서로 다릅니다. 다시 입력하세요");
		} else {
			Account account = new Account(accountNo, accountOwner, password, balance);
			accounts.add(account);
			System.out.println("계좌가 생성되었습니다.");
			return true;
		}
		return false;
	}

	private static void withdrawAccount(Scanner in, List<Account> accounts) {
		String msg4 = """
				-------
				출금
				-------""";
		System.out.println(msg4);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		int ind = findAccount(accounts, accountNo);
		if (ind >= 0) { // 계좌를 찾은 경우
			System.out.print("비밀번호 : ");
			String password = in.nextLine();
			if (!password.isBlank() && accounts.get(ind).getPassword().equals(password)) {
				System.out.print("출금액 : ");
				long money = Long.parseLong(in.nextLine());
				accounts.get(ind).withdraw(money);
			} else {
				System.out.println("비밀번호 불일치로 출금할 수 없습니다.");
			}
		}
	}

	private static void depositAccount(Scanner in, List<Account> accounts) {
		String msg3 = """
				-------
				예금
				-------""";
		System.out.println(msg3);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		System.out.print("입금액 : ");
		long money = Long.parseLong(in.nextLine());
		int ind = findAccount(accounts, accountNo);
		if (ind >= 0) { // 계좌를 찾은 경우
			accounts.get(ind).deposit(money);
			System.out.println("입금이 완료되었습니다.");
		} else { // 해당 계좌를 못찾은 경우
			System.out.println("입금할 계좌 정보가 없습니다.");
		}
	}

	private static void listAccounts(List<Account> accounts) {
		String msg2 = """
				-------
				계좌목록
				-------""";
		System.out.println(msg2);
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
	}
}