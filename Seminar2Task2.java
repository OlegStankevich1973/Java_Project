/*
 * 
 * Напишите метод, который сжимает строку. 
 *  Пример: вход aaaabbbcdd.
 * выход abcd
 * 
 */

import java.util.Scanner;

public class Seminar2Task2 {
    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        System.out.println(secondTask.getUniqString());

    }

}

class SecondTask {
    String string;
    boolean repeated;

    SecondTask() {
        Scanner in = new Scanner(System.in);
        string = in.next();
        in.close();
    }

    public StringBuilder getUniqString() {
        StringBuilder result = new StringBuilder();
        char[] chars = string.toCharArray();//разбиваем строку на элементы
        for (int i = 0; i < chars.length; i++) {//проходим строку от начала до конца
            repeated = false;// вводим булевскую переменную
            for (int j = i + 1; j < chars.length; j++) {//проходим строку 
                if (chars[i] == chars[j]) {//ищем одинаковые элнементы
                    repeated = true;//при нахождении  
                    break;// останавливаем цикл
                }
            }
            if (!repeated) {// если переменная repeated не повторялась
                result.append(chars[i]);// элемент массива присоединяем к результату
            }
        }
        return result;
    }
}