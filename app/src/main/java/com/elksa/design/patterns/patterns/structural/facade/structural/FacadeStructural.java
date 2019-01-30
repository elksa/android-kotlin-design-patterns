package com.elksa.design.patterns.patterns.structural.facade.structural;

public class FacadeStructural {

    private ISubSystem subSystemA;
    private ISubSystem subSystemB;
    private ISubSystem subSystemC;

    public FacadeStructural() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public String getValueA() {
        return subSystemA.method();
    }

    public String getValueB() {
        return subSystemB.method();
    }

    public String getValueC() {
        return subSystemC.method();
    }

    /**
     * Concatenates the results from methods A and C
     * @return The concatenated string value
     */
    public String complexMethod1() {
        return "".concat(subSystemA.method()).concat(subSystemC.method());
    }

    /**
     * Concatenates the results from methods B and C
     * @return The concatenated string value
     */
    public String complexMethod2() {
        return "".concat(subSystemB.method()).concat(subSystemC.method());
    }
}
