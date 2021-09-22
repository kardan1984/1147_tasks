/*
Реализуй в классе Fox интерфейс Animal.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

import java.awt.*;

public class MultiThread {
    public static void main(String[] args){
        Fox fox = new Fox("борзая",5,Color.black);
        System.out.println(fox.getName()+" "+fox.color);
    }
}

interface Animal {
    Color getColor();
}

class Fox implements Animal {
    String nickname;
    int age;
    Color color;

    public Fox(String nickname, int age, Color color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return "Fox";
    }

    @Override
    public Color getColor() {
        return color;
    }
}
