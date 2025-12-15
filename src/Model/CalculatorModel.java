package Model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel {

    private double result = 0;//tạo chỗ để lưu đáp án,lưu kiểu số double
    private final List<String> history = new ArrayList<>();//này là dùng để lưu lại lịch sử mà lưu dưới dạng String

    public double add(double a, double b) {//tạo cái hàm lưu số và nhận giá trị a và b người dùng nhập
        result = a + b;
        history.add(a + " + " + b + " = " + result);
        return result;
    }

    public double sub(double a, double b) {
        result = a - b;
        history.add(a + " - " + b + " = " + result);
        return result;
    }

    public double mul(double a, double b) {
        result = a * b;
        history.add(a + " * " + b + " = " + result);
        return result;
    }

    public double div(double a, double b) {
        if (b == 0) {
            history.add("Chia cho 0 tao đá chết cha m giờ !");
            throw new ArithmeticException("Không thể chia cho 0 ! ");//bắt lỗi khúc nhập b là 0 
        }
        result = a / b;
        history.add(a + " / " + b + " = " + result);
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}
