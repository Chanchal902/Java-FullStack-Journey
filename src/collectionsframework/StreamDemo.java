package collectionsframework;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 4, 6, 12, 3, 22, 10);
//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        s3.forEach(n -> System.out.println(n));
    }

}
