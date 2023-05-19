import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzBuzzFor15(){
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz().get(14));
    }
    @Test
    void shouldReturnFizzFor3(){
        assertEquals("Fizz",fizzBuzz.fizzBuzz().get(2));
    }
    @Test
    void shouldReturn1For1(){
        assertEquals("1",fizzBuzz.fizzBuzz().get(0));
    }
    @Test
    void shouldReturnBuzzFor5(){
        assertEquals("Buzz",fizzBuzz.fizzBuzz().get(4));
    }
    @Test
    void shouldReturnBuzzFor35(){
        assertEquals("Buzz",fizzBuzz.fizzBuzz().get(34));
    }
    @Test
    void shouldReturnBuzzFor100(){
        assertEquals("Buzz",fizzBuzz.fizzBuzz().get(99));
    }
    @Test
    void shouldReturnFizzFor66(){
        assertEquals("Fizz",fizzBuzz.fizzBuzz().get(65));
    }
}