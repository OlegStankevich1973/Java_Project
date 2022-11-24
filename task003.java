import java.util.Scanner;

/**
 * Написать программу которая запросит пользователя ввести (имя) в консоли.
 * Получит введенную строку и выведет в консоль сообщение "Привет,(Имя)!" 
 */
public class task003 
{
    public static void main(String[] args) 
    {
        System.out.println("Введите имя: ");
        Scanner in = new Scanner(System.in);//открыли и обьявили сканер
        String name = in.nextLine();//Ввели информацию в консоль
        in.close();//Чтобы сканер дальше ничего не ждал мы его закрываем
        System.out.println("Привет," + name);
    }
}