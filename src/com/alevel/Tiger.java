package com.alevel;

import java.util.prefs.BackingStoreException;

public class Tiger extends Animal {
    @Override
    public void talk(){
        try {
            liveInJungle();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        System.out.println("Rrrr!");
    }

    public void liveInJungle() throws Exception {
        System.out.println("I`m in jungles");
    }
}
