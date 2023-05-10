package pl.trypuz.dominik.fizzbuzz;

import pl.trypuz.dominik.fizzbuzz.utils.Descriptions;

public class Main {
    public static void main(String[] args) {

        FizzBuzzApplication application = new FizzBuzzApplication();

        Descriptions.showWelcomeDescription();
        application.startApp();
    }
}
