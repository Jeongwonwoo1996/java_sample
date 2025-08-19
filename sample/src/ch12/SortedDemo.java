package ch12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// 문자열을 스트림으로 변환하고, 문자열을 정렬해서 출력하라.
		Stream.of("d", "e", "a", "c", "b").sorted().forEach(System.out::println);

		// 숫자를 스트림으로 변환하고, 숫자를 정렬해서 출력하라.
		Stream.of(3, 5, 1, 7, 9).sorted().forEach(System.out::println);

		// 숫자를 스트림으로 변환하고, 숫자를 역정렬해서 출력하라.
//		Stream.of(3, 5, 1, 7, 9).sorted(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//
//		}).forEach(System.out::println);

		Stream.of(3, 5, 1, 7, 9).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);

		// 국가 이름 순서대로 출력하라
//		Nation.nations.stream().sorted(Comparator.comparing(s -> s.getName())).forEach(Util::printWithParenthesis);
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가 이름을 역순으로 정렬해서 출력하라.
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName).reversed())
				.forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 GDP Rank 순서대로 출력하라

		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank)).forEach(Util::printWithParenthesis);
		System.out.println();

		// 국가별 인구순서대로(인구가 적은 나라부터) 출력하라
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation)).forEach(Util::printWithParenthesis);
		System.out.println();
		// 국가별 인구순서대로(인구가 많은 나라부터) 출력하라
//		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation).reversed())
//				.forEach(Util::printWithParenthesis);

		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation, (a, b) -> (int) (b - a)))
				.forEach(Util::printWithParenthesis);
		System.out.println();
	}

}
