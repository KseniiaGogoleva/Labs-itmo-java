package Lab1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int b = scanner.nextInt();
        if (b%2==0) {
            if (b>100)System.out.println("Выход за пределы диапазона");
            else System.out.println("Вы ввели четное число");
        }
        else System.out.println("Вы ввели нечетное число");
    }
}
