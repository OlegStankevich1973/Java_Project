import java.util.Scanner;

public class task005 {//класс main тут происходит сбор всех других классов и методов и происходит запуск программы
    public static void main(String[] args) {
        Task myObject = new Task();//создаем  обьект Task для запуска класса Task строка 10 
        myObject.maxOfOnes();//запускаем через обьект Task(те предварительно запустив конструктор)метод
        // maxOfOnes строка 27
    }
}

class Task {//создаем новый класс(в котором строим логику решения задачи)
    int n;//задаем количество элементов массива
    int[] array;//создаем массив

    Task() {//
        Scanner input = new Scanner(System.in);//создаем сканер для того чтобы читать из консоли
        System.out.println("Ввведите количество элементов массива");// выводим в консоль
        n = input.nextInt();//читаем из консоли
        array = new int[n];//создаем пустой массив для заполнения n элементами 
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();//вводим элементы массива
        }
        input.close();// закрываем сканер
    }

    void maxOfOnes() {// метод подсчета одинаковых элементов массива идущих друг за другом
        int count = 0;
        int anotherCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {// если элемент массива =1 ,то мы считаем количество этих 1
                anotherCount += 1;
            } else if (count < anotherCount) {//если не равно то сравниваем подсчитанные 1 с последующим количеством 1
                count = anotherCount;// присваиваем большее значение 1 count
                anotherCount = 0;
            }
        }
        if (count < anotherCount) {
            System.out.println("Максимальное число повторяющихся элементов " + anotherCount);
        } else {
            System.out.println("Максимальное число повторяющихся элементов " + count);
        }
    }
}