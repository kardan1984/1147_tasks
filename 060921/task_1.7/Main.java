/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */


    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину в метрах: ");
        float a = scanner.nextFloat();
        System.out.println("Введите ширину в метрах: ");
        float b = scanner.nextFloat();
        System.out.println("Введите высоту в метрах: ");
        float c = scanner.nextFloat();
        System.out.println("Объем в литрах: "+a*b*c*1000);
    }
}
