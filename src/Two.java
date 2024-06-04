import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е целое число");
        int numberone = sc.nextInt();
        System.out.println("Введите второе целое число");
        int numbertwo = sc.nextInt();
        System.out.println("Результат");
        System.out.println("Сумма двух целых чисел:" + (numberone + numbertwo));
        System.out.println("Разница двух целых чисел:" + (numberone - numbertwo));
        System.out.println("Произведение из двух целых чисел:" + numberone * numbertwo );
        System.out.println("Среднее из двух целых чисел:" + (double) (numberone + numbertwo) / 2);
        System.out.println("Расстояние двух целых чисел:" + Math.abs(numberone - numbertwo));
        System.out.println("Максимальное целое число:" + Math.max(numberone, numbertwo));
        System.out.println("Минимальное целое число:" + Math.min(numberone, numbertwo));

    }
}
