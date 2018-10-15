package com.alevel;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        dog.interact(tiger);
    }
}
