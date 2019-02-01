package com.elksa.design.patterns.gof.creational.builder.structural;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts;

    public Product() {
        parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public String show() {

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part).append("\n");
            Log.d(Product.class.getName(), "Part: " + part);
        }

        return result.toString();
    }
}
