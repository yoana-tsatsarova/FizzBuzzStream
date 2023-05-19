import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {


    public List<String> fizzBuzz() {
        List numbersTo100 = IntStream.rangeClosed(1, 100)
                .boxed()
                .map(number -> {
                    if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
                    else if (number % 3 == 0) return "Fizz";
                    else if (number % 5 == 0) return "Buzz";
                    else return Integer.toString(number);

                }).collect(Collectors.toList());

        return numbersTo100;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz());
    }
}