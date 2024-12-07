package org.example.ZooEcosystemSimulation;

public class AnimalTester {
    public static void main(String[] args) {

        Lion lion=new Lion();
        lion.eat();
        lion.makeSound();
        lion.displayInformation();

        System.out.println();

        Elephant elephant=new Elephant();
        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();

        System.out.println();

        Parrot parrot=new Parrot();
        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();

        System.out.println();

        Eagle eagle=new Eagle();
        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();

    }
}
