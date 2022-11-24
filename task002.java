import java.time.LocalDateTime;

/**
 * Вывести в консоль системные дату и время
 */
public class task002 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);   
    }
}