package com.singleton;

public class MySingleton {

    private MySingleton mySingleton;

    private MySingleton() {

    }

    public MySingleton getInstance(){
        if(null == mySingleton){
            synchronized (this){
                if(null == mySingleton) {
                    return new MySingleton();
                }
            }
        }

        return mySingleton;


    }
}
