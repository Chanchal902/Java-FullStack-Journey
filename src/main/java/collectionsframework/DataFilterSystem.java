package collectionsframework;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public record DataFilterSystem(int id, String name, String category, double price) {
    public static void main(String[] args) {
        List<DataFilterSystem> products = new ArrayList<>();
        products.add(new DataFilterSystem(101, "Laptop", "Electronics", 65000.0));
        products.add(new DataFilterSystem(102, "Shirt", "Clothing", 1500.0));
        products.add(new DataFilterSystem(103, "Headphones", "Electronics", 2500.0));
        products.add(new DataFilterSystem(104, "Shoes", "Footwear", 3000.0));
        products.add(new DataFilterSystem(105, "Mobile", "Electronics", 20000.0));
        Stream<DataFilterSystem> stream = products.stream();
        List<DataFilterSystem> ss = stream
                .filter(x -> x.category().equals("Electronics"))
                .toList();
        ss.forEach(n -> System.out.println(n));
        Stream<DataFilterSystem> stream1 = products.stream();
        List<DataFilterSystem> expensiveElectronics = stream1
                .filter(p -> p.category().equals("Electronics") && p.price() > 10000)
                .sorted(Comparator.comparing(DataFilterSystem::price).reversed())
                .toList();
        expensiveElectronics.forEach(n -> System.out.println(n));
        Stream<DataFilterSystem> stream2 = products.stream();
        List<String> electronicNames = stream2
                .filter(s -> s.category().equals("Electronics"))
                .map(c -> c.name())
                .toList();
        electronicNames.forEach(n -> System.out.println(n));
        Stream<DataFilterSystem> stream3 = products.stream();
        stream3.map(p -> p.price())
                .forEach(n -> System.out.println(n));
    }
}
