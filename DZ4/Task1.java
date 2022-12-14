package DZ4;

 /** Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    // Метод заполнения LinkedList
    public LinkedList<String> fillLinkedList() {
        LinkedList<String> outList = new LinkedList<>();// создаем линкедлист
        String inDate;
        System.out.println("Введите элементы листа. При завершении введите букву Q");

        do {
            Scanner in = new Scanner(System.in);//вводим через терминал данные линкедлиста
            inDate = in.next();

            if (!inDate.equals("Q")) {//пока не ввели Q добавляем элементы в список
                outList.add(inDate);//добавляем элементы
            }

        } while (!inDate.equals("Q"));
        System.out.println("Исходный список: " + outList);

        return outList;
    }

    // Метод разворота листа
    public void reversList(LinkedList<String> inList) {// если void то return не делаем
        for (int i = 0; i < inList.size() / 2; i++) {
        

            Collections.swap(inList, i, inList.size() -1 );//swap меняем местами переменные половину списка
        }
        System.out.println("Перевернутый список: " + inList);

    }

}