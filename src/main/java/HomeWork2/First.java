package HomeWork2;

public class First {
    public static void main(String[] args) {
        System.out.println(examination(5, 20));
    }

    public static boolean examination(int a, int b) {
        int sum = a + b;
        while (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

}
