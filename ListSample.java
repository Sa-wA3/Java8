import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.contains(3));
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        list.set(0, 0);
        System.out.println(list.get(0));
        list.set(1, 1); //要素が存在するインデックス番号を指定する必要がある
        list.remove(1);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}