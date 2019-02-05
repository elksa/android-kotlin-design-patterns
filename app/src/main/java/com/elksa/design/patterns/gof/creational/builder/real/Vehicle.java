package com.elksa.design.patterns.gof.creational.builder.real;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * The 'Product' class
 */
public class Vehicle {

    private static final String TAG = Vehicle.class.getName();

    private String type;
    private Map<String, String> parts;

    public Vehicle(String type) {
        parts = new HashMap<>();
        this.type = type;
    }

    public String getPart(String key) {
        return parts.get(key);
    }

    public void setPart(String key, String part) {
        parts.put(key, part);
    }

    public void show() {

        Log.d(TAG, "Vehicle type: " + type);
        Log.d(TAG, "Frame: " + parts.get("frame"));
        Log.d(TAG, "Engine: " + parts.get("engine"));
        Log.d(TAG, "#Wheels: " + parts.get("wheels"));
        Log.d(TAG, "#Doors: " + parts.get("doors"));
    }
}
