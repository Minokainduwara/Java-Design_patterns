package com.singleton.class_based_singleton;
public final class ClassSingleton {
	private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
        // private constructor to prevent instantiation   
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
