/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            FileReader reader = new FileReader(new File(scanner.nextLine()));
            Scanner scanner1 = new Scanner(reader);
            while (scanner1.hasNextInt()) {
                nums.add(scanner1.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("ДО: "+nums);

        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                nums1.add(num);
            }
        }
        Collections.sort(nums1);
        System.out.print("ПОСЛЕ: "+nums1);
    }
}
