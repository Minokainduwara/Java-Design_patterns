package com.singleton.eagersingleton;
public class Maineager {
    public static void main(String[] args) {
        eagerSingleton s1 = eagerSingleton.getInstance();
        eagerSingleton s2 = eagerSingleton.getInstance();

        System.out.println(s1 == s2); // true
    }
}