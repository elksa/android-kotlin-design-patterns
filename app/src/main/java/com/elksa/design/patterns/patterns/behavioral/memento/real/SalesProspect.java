package com.elksa.design.patterns.patterns.behavioral.memento.real;

import android.util.Log;

/**
 * The 'Originator' class
 */
public class SalesProspect {

    private final static String TAG = SalesProspect.class.getName();

    private String phone;
    private float budget;
    private String name;

    public SalesProspect() {
    }

    public SalesProspect(String phone, float budget, String name) {
        this.phone = phone;
        this.budget = budget;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        Log.d(TAG, "Updated phone with: " + phone);
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
        Log.d(TAG, "Updated budget with: " + budget);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Log.d(TAG, "Updated name with: " + name);
    }

    public Memento createMemento() {
        Log.d(TAG, "Saving state...");
        return new Memento(phone, budget, name);
    }

    public void restoreState(Memento memento) {
        phone = memento.getPhone();
        budget = memento.getBudget();
        name = memento.getName();
        Log.d(TAG, "Restoring state...");
    }
}
