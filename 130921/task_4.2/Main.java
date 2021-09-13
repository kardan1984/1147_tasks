/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Тузик");
        dog.setAge(5);
        System.out.println(dog.getName());
        System.out.println(dog.getAge()+" лет");
    }
}

class Dog {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
}
