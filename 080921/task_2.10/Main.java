/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] arr = {2,3,4,5,3,7,7};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1])
                count++;
        }
        if (count>0)
        System.out.println("ДА");
        else
        System.out.println("НЕТ");
    }
}
