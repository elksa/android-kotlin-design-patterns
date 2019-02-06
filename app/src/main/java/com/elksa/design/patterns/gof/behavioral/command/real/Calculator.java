package com.elksa.design.patterns.gof.behavioral.command.real;

import android.util.Log;

/**
 * The 'Receiver' class
 */
public class Calculator {

    private int current;

    public void operation(char operator, int operand) {

        switch (operator) {
            case '+': current += operand; break;
            case '-': current -= operand; break;
            case '*': current *= operand; break;
            case '/': current /= operand; break;
        }

        Log.d(Calculator.class.getName(), "Current value = " + current + " (following " +
                operator + " " + operand + ")");
    }
}
