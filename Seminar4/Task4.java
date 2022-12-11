package Seminar4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task4 {
    int n;
    int[] a;//создаем массив обьектов

    Task4() {//конструктор
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = in.nextInt();//задаем размер массива
        a = new int[n];//задаем массив
        System.out.println("Введите элементы мвссива через энтэр ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();//создаем массив
        }
        in.close();
    }

    public void addToStack() {
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < n; i++) {//пробегаем массив поэлементно
            stack.push(a[i]);//заталкиваем наш массив поэлементно в наш стэк
        }
        System.out.println("Первоначальный stack: " + stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Взяли посмотреть " + i + ": " + stack.peek());
            System.out.println("Взяли посмотреть и удалить " + i + ": " + stack.pop());
        }
        System.out.println("Должен быть пустой стэк: " + stack);
    }

    public void addToQueue() {
        Queue<Object> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(a[i]);
        }
        System.out.println("Первоначальная очередь: " + queue);
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Взяли посмотреть " + i + ": " + queue.peek());
            System.out.println("Взяли посмотреть и удалить " + i + ": " + queue.poll());
        }
        System.out.println("Должен быть пустая очередь: " + queue);
    }
}
/*
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк и
 * выводит на
 * консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов, помещает их в очередь
 * и выводит
 * на консоль содержимое очереди.
 */
