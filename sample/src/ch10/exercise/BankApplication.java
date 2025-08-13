package ch10.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	// 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.
	// 계좌번호는 유일해야 함.
//					- 비밀번호는 숫자 4자리로만 입력해야 함 (Optional)
	// 2. 예금은 금액 제한 없음
	// 입금시 계좌번호만 알면 입급할 수 있음
	// 3. 잔고보다 큰 금액은 인출할 수 없음(마이너스 통장X)
	// 출금 시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음. (Optional)
	// 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변걍할 수 없음.
//					비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만 변경할 수  있음. (Optional)

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Account> accountList = new ArrayList<>();

		String msg = """
				---------------------------------------------------
				1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				---------------------------------------------------
				선택>
				""";
		String menu = "";

		while (true) {
			System.out.print(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요~");
				break;
			}

			switch (menu) {

			case "1" -> {
				accountCreate(accountList, in);
			}
			case "2" -> {
				accountList(accountList, in);
			}
			case "3" -> {
				accountDeposit(accountList, in);
			}
			case "4" -> {
				accountWithdraw(accountList, in);
			}
			default -> System.out.println("메뉴 번호를 확인하세요.");
			}

		}
	}

	private static void accountCreate(ArrayList<Account> accountList, Scanner in) {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호: ");

		boolean exist = false;

		String accountNo = in.nextLine();

		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo)) {

				exist = true;
				break;
			}
		}
		if (exist) {
			System.out.println("이미 존재하는 계좌번호입니다.");
			System.out.println("다른 계좌번호로 지정해주세요.");
		} else {
			System.out.print("계좌주: ");
			String accountOwner = in.nextLine();

			System.out.print("초기입금액: ");
			Long initBalance = Long.parseLong(in.nextLine());

			if (initBalance <= 0) {
				System.out.println("초기입금액은 0보다 커야 합니다.");
				return; // 메서드 전체 종료 시
				// continue; // 반복문 안이라면 다음 루프로
			} else {
				Account account = new Account(accountNo, accountOwner, initBalance);
				accountList.add(account);
				System.out.println("계좌가 생성되었습니다.");
			}
		}
	}

	private static void accountList(ArrayList<Account> accountList, Scanner in) {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (Account account : accountList) {
			System.out.println(account);
		}
	}

	private static void accountDeposit(ArrayList<Account> accountList, Scanner in) {
		// 1. 유효성 검사 (계좌번호, 예금액 체크)
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();

		boolean accountExist = false;

		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo)) {
				accountExist = true;
			} else {
				System.out.println("해당 계좌번호는 존재하지 않습니다.");
				System.out.println("다시 확인해주세요.");
				break;
			}
		}

		if (accountExist) {
			System.out.print("예금액: ");
			Long deposit = Long.parseLong(in.nextLine());

			if (deposit <= 0) {
				System.out.println("예금액은 0보다 커야 합니다.");
				return; // 메서드 전체 종료 시
				// continue; // 반복문 안이라면 다음 루프로
			} else {
				for (Account account : accountList) {
					if (account.getAccountNo().equals(accountNo)) {
						account.deposit(deposit);
					}
				}
				System.out.println("예금이 완료되었습니다.");
			}
		}
	}

	private static void accountWithdraw(ArrayList<Account> accountList, Scanner in) {
		// 1. 유효성 검사 (계좌번호, 출금액 체크)
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = in.nextLine();

		boolean accountExist = false;

		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo)) {
				accountExist = true;
			} else {
				System.out.println("해당 계좌번호는 존재하지 않습니다.");
				System.out.println("다시 확인해주세요.");
				break;
			}
		}

		if (accountExist) {
			System.out.print("출금액: ");
			Long withdraw = Long.parseLong(in.nextLine());

			if (withdraw <= 0) {
				System.out.println("출금액은 0보다 커야 합니다.");
				// return; // 메서드 전체 종료 시
				// continue; // 반복문 안이라면 다음 루프로
			} else {
				for (Account account : accountList) {
					if (account.getAccountNo().equals(accountNo)) {
						if (account.getBalance() - withdraw < 0) {
							System.out.println("출금할 금액이 부족합니다.");
						} else {
							account.withdraw(withdraw);
							System.out.println("결과: 출금이 성공되었습니다.");

						}
					}
				}

			}
		}
	}

}
