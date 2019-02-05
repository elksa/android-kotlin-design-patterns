package com.elksa.design.patterns.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elksa.design.patterns.R;
import com.elksa.design.patterns.gof.creational.builder.real.CarBuilder;
import com.elksa.design.patterns.gof.creational.builder.real.MotorCycleBuilder;
import com.elksa.design.patterns.gof.creational.builder.real.ScooterBuilder;
import com.elksa.design.patterns.gof.creational.builder.real.Shop;
import com.elksa.design.patterns.gof.creational.builder.real.VehicleBuilder;
import com.elksa.design.patterns.gof.creational.builder.structural.Builder;
import com.elksa.design.patterns.gof.creational.builder.structural.ConcreteBuilderA;
import com.elksa.design.patterns.gof.creational.builder.structural.ConcreteBuilderB;
import com.elksa.design.patterns.gof.creational.builder.structural.Director;
import com.elksa.design.patterns.gof.creational.builder.structural.Product;

public class GofBuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gof_builder);

        // Structural

        // Create director and builders

        Director director = new Director();

        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();

        // Construct two products

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();


        // Real
        VehicleBuilder builder;

        // Create shop with vehicle builders

        Shop shop = new Shop();

        // Construct and display vehicles

        builder = new ScooterBuilder();
        shop.build(builder);
        builder.getVehicle().show();

        builder = new CarBuilder();
        shop.build(builder);
        builder.getVehicle().show();

        builder = new MotorCycleBuilder();
        shop.build(builder);
        builder.getVehicle().show();
    }
}
