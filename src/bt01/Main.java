package bt01;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

        public static void main(String[] args) {
            int number1 = inputNumber("Nhập số nguyên thứ nhất: ");
            int number2 = inputNumber("Nhập số nguyên thứ hai: ");

            int sum = number1 + number2;
            System.out.println("Tổng hai số là: " + sum);
        }

        public static int inputNumber(String message) {
            Scanner scanner = new Scanner(System.in);
            int number;
            try {
                System.out.print(message);
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Giá trị không hợp lệ. Vui lòng nhập lại số nguyên.");
                // Đệ quy để yêu cầu người dùng nhập lại
                number = inputNumber(message);
            }
            return number;
        }
    }

