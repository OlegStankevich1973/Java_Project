package DZ3Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
*/

public class task1 {
    public static  void main(String[] args) {
        TaskOne myObject = new TaskOne();
        myObject.taskOne();
    }
}

class TaskOne {
    ArrayList<Integer> numbers = new ArrayList<>();// создаем коллекцию чисел

    // метод, объединяющий
    public void taskOne() {
        System.out.println("Исходный список");
        numbers = randomNumberList();// результату метода(public ArrayList<Integer> randomNumberList())присваиваем
                                     // значение numbers
        System.out.println(numbers);
        System.out.print("\n");

        System.out.println("Выходной список");
        numbers = delEven();//результату метода (public ArrayList<Integer> delEven()) присваиваем значение
                            // numbers
        System.out.println(numbers);

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
    public ArrayList<Integer> randomNumberList() {
        ArrayList<Integer> numbers = new ArrayList<>(); //создаем коллекцию из 20 случайных чисел 
        for (int i = 0; i < 20; i++) {
            numbers.add(checkRandom());//генерируем случайные числа
        }
        return numbers;
    }

    // Метод удаления четных чисел
    public ArrayList<Integer> delEven() {
        Iterator<Integer> iterator = numbers.iterator();// создаем итератор для прохождения списка
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp % 2 == 0) {//итератор ищет четные значения
                iterator.remove();
            }
        }
        return numbers;
    }

}
