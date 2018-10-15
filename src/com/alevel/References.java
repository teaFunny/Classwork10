package com.alevel;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class References {
    public static void main(String[] args) {
        WeakReference<Dog> dog = new WeakReference<>(new Dog());
        dog.get();

        SoftReference<Tiger> tiger = new SoftReference<>(new Tiger());
        tiger.get();


    }
}
