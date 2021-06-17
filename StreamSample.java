import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
    
    public static void main(String[] args) {

        List<Integer> number_list = new ArrayList<>();
        number_list.add(1);
        number_list.add(2);
        number_list.add(3);
        number_list.add(4);

        // Stream<Integer> stream = number_list.stream();
        // stream.mapToDouble(x -> x + 1).forEach(System.out::println);

        // Stream<Integer> stream2 = number_list.stream();
        // stream2.map(x -> x * 4).forEach(System.out::println);

        // List<String> name_list = new ArrayList<>();
        // name_list.add("hirasawa");
        // name_list.add("yoshii");
        // name_list.add("nakayama");
        // name_list.add("nishikawa");

        // Stream<String> stream3 = name_list.stream();
        // stream3.map(name -> name.length()).forEach(System.out::println);

        // Stream<String> stream4 = name_list.stream();
        // stream4.map(name -> name.charAt(2)).forEach(System.out::println);

        List<Integer> number_list2 = Arrays.asList(1,3,5,4,2,6,8,7,9,10);
        Stream<Integer> stream5 = number_list2.stream();
        stream5.filter(x -> x >= 5).forEach(System.out::println);

        Stream<Integer> stream6 = number_list2.stream();
        stream6.limit(3).collect(Collectors.toList());

        Stream<Integer> stream7 = number_list2.stream();
        stream7.sorted((x,y) -> x - y).collect(Collectors.toList());
    }
}
