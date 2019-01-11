package com.elksa.design.patterns.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elksa.design.patterns.R;

public class TemplateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);
    }
}
