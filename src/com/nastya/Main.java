package com.nastya;

public class Main {

    public static void main(String[] args) {

	Cat cat1 = new Cat("Машка") ;
	Dog dog1 = new Dog ("Рекс") ;
	Dog dog2 = new Dog ("Тузик") ;
	System.out.println ("Побежали...");
	dog1.run (500);
	cat1.run (500);
	dog2.run (100);
	System.out.println ("Поплыли...");
	cat1.swim (500);
	dog1.swim (10);
	dog2.swim (100);

	int countС =Cat.catCount;
	int countD =Dog.dogCount;
	int countA =Animal.animalCount;
		System.out.printf ("Мы создали:\n "+countD +" -собак\n " + countС + " -кошек\n " + countA +" -всего животных \n ");


    }

}

