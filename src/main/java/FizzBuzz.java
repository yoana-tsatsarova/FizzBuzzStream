import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static List<Integer> fizzBuzz () {
        List numbersTo100 = IntStream.rangeClosed(1, 100).boxed().toList();
        return numbersTo100;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }

}
