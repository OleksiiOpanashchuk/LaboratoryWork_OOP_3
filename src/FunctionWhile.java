import java.util.Scanner;

public class FunctionWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Зчитування меж проміжку
        System.out.print("Введіть ліву межу проміжку: ");
        double left = input.nextDouble();

        System.out.print("Введіть праву межу проміжку: ");
        double right = input.nextDouble();

        // Зчитування границь діапазону
        System.out.print("Введіть ліву границю діапазону: ");
        double lowerBound = input.nextDouble();

        System.out.print("Введіть праву границю діапазону: ");
        double upperBound = input.nextDouble();

        // Обчислення та виведення значень функції
        int count = 0;
        double x = left;
        while (x <= right) {
            double y = function(x);
            System.out.println("f(" + x + ") = " + y);
            if (y >= lowerBound && y <= upperBound) {
                count++;
            }
            x += 0.1; // Крок зміни аргументу функції
        }

        // Виведення результату
        if (count == 0) {
            System.out.println("Немає значень функції у вказаному діапазоні");
        } else {
            System.out.println("Кількість значень функції у вказаному діапазоні: " + count);
        }
    }

    // Задана функція
    public static double function(double x) {
        return Math.sqrt(x)/(x+1);
    }
}
