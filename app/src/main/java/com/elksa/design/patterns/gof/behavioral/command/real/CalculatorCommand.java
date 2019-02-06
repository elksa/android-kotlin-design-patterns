package com.elksa.design.patterns.gof.behavioral.command.real;

/**
 * The 'ConcreteCommand' class
 */
public class CalculatorCommand extends Command {

    private char operator;
    private int operand;
    private Calculator calculator;

    public CalculatorCommand(char operator, int operand, Calculator calculator) {
        this.operator = operator;
        this.operand = operand;
        this.calculator = calculator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.operation(operator, operand);
    }

    @Override
    public void unExecute() {
        calculator.operation(undo(operator), operand);
    }

    /**
     * Calculates the opposite of a given operator
     * @param operator given operator
     * @return the opposite operator
     */
    private char undo(char operator) {

        switch (operator) {
            case '+': return '-';
            case '-': return '+';
            case '*': return '/';
            case '/': return '*';
            default:
                throw new RuntimeException("Invalid operator");
        }
    }
}
