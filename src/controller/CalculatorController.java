package controller;

import Model.CalculatorModel;

import view.CalculatorView;

public class CalculatorController {

    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        while (true) {
            view.showMenu();
            int choice = view.getChoice();

            try {
                switch (choice) {
                    case 1 -> {
                        double a = view.getNumber("Enter a: ");//cái getNumber đầu tiên sẽ truyền vào msg là 1 thông báo Enter a
                        //sau đó return về sc.nextDouble
                        double b = view.getNumber("Enter b: ");
                        view.showResult(model.add(a, b));
                    }
                    case 2 -> {
                        double a = view.getNumber("Enter a: ");
                        double b = view.getNumber("Enter b: ");
                        view.showResult(model.sub(a, b));
                    }
                    case 3 -> {
                        double a = view.getNumber("Enter a: ");
                        double b = view.getNumber("Enter b: ");
                        view.showResult(model.mul(a, b));
                    }
                    case 4 -> {
                        double a = view.getNumber("Enter a: ");
                        double b = view.getNumber("Enter b: ");
                        view.showResult(model.div(a, b));
                    }
                    case 5 ->
                        view.showHistory(model.getHistory());
                    case 0 -> {
                        System.out.println("Bye!");
                        return;
                    }
                    default ->
                        view.showError("Nhập option sai rồi !");
                }
            } catch (Exception e) {
                view.showError(e.getMessage());
            }
        }
    }
}
