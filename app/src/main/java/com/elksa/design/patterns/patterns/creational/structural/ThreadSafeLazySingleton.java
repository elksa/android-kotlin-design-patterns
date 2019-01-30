package com.elksa.design.patterns.patterns.creational.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

public class ThreadSafeLazySingleton {

    /**
     * ThreadSafeLazySingleton instance is kept private so that no one can access it directly
     */
    private static ThreadSafeLazySingleton instance;

    /**
     * Private constructor to ensure other classes cannot create ThreadSafeLazySingleton instances,
     * it could be protected though, depending on the current design.
     */
    private ThreadSafeLazySingleton() {

    }

    /**
     * Controls simultaneous access and uses lazy initialization to create and return a singleton instance
     * @return ThreadSafeLazySingleton instance
     */
    synchronized public static ThreadSafeLazySingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }

        return instance;
    }
}
