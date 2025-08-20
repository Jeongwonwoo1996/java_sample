package ch12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {

	public static void main(String[] args) {
		Stream<Nation> ns = Nation.nations.stream();

		Stream<String> map = ns.map((Nation n) -> n.getName());
		Stream<String> limit = map.limit(3);
		List<String> collect = limit.collect(Collectors.toList());

//		for (String string : collect) {
//
//		}

		System.out.println(collect);

		ns = Nation.nations.stream();
		Set<String> collect2 = ns.map(Nation::getName).limit(3).collect(Collectors.toSet());
		System.out.println(collect2);

		ns = Nation.nations.stream();
		Map<String, Double> collect3 = ns.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(collect3);

//		collect3.forEach(null);
	}

}
