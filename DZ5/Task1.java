package DZ5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    
    public HashMap<Integer, String> fillMap() {//вводим данные в телефонную книгу

        HashMap<Integer, String> foneBook = new HashMap<>();
        foneBook.put(926583848, "Петров");
        foneBook.put(956456123, "Петров");
        foneBook.put(326562132, "Васильев");
        foneBook.put(98756231, "Иванов");
        foneBook.put(985623154, "Иванов");
        foneBook.put(852462132, "Захаров ");
        foneBook.put(745125458, "Захаров");

        return foneBook;
    }

    public void searchFone() {//метод поиска абонента по фамилии
        HashMap<Integer, String> foneBook = fillMap();//создаем коллекцию
        System.out.print("Введите фамилию для поиска: ");

        Scanner in = new Scanner(System.in, "Cp866");//создаем сканер для ввода через консоль
        String secondName = in.nextLine();
        in.close();

        System.out.println("Телефонные номера абонента: " );

        for (Map.Entry<Integer, String> foneNumber : foneBook.entrySet()) {//перебираем коллекцию
            if (foneNumber.getValue().equals(secondName)) {// при совпадении  фамилии  с фамилией в коллекции печать

                System.out.println(foneNumber.getKey());//печать ключей совпадающих значений коллекции
            }
        }
    }

}