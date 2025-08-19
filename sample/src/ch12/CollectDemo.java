package ch12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		Stream<Nation> ns = Nation.nations.stream();
		Double collect = ns.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		System.out.println("인구 평균 : " + collect);

		ns = Nation.nations.stream();
		Long collect2 = ns.collect(Collectors.counting());
		System.out.println("나라 개수 : " + collect2);

		// 4개의 나라(limit)를 추출해서 나라이름 '-' 연결해서 String 으로 변환하기 (joining)
		ns = Nation.nations.stream();
		String collect3 = ns.limit(4).map(n -> n.getName()).collect(Collectors.joining("-"));

		System.out.println("나라 이름 4개(-) => 방법 1 : " + collect3);
		// 4개의 나라를 추출해서 나라이름 '+' 연결해서 String 으로 변환하기 (collect(Collectors.mapping))
		ns = Nation.nations.stream();
		String collect4 = ns.limit(4)
				// .map(Nation::getName)
				.collect(Collectors.mapping(Nation::getName, Collectors.joining("+")));
		System.out.println("나라 이름 4개(-) => 방법 2 : " + collect4);
		// 인구수가 가장 많은 나라의 인구수를 출력하기 (collect(Collectors.maxBy())

		ns = Nation.nations.stream();
		Optional<Double> collect5 = ns.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compare));

		System.out.println("인구수가 가장 많은 나라의 인구수 : " + collect5.get());

	}

}
