package com.elksa.design.patterns.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elksa.design.patterns.R;
import com.elksa.design.patterns.gof.behavioral.command.real.User;

public class GofCommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gof_command);

        // Real world example

        // Create user and let it compute
        User user = new User();

        // User presses calculator buttons
        user.compute('+', 100);
        user.compute('-', 50);
        user.compute('*', 10);
        user.compute('/', 2);

        // Undo 4 commands

        user.undo(4);
        // Redo 3 commands

        user.redo(3);
    }
}
