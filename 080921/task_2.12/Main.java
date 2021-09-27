/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 8, 8, 4, 12, 12, 14};
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) count++;
            else {
                if (count > result) {
                    result = count;
                }
                count = 0;
            }
        }
        if (count > result) result = count;
        System.out.println("Максимальная последовательность одинаковых чисел: "+(result+1));
    }
}
