package ch11;

import java.util.HashMap;
import java.util.Map;

public class EX_5 {

	public static void main(String[] args) {
		Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
		HashMap<String, String> animals = new HashMap<>(map);
		System.out.println("변경 전 : " + animals);
		animals.replaceAll((k, v) -> v.toUpperCase());
		System.out.println("변경 후 : " + animals);
	}

}
