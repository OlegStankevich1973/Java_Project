// ================================================================================
// Реализовать простой калькулятор
// ==================================================================================

import java.util.Scanner;
public class task008 {
    public static void main(String[] args) {
        Calc myObject = new Calc();
        myObject.calcTask();
        
    }
}

class Calc {// не делать одинаковые названия классов а то происходит почему то вытаскивание решения из другой задачи
    double numberOne;
    double numberTwo;
    double result;
    char action;//вводится один символ метод char
    
    Calc() {//создаем конструктор
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число ");
        numberOne = input.nextInt();//вводим первое число в консоль
        System.out.println("Введите действие (+,-,/,*)");
        action = input.next().charAt(0);//индекс 0 тк вводится умножение или сложение одним символом с индексом 0
        System.out.println("Введите второе число ");
        numberTwo = input.nextInt();//вводим второе число в консоль

        input.close();
    }

    void calcTask() {        
        switch (action) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
            }        

        
        System.out.printf(numberOne + " " + action + " " + numberTwo + " = " + result);
           
    }


}

    

