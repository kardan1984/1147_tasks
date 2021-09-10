/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

public class Main {
    public static void main(String[] args) {
    System.out.println(digits (5,6));
    }
    public static boolean digits (int a, int b){
        if (a==b)
            return true;
        else
            return false;
    }
}
