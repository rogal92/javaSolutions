package com.javarush.test.level05.lesson07.task01;

/* Create a class Friend
Create a class Friend with three initializers (three methods initialize):
    - Name
    - Name, age
    - Name, age, sex
*/

public class Friend
{
    private String friend;

    public void initialize(String name) {
        this.friend = name;
    }

    public void initialize(String name, int age) {
        this.friend = name + age;
    }

    public void initialize(String name, int age, String sex) {
        this.friend = name + age + sex;
    }
}
