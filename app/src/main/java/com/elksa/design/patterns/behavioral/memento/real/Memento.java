package com.elksa.design.patterns.behavioral.memento.real;

/**
 * The 'Memento' class
 */
public class Memento {

    private String phone;
    private float budget;
    private String name;

    public Memento() {
    }

    public Memento(String phone, float budget, String name) {
        this.phone = phone;
        this.budget = budget;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
