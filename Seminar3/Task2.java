package Seminar3;


import java.util.ArrayList;
import java.util.Collections;

public class Task2 {//для запуска надо в файле Main снять комиты,тамже нанаходится точка входа
    int count = 0;
    ArrayList<String> planets = new ArrayList<>();//создаем колекцию стрингов
    ArrayList<String> uniquePlanets = new ArrayList<>();//создаем еще одну коллекцию

    public void addPlanets() {//добавляем по одному названию в коллекцию
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Земля");

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                if (i != j && !planets.get(i).equals(planets.get(j))
                        && !uniquePlanets.contains(planets.get(i))) {
                    count = Collections.frequency(planets, planets.get(i));
                    System.out.println(planets.get(i) + " " + count);
                    uniquePlanets.add(planets.get(i));
                }
            }
        }
        System.out.println(uniquePlanets);
    }
}
/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */