package pl.trypuz.dominik.fizzbuzz.services;

import java.util.Random;

public class FizzBuzzService {

    public void createFizzBuzz() {
        int i = generateRandomNumber();
        String fizzBuzz = drawFizzBuzz(i);

        System.out.println("Your number is " + i + "\n" + fizzBuzz + "\n");
    }

   public String drawFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return "Neither fizz nor buzz :(";
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}
