/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,5,6,7};
        int a = 0;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (a<=10)
            a=a+arr[i];
            count++;
        }
        System.out.println("Просуммировав "+count+" элементов, получим итог больше 10, а именно: "+a);
    }
}
