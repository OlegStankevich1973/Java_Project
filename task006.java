import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */
public class task006 {

    public static void main(String[] args) {
        Program myObject = new Program();
        myObject.triangularNumber();
        myObject.factorialNumber();

    }
}

class Program {// создаем новый класс(в котором строим логику решения задачи)
    int n;

    Program() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное число n ");
        n = input.nextInt();//
        input.close();
    }

    void triangularNumber() {
        int T = 0;
        T = (n * (n + 1)) / 2;
        System.out.println("Треугольное число равно " + T);
    }

    void factorialNumber() {
        int F = 1;
        for (int i = 1; i < n + 1; i++) {
            F = F * i;

        }
        if (n == 0) {
            F = 1;
        }
        System.out.println("Факториал числа " + F);
    }

}