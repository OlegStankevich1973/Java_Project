
// ================================================================================
// ����������� ������� �����������
// ==================================================================================

import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class task011DZ2 {
    
    /**
     *
     */
    private static Logger logger = Logger.getLogger(task011DZ2.class.getName());

    
    public task011DZ2() {
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("task010DZ2.txt");// ������� ���� ��� ������ �����
        ((Object) logger).addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        // public static void main(String[] args) {
        // Calc myObject = new Calc();
        // myObject.calcTask();

    }
}

class Calc {// �� ������ ���������� �������� ������� � �� ���������� ������ �� ������������
            // ������� �� ������ ������
    int numberOne;
    int numberTwo;
    double result;
    char action;// �������� ���� ������ ����� char

    Calc() {// ������� �����������
        Scanner input = new Scanner(System.in);
        System.out.println("������� ������ ����� ");
        numberOne = input.nextInt();// ������ ������ ����� � �������
        System.out.println("������� �������� (+,-,/,*)");
        action = input.next().charAt(0);// ������ 0 �� �������� ��������� ��� �������� ����� �������� � �������� 0
        System.out.println("������� ������ ����� ");
        numberTwo = input.nextInt();// ������ ������ ����� � �������

        input.close();
    }

    void calcTask() {
        switch (action) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }

        System.out.printf(numberOne + " " + action + " " + numberTwo + " = " + result);

    }

    // ����� ������ ����� � ������ � ������ �����
    static String[] ReadWrite(int count) throws IOException {
        FileReader inFile = new FileReader("Seminar2Task5Log.txt");
        Scanner file = new Scanner(inFile);

        String arrayLines[] = new String[count];
        int i = 0;

        while (file.hasNextLine()) {
            String temp = file.nextLine();
            arrayLines[i] = temp;
            System.out.println(arrayLines[i]);
            i++;
        }
        file.close();
        return arrayLines;
    }

    // ����� ������ � ������� ������ ����� ������ WARNING
    static void CheckInfo(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String temp = array[i];
            if (temp.contains("WARNING")) {
                System.out.println(array[i - 1]);
                System.out.println(array[i]);
            }
        }
    }

}
