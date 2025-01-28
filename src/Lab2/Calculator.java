package Lab2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое и второе число -");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        System.out.println("Выберите и введите операцию, которую вы хотите произвести (+,-,*,/, %) - ");
        double op = scanner.next().charAt(0);
        solve(a,b,op);
    }
    public static double solve(double a, double b, double op){
        double ans = 0;
        if (op == '+') {
            ans = a + b;
        }
        else if (op == '-') {
            ans = a - b;
        }
        else if (op == '*') {
            ans = a  * b;
        }
        else if (op == '%') {
            ans = a % b;
        }
        else if (op == '/') {
            ans = a / b;
        }
        System.out.println("Ваш ответ - " + ans);
        return ans;
    }

}
