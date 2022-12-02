/* Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, начиная с c1.
*/

import java.util.Scanner;

public class Seminar2Task1 {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        System.out.println(firstTask.getResult());
    }

}

class FirstTask {// создаем новый класс
    int n;
    char a;
    char b;
    int counter = 0;

    FirstTask() {// создаем конструктор(для ввода исходных данных) 
        Scanner in = new Scanner(System.in, "Cp866");
        n = in.nextInt();
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }

    
    public StringBuilder getResult() {
        StringBuilder result = new StringBuilder();
        while (n != counter) {//создаем условие при котором будет происходить соеденение 
            result.append(a).append(b);//присоединяем переменные друг к другу
            counter = counter + 1;
        }
        return result;
    }
}