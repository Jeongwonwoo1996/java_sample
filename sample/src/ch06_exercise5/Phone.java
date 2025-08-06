package ch06_exercise5;

class Phone {
	protected String owner;

	void talk() {
		System.out.println(owner + "가 통화중입니다.");
	}

	// 생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

}

class Telephone extends Phone {
	private String when;

	// 접근자
	public String getWhen() {
		return when;
	}

	// 생성자
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	void autoAnswering() {
		System.out.println(super.owner + "가 부재중이니, " + when + "에 전화 요망");
	}

}

class SmartPhone extends Telephone {
	private String game;

	// 접근자
	public String getGame() {
		return game;
	}

	// 생성자
	public SmartPhone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "가 " + game + "게임 중");
	}

}
