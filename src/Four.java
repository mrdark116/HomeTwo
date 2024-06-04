import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите повторяемый элемент сетки");
        String s = sc.nextLine();
        System.out.println("Введите число строк и столбцов сетки");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(s);
            for(int j = 0; j <a - 1 ; j++) {
                System.out.print(s);
            }
            System.out.print('\n');
        }
    }
}



