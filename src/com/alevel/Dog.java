package com.alevel;

public class Dog extends Animal {
    @Override
    public void talk() {
        System.out.println("Woof-woof");
    }

    public void guard(){
        System.out.println("guarding...");
    }
}
