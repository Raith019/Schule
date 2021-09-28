
import java.util.ArrayList;
import java.util.List;

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


    }

}
