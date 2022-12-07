package Seminar3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Task3 {
    int count = 0;
    ArrayList<String> planets = new ArrayList<>();

    public void addPlanets() {
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Марс");
        

        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(planets, iterator.next()) > 1) {//если слово повторяется больше 1 раза
                count++;//увеличивается
                iterator.remove();
            }
        }
        System.out.println(planets);
        System.out.println(count);
    }
}
/*
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */