import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Исходная строка");
        String s = sc.nextLine();
        System.out.println("Сколько раз вывезти строку?");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.printf(s);
        }
    }
}
