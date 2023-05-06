package pl.trypuz.dominik.fizzBuzz;

import pl.trypuz.dominik.fizzBuzz.utils.Descriptions;

public class Main {
    public static void main(String[] args) {

        FizzBuzzApplication application = new FizzBuzzApplication();

        Descriptions.showWelcomeDescription();
        application.startApp();
    }
}
