/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum  = scanner.nextFloat();
        System.out.println("Введите процент: ");
        float pcnt  = scanner.nextFloat();
        for (int i = 1; i <6; i++) {
            sum *=(1+pcnt/100);
            System.out.println("Сумма на вкладе на конец "+i+" года: "+sum);
        }
    }
}
