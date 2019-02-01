package com.elksa.design.patterns.patterns.creational.singleton.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

/**
 * This is a sub part of Eager initialization. The only difference is object is created in a
 * static block so that we can have access on its creation, like exception handling. In this way
 * object is created at the time of class loading. It can be used when there is a chance of
 * exceptions in creating object with eager initialization.
 */
public class EagerStaticBlockSingleton {

    /**
     * Public instance is initialized when loading the class
     */
    public static EagerStaticBlockSingleton instance;

    /**
     * Private constructor to ensure other classes cannot create EagerStaticBlockSingleton instances,
     * it could be protected though, depending on the current design.
     */
    private EagerStaticBlockSingleton() {

    }

    /*
     * Static block initializes the instance
     */
    static {
        instance = new EagerStaticBlockSingleton();
    }
}
