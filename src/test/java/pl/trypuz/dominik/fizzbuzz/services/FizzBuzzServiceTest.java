package pl.trypuz.dominik.fizzbuzz.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

class FizzBuzzServiceTest {

    FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    public void shouldReturnFizz() {
        //given
        int divisibleByThree = 21;

        //when
        String result = fizzBuzzService.drawFizzBuzz(divisibleByThree);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzz() {
        //given
        int divisibleByFive = 5;

        //when
        String result = fizzBuzzService.drawFizzBuzz(divisibleByFive);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        //given
        int divisibleByThreeAndFive = 15;

        //when
        String result = fizzBuzzService.drawFizzBuzz(divisibleByThreeAndFive);

        //then
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnNeitherFizzNorBuzz() {
        //given
        int randomNumber = 22;

        //when
        String result = fizzBuzzService.drawFizzBuzz(randomNumber);

        //then
        assertEquals("Neither fizz nor buzz :(", result);
    }

}