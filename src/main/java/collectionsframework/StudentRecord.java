package collectionsframework;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public record StudentRecord(String name, int marks) {
    public static void main(String[] args) {
        Map<String, Integer> pair = Map.of("chanchal rani", 95,
                "Rini Sarkar", 79,
                "Raina", 99,
                "Iram das", 56,
                "Harshh Sinha", 100,
                "Navin Das", 63);
        Stream<Map.Entry<String, Integer>> stream = pair.entrySet().stream();
        stream.filter(n -> n.getValue() > 80)
                .sorted(Map.Entry.comparingByValue())
                .toList()
                .forEach(n -> System.out.println(n));

    }

}
