package com.nastya;

public class Dog extends Animal {
    public static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++ ;
          }

    @Override
    public void run(int runLength) {
        if ( runLength <= 500){
            System.out.println ("Собака " + name + " пробежала " + runLength + " м.");
        }
        else  {
            System.out.println ( "Собака уснула где-то в пути");
        }
    }

    @Override
    public void swim(int swimLength) {
        if ( swimLength <= 10){
            System.out.println ("Собака " + name + " проплыла " + swimLength + " м.");
        }
        else  {
            System.out.println ( "Мы свегда будем помнить тебя, " +name);
        }
    }

}
