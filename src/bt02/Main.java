package bt02;

public class Main {

        public static void main(String[] args) throws Exception {
            int[] numbers = {5, 8, 2, 10, 4};
            int maxNumber = findMaxNumber(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        }
        public static int findMaxNumber(int[] arr) throws Exception {
            if (arr.length == 0) {
                throw new Exception("Mảng rỗng");
            }

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }


