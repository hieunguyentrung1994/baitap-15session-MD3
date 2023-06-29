package bt03;

public class Main {
    public static void main(String[] args) {
        double[] arr ={12,3,0.5,423,65};

        try {
            int sum = sum(arr);
            System.out.println("Tổng của mảng là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Phần tử không phải số nguyên. Bỏ qua phần tử đó.");
        }
    }
    public static int sum(double[] arr) {
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i];
            try {
                sum += arr[i];
            } catch (NumberFormatException e) {
                System.out.println("đây không phải là số nguyên");
                throw new NumberFormatException();
            }

        }
        return sum;
    }

}