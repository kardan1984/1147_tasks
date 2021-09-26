/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while (true) {
            String city = scanner.nextLine();
            String family = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            list.add(city);
            list.add(family);
        }
        System.out.println(list);

        // Read the city name
        String newcity = scanner.nextLine();

        if (!newcity.isEmpty() && list.contains(newcity)) {
            String newfamily = list.get(list.indexOf(newcity)+1);
            System.out.println(newfamily);
        }
    }
}
