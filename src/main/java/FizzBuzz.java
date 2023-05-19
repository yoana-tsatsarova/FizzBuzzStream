import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {
    private final int MAX_RANGE = 100;
    private final int MIN_RANGE = 1;
    private final int FIZZ_NUM = 3;
    private final int BUZZ_NUM = 5;


    public List<String> fizzBuzz() {

        return IntStream.rangeClosed(MIN_RANGE, MAX_RANGE)
                .boxed()
                .map(number -> {
                    if (number % FIZZ_NUM == 0 && number % BUZZ_NUM == 0) {
                        return "FizzBuzz";
                    }
                    if (number % FIZZ_NUM == 0) {
                        return "Fizz";
                    }
                    if (number % BUZZ_NUM == 0) {
                        return "Buzz";
                    }
                    return Integer.toString(number);

                }).collect(Collectors.toList());
    }
}