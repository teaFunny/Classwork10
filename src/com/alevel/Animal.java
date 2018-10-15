package com.alevel;

public abstract class Animal {
    int legs;
    String animalClass;

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
    public void interact(Animal animal){
        this.talk();
        animal.talk();
    }
}
