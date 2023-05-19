import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzBuzzfor15(){
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz().get(0));
    }
}