package com.elksa.design.patterns.patterns.creational.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

/**
 * This is the simplest method of creating a singleton class. The singleton instance is created when
 * the class is loaded into memory by the JVM. It can be used when program will always use an instance
 * of this class, or the cost of creating the instance is not too high in terms of resources and time.
 */
public class EagerSingleton {

    /**
     * Public instance is initialized when loading the class, it is final to ensure no further
     * assignations may occur
     */
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * Private constructor to ensure other classes cannot create EagerSingleton instances,
     * it could be protected though, depending on the current design.
     */
    private EagerSingleton() {
    }
}