package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // FirstProblem firstProblem = new FirstProblem();
        // firstProblem.arrayListTime();
        // firstProblem.linkedListTime();

        TaskTwo secondProblem = new TaskTwo();
        secondProblem.addToLinkedList();

        // Task3 thirdProblem = new Task3();
        // thirdProblem.task();

        Task4 fourthProblem = new Task4();
        fourthProblem.addToStack();//запускаем методы в программе где решаем задачу
        fourthProblem.addToQueue();
    }
}