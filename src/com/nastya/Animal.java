package com.nastya;

import javax.xml.namespace.QName;

public abstract class Animal {
    protected String name;
    public static int animalCount = 0;
        public Animal ( String name) {
        this.name = name ;
            animalCount++;

    }

     public abstract void run ( int runLength );

    public abstract void swim ( int swimLength );

    }
