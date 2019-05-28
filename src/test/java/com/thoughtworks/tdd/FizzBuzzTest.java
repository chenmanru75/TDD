package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_1_given_FizzBuzz_when_fizz_buzz_input_1() {
        //when
        String actual = fizzBuzz.fizzBuzz(1);
        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_2_given_FizzBuzz_when_fizz_buzz_input_2() {
        //when
        String actual = fizzBuzz.fizzBuzz(2);
        //then
        assertEquals("2", actual);
    }
    @Test
    void should_return_Fizz_given_FizzBuzz_when_fizz_buzz_input_3() {
        //when
        String actual = fizzBuzz.fizzBuzz(3);
        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_given_FizzBuzz_when_fizz_buzz_input_5() {
        //when
        String actual = fizzBuzz.fizzBuzz(5);
        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_given_FizzBuzz_when_fizz_buzz_input_7() {
        //when
        String actual = fizzBuzz.fizzBuzz(7);
        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_given_FizzBuzz_when_fizz_buzz_input_15() {
        //when
        String actual = fizzBuzz.fizzBuzz(15);
        //then
        assertEquals("FizzBuzz", actual);
    }
    @Test
    void should_return_FizzWhizz_given_FizzBuzz_when_fizz_buzz_input_21() {
        //when
        String actual = fizzBuzz.fizzBuzz(21);
        //then
        assertEquals("FizzWhizz", actual);
    }
}
