package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    /*
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */
      
    public void randomNumberList() {
        ArrayList number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(Math.random());//создаем случайные числа
        }
        System.out.println(number);//печатаем исходную коллекцию
        Collections.sort(number);//сортируем коллекцию по возрастанию
        System.out.println(number);//печатаеи отсортированную коллекцию
        System.out.println(number.get(1));//выводим второе число из коллекции
    }
}