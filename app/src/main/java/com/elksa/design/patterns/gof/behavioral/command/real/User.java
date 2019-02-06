package com.elksa.design.patterns.gof.behavioral.command.real;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'Invoker' class
 */
public class User {

    private Calculator calculator;
    private List<Command> commands;
    private int current;

    public User() {
        calculator = new Calculator();
        commands = new ArrayList<>();
        current = 0;
    }

    public void undo(int levels) {

        Log.d(User.class.getName(), "Undo " + levels + " levels");

        // Perform undo operations
        for (int i = 0; i < levels; i++) {
            if (current > 0) {
                Command command = commands.get(--current);
                command.unExecute();
            }
        }
    }

    public void redo(int levels) {

        Log.d(User.class.getName(), "Redo " + levels + " levels");

        // Perform undo operations
        for (int i = 0; i < levels; i++) {
            if (current < commands.size() - 1) {
                Command command = commands.get(current++);
                command.unExecute();
            }
        }
    }

    public void compute(char operator, int operand) {

        // Create command operation and execute it
        Command command = new CalculatorCommand(operator, operand, calculator);
        command.execute();

        // Add command to undo list
        commands.add(command);
        current++;
    }
}
