package com.nastya;

public class Cat extends Animal {
    public static int catCount = 0;
        public Cat (String name) {
        super(name);
        catCount++ ;

                    }

    @Override
    public void run(int runLength) {
        if ( runLength <= 200){
            System.out.println ("Кошка " + name + " пробежала " + runLength + " м.");
        }
        else  {
            System.out.println ( "Кошка не добежала");
        }
    }
    @Override
    public void swim( int swimLength) {
        System.out.println ("Кошка не умеет плавать");
    }

}


