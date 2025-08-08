package ch09;

public class TryWithResourceDemo {

	public static void main(String[] args) {
//		try (FileInputStream fis = new FileInputStream("file.txt")) {
//
//		} catch (Exception e) {
//
//		}

		try (Resource r = new Resource()) {
			r.show();
		} catch (Exception e) {
			System.out.println("예외가 발생했다.");
		}
	}

}

class Resource implements AutoCloseable {

	void show() {
		System.out.println("리소스를 사용합니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("리소스를 닫습니다.");
	}

}
