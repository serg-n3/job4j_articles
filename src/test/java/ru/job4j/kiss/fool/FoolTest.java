package ru.job4j.kiss.fool;

import org.junit.jupiter.api.Test;
import static ru.job4j.kiss.fool.Fool.answers;
import static org.assertj.core.api.Assertions.*;

class FoolTest {

   @Test
    public void whenNumberThree() {
       String expected = "Fizz";
       String result = answers(3);
       assertThat(result).isEqualTo(expected);

    }
    @Test
    public void whenNumberFive() {
        String expected = "Buzz";
        String result = answers(5);
        assertThat(result).isEqualTo(expected);

    }
    @Test
    public void whenNumberFifteen() {
        String expected = "FizzBuzz";
        String result = answers(15);
        assertThat(result).isEqualTo(expected);

    }
}