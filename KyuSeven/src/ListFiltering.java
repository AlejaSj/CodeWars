import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    /*
    * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
    * */
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        Collectors Collector;
        return list.stream().filter(obj->obj instanceof Integer).collect(Collectors.toList());
    }
}
