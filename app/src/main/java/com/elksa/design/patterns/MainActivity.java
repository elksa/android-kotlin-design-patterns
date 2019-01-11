package com.elksa.design.patterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.elksa.design.patterns.behavioral.template_method.AbstractClass;
import com.elksa.design.patterns.behavioral.template_method.ConcreteClassA;
import com.elksa.design.patterns.structural.facade.structural.FacadeStructural;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Facade
        FacadeStructural facadeStructural = new FacadeStructural();

        String resultFromA = facadeStructural.getValueA();
        String resultFromB = facadeStructural.getValueB();
        String resultFromC = facadeStructural.getValueC();
        String result1 = facadeStructural.complexMethod1();
        String result2 = facadeStructural.complexMethod2();

        TextView txtFacade = findViewById(R.id.txt_facade);
        txtFacade.setText(resultFromA.concat(
                resultFromB.concat(resultFromC.concat(result1).concat(result2))));

        // Template method
        TextView txtTemplateMethod = findViewById(R.id.txt_template_method);
        AbstractClass ac = new ConcreteClassA();
        txtTemplateMethod.setText(ac.templateMethod());
    }
}
