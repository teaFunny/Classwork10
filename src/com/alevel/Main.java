package com.alevel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        dog.interact(tiger);

        for (Season season : Season.values()) {
            System.out.println(season);
        }

        System.out.println(Arrays.toString(Season.valueOf("FALL").months));
    }
}
