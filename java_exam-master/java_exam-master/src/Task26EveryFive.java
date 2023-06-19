import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task26EveryFive {
    public static List<String> delEveryFive(List<String> list) {
        List<String> collect = IntStream.range(0, list.size())
                .filter(n -> n % 5 != 0) //5 - каждый 5 эл-т удаляется.
                .mapToObj(list::get)
                .collect(Collectors.toList());
        return collect;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        System.out.println(list);
        System.out.println(delEveryFive(list));
    }
}
