package com.singleton.eagersingleton;

public class eagerSingleton {
    // created immediately (EAGER)
    private static final eagerSingleton instance = new eagerSingleton();

     // private constructor (no one can create object)
     private eagerSingleton() {}

     // global access method
     public static eagerSingleton getInstance() {
         return instance;
     }

}
