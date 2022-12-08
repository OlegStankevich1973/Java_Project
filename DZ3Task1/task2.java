package DZ3Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка.
 */


public class task2 {
    public static void main(String[] args) {
        TaskTwo myObject = new TaskTwo();
        myObject.taskTwo();
        
    }
}

class TaskTwo {
    ArrayList<Integer> numbers = new ArrayList<>();

    // метод, объединяющий
    public void taskTwo() {
        // формирую исходный список
        numbers = randomNumberList();
        System.out.println(numbers);
        System.out.print("\n");
        solution();

    }

    // метод генерации случайного числа
    public int checkRandom() {
        Random random = new Random();
        int min = 1;
        int max = 1000;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    // метод запонения ArrayList
    public ArrayList<Integer> randomNumberList() {//создаём коллекцию из чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Исходный список");
        for (int i = 0; i < n; i++) {
            numbers.add(checkRandom());
        }
        return numbers;
    }

    // метод поиска мах, мин, среднего и среднего по положению (при n нечетном)
    public void solution() {
       
        System.out.println("Максимальное: " + Collections.max(numbers));
        System.out.println("Минимальное: " + Collections.min(numbers));

        
        double avarage = (Collections.max(numbers) - Collections.min(numbers)) / 2;
        
        System.out.println("Среднее значение: " + avarage);

        if (numbers.size() % 2 != 0) {
            int medium = numbers.get(numbers.size() / 2);
            // numbers.size() / 2 +1 - это середина!!! но так как индексация с 0, то без 1

            System.out.println("Среднее по положению: " + medium);
        } else {
            System.out.println("Список четный. Среднего по положению нет");
        }

    }
}