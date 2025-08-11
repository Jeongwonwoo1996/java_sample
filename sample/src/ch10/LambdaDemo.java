package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
//		(a, b) -> a > b ? a: b; 

//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b? a : b;
//			}
//		};
//	
//	int value = obj.max(2, 3);

//		MyFunction f = new MyFunction() {
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			};
//		};

		MyFunction f = (a, b) -> a > b ? a : b; // 업캐스팅

		int value = f.max(3, 5);
		System.out.println("최대값 => " + value);

		// 익명클래스 익명메서드 사용법, 람다식 사용전
//		PrintFunction pf = new PrintFunction() {
//
//			@Override
//			public void printVar(String name, int i) {
//				System.out.println(name + "-" + i);
//			}
//
//		};

		// 람다식 사용 후
		PrintFunction pf = (name, i) -> System.out.println(name + "-" + i);
		pf.printVar("hello", 3);

		// 람다식 사용전
//		SquareFunction sf = new SquareFunction() {
//
//			@Override
//			public int square(int x) {
//				return x * x;
//			}
//		};

		// 람다식 사용 후
		SquareFunction sf = (int x) -> x * x;
		System.out.println(sf.square(3));

		//
//		RollFunction rf = new RollFunction() {
//
//			@Override
//			public int roll() {
//				return (int) (Math.random() * 6) + 1;
//			}
//
//		};

		RollFunction rf = () -> (int) (Math.random() * 6) + 1;
		System.out.println(rf.roll());

		YourFunction yf = (a, b) -> a < b ? a : b;
		System.out.println("최소값 => " + yf.min(3, 1));

	}
}

@FunctionalInterface // 추상메소드 1개있어야 함
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}

//class MyClass implements MyFunction{
//
//	@Override
//	public int max(int a, int b) {
//		return 0;
//	}
//	
//}
