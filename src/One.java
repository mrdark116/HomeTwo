import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите степень в градусах Фаренгейта:");
        double farengeyt = sc.nextDouble();
        double celsiay = (farengeyt - 32) * 5/9;
        System.out.println(farengeyt +  " градусов по Фаренгейту равна " + celsiay + " по Цельсию");
    }
}
