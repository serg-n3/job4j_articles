package ru.job4j.kiss.fool;

import java.util.Scanner;

public class Fool {

    public static String answers(int number) {
        String answer;
        if (number % 3 == 0 && number % 5 == 0) {
            answer = "FizzBuzz";
        } else if (number % 3 == 0) {
            answer = "Fizz";
        } else if (number % 5 == 0) {
            answer = "Buzz";
        } else {
           answer = String.valueOf(number);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Игра FizzBuzz.");
        var startAt = 1;
        var io = new Scanner(System.in);
        while (startAt < 100) {
            System.out.println(answers(startAt));
            startAt++;
            var newAnswer = io.nextLine();
            if (!answers(startAt).equals(newAnswer)) {
                System.out.println("Ошибка. Начинай снова.");
                startAt = 0;
            }
            startAt++;
        }
    }
}


