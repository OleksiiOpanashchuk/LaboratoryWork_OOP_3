import java.util.Scanner;

public class FunctionFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початкове значення проміжку: ");
        double start = scanner.nextDouble();

        System.out.print("Введіть кінцеве значення проміжку: ");
        double end = scanner.nextDouble();

        System.out.print("Введіть мінімальне значення діапазону: ");
        double min = scanner.nextDouble();

        System.out.print("Введіть максимальне значення діапазону: ");
        double max = scanner.nextDouble();

        int count = 0;
        for (double x = start; x <= end; x += 0.1) {
            double y = function(x);

            if (y >= min && y <= max) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Немає значень функції в заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функції в заданому діапазоні: " + count);
        }
    }

    public static double function(double x) {
        // опис функції тут
        return Math.sqrt(x)/(x+1);
    }
}
