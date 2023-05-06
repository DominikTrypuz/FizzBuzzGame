package pl.trypuz.dominik.fizzBuzz;

import pl.trypuz.dominik.fizzBuzz.services.FizzBuzzService;
import pl.trypuz.dominik.fizzBuzz.utils.Descriptions;

import java.util.Scanner;

public class FizzBuzzApplication {

    public void startApp() {
        Scanner scanner = new Scanner(System.in);
        FizzBuzzService service = new FizzBuzzService();

        String choose = "";
        while (!choose.equals("e")) {

            Descriptions.showGameDescription();

            switch (choose = scanner.next()) {
                case "d" -> service.createFizzBuzz();
                case "e" -> System.out.println("Goodbye!");
                case "i" -> Descriptions.showWelcomeDescription();
            }
        }
    }
}
