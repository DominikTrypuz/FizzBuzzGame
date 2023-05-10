package pl.trypuz.dominik.fizzbuzz.utils;

public class Descriptions {

    public static void showWelcomeDescription() {
        System.out.println("""
                \nWelcome in FizzBuzz game!
                If you will draw number divisible by three, you will see Fizz
                If you will draw number divisible by five, you will see Buzz
                If you will draw number divisible by three and five, you will see FizzBuzz
                """);
    }

    public static void showGameDescription() {
        System.out.println("""
                Draw your number- press 'd'
                Show informations- press 'i'
                Exit- press 'e'
                """);
    }
}
