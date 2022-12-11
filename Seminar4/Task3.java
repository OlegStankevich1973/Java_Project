package Seminar4;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    String a;

    public void task() {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); // LIFO - last in first out
        do {
            a = in.next();
            if (!a.equals("print") && !a.equals("revert") && !a.equals("Q")) {// если a не equals print и a не equals
                                                                              // revert и a не equals Q
                stack.push(a);// то мы в верхушку стека добавляем элемент
            } else if (a.equals("print")) {//формирует список
                for (int i = stack.size() - 1; i >= 0; i--) {//перевернули список
                    System.out.println(stack.elementAt(i));
                }
            } else if (a.equals("revert")) {
                stack.pop();// удаляет введенную предыдущую строку из памяти
            }
        } while (!a.equals("Q"));// пока не введено Q
    }
}

/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой
 * в списке, а
 * первая - последней. Если введено revert, удаляет предыдущую введенную строку
 * из памяти.
 */