package ch12;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);

		boolean allMatch = IntStream.of(10, 20, 30).allMatch(n -> n % 10 == 0);
		System.out.println(allMatch);

		// 모든 국가의 인구수가 1억이 넘는다. ==> allMatch : false
		Stream<Nation> nationStream = Nation.nations.stream();
		boolean allMatch2 = nationStream.allMatch(n -> n.getPopulation() > 100);
		System.out.println(allMatch2);
		// 모든 국가는 섬은 아니다. (섬도 있고 대륙도 있다.) ==> anyMatch : true
		nationStream = Nation.nations.stream();
		boolean anyMatch2 = nationStream.anyMatch(n -> n.isIsland());
		System.out.println(anyMatch2);

		// 모든 국가의 이름은 일본이 아니다. ==> noneMatch : true
		nationStream = Nation.nations.stream();
		boolean noneMatch = nationStream.noneMatch(n -> n.getName().equals("Japen"));
		System.out.println(noneMatch);

		// 국가 리스트 중에서 섬인 나라 중에 가장 처음에 찾은 나라를 출력하라.
		nationStream = Nation.nations.stream();
		Optional<Nation> first = nationStream.filter(n -> n.isIsland()).findFirst();
		first.ifPresentOrElse(Util::print, () -> System.out.println("섬인 나라가 없음"));
		// 국가 리스트 중에서 섬이 아닌 나라 중에 아무나라나 찾아서 출력하라
		nationStream = Nation.nations.stream();
		Optional<Nation> any = nationStream.filter(n -> !n.isIsland()).findAny();
		any.ifPresentOrElse(Util::print, () -> System.out.println("섬인 나라가 없음"));

		// 인구수가 10억이 넘고, GDP가 1위 인 나라를 찾아서 출력하라.
		nationStream = Nation.nations.stream();
		Optional<Nation> any2 = nationStream.filter(n -> (n.getPopulation() > 1000 && n.getGdpRank() == 1)).findAny();
		any2.ifPresentOrElse(Util::print, () -> System.out.println("\n인구가 10억이 넘고, GDP가 1억인 나라 없음"));
	}

}
