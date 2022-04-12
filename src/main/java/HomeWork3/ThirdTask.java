package HomeWork3;

public class ThirdTask {

    public static void checkSumSign(){
        int a = 1;
        int b = -2;

        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void main(String[] args) {
        checkSumSign();
    }
}
