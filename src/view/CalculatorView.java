package view;

import java.util.List;
import java.util.Scanner;

public class CalculatorView {

    private final Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n======CALCULATOR=====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Show history");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    public int getChoice() {
        return sc.nextInt();
    }

    public double getNumber(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public void showResult(double result) {
        System.out.println("Result = " + result);
    }

    public void showHistory(List<String> history) {
        System.out.println("\n--- History ---");
        if (history.isEmpty()) {
            System.out.println("Chưa có phép toán nào cả !!!!");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }

    public void showError(String msg) {
        System.out.println("Error: " + msg);
    }

}
