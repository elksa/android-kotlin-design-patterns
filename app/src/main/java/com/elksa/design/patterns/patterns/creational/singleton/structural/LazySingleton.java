package com.elksa.design.patterns.patterns.creational.singleton.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

public class LazySingleton {

    /**
     * LazySingleton instance is kept private so that no one can access it directly
     */
    private static LazySingleton instance;

    /**
     * Uses lazy initialization to create and return a singleton instance
     * @return LazySingleton instance
     */
    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    /**
     * Private constructor to ensure other classes cannot create LazySingleton instances, it could be
     * protected though, depending on the current design.
     */
    private LazySingleton() {
    }
}
