package com.elksa.design.patterns.patterns.creational.singleton.structural;

/*
 * @author Alejandro Casanova Mutis
 * @created 30/01/2019
 */

public class BillPughSingleton {

    /**
     * Private constructor to ensure other classes cannot create BillPughSingleton instances,
     * it could be protected though, depending on the current design.
     */
    private BillPughSingleton() {

    }

    /**
     * Inner class to provide BillPughSingleton instance
     */
    private static class InnerBillPughSingleton {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    /**
     * Creates and returns the singleton instance
     * @return BillPughSingleton instance
     */
    public static BillPughSingleton getInstance() {
        return InnerBillPughSingleton.INSTANCE;
    }
}
