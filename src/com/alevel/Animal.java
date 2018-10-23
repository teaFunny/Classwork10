package com.alevel;

import java.util.prefs.BackingStoreException;

public abstract class Animal {
    int legs;
    String animalClass;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (legs != animal.legs) return false;
        if (!animalClass.equals(animal.animalClass)) return false;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result = legs;
        result = 31 * result + animalClass.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Animal(int legs, String animalClass) {

        this.legs = legs;
        this.animalClass = animalClass;
    }

    public  Animal(){
        legs = 4;
        animalClass = "Mammal";
    }
    public abstract void talk();

    /**
     * Connect two animals by talking.
     * @param animal animal with whom this object connects
     */
    public void interact(Animal animal) throws BackingStoreException {
        try {
            this.talk();
            animal.talk();
        }
        catch (Exception e){
            e.printStackTrace();
            throw new BackingStoreException(e);
        }

    }


}
