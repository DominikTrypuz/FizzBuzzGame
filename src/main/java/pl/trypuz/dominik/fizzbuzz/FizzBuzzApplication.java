package pl.trypuz.dominik.fizzbuzz;

import pl.trypuz.dominik.fizzbuzz.services.FizzBuzzService;
import pl.trypuz.dominik.fizzbuzz.utils.Descriptions;

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
