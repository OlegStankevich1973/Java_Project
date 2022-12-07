package Seminar3;


import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    ArrayList<String> myList = new ArrayList<>();//создаем коллекцию

    public void work() {//
        myList.add("Hello");
        myList.add("Seminar");
        myList.add(String.valueOf(1));//помещаем в стрроки целые числа
        myList.add(String.valueOf(3));// помещаем в стрроки целые числа

        System.out.println("Первичный список " + myList);
        Iterator<String> iterator = myList.iterator();//создаем итератор
        while (iterator.hasNext()) {//
            if (iterator.next().matches("\\b[\\d]+\\b")) {//выбираем из коллекции целые числа("\\b[\\d]+\\b")
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
/*
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */