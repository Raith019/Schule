
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavaMitForEach {
    static List<String> testList = new ArrayList<>();

    public static void main(String[] args) {
    aufgabe1();
    }

    private static void aufgabe1() {
        testList.add("Hello");
        testList.add("World");
        testList.add("LinkedList");
        testList.forEach ((Strings)->System.out.println(testList));

        Consumer<String> consumer = (String) -> System.out.println(testList);
        testList.forEach(System.out::print);
    }

}
