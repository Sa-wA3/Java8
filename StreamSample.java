import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample {
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream();
        stream.filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
