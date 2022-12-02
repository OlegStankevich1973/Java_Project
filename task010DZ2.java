
/*
 * 
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 * 
 */

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class task010DZ2 {
    private static Logger logger = Logger.getLogger(task010DZ2.class.getName());// создаем логер

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("task010DZ2.txt");// создаем файл для записи логов
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        System.out.print("Введите размерность массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int[] array = fillArray(n); // заполнение массива
        printArray(array); // печать массива

        array = arrayBubble(array); // сортировка массива
        System.out.println("Отсортированный массив");
        printArray(array); // печать отсортированного массива

    }

    // метод генерации случайного числа
    public static int checkRandom() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    // метод заполнения массива
    public static int[] fillArray(int n) {

        int outArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            outArray[i] = checkRandom();
        }
        return outArray;
    }

    // метод печати массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Метод сортировки массива
    public static int[] arrayBubble(int[] array) throws IOException {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info("Сделана итерация " + (array.length - i));
        }
        return array;
    }

}