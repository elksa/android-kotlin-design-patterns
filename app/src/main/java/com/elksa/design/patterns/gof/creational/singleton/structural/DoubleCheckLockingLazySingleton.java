package com.elksa.design.patterns.gof.creational.singleton.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

public class DoubleCheckLockingLazySingleton {

    /**
     * DoubleCheckLockingLazySingleton instance is kept private so that no one can access it directly
     */
    private static DoubleCheckLockingLazySingleton instance;

    /**
     * Private constructor to ensure other classes cannot create DoubleCheckLockingLazySingleton instances,
     * it could be protected though, depending on the current design.
     */
    private DoubleCheckLockingLazySingleton() {

    }

    /**
     * Controls simultaneous access and uses lazy initialization to create and return a singleton instance
     * @return DoubleCheckLockingLazySingleton instance
     */
    public static DoubleCheckLockingLazySingleton getInstance() {

        if (instance == null) {

            // Synchronized block to remove overhead
            synchronized (DoubleCheckLockingLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingLazySingleton();
                }
            }
        }

        return instance;
    }
}
