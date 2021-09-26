/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());

        System.out.println("ДО"+nums);

        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int num:nums){
            if (num>0 && num<10) nums1.add(num);
        }

        System.out.println("ПОСЛЕ"+nums1);

    }
}
