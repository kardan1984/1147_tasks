/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] arr = {2,3,4,5};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i]==5)
                count++;
        }
        if (count>0)
        System.out.println("ДА");
        else System.out.println("НЕТ");
    }
}
