package com.elksa.design.patterns.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elksa.design.patterns.R;
import com.elksa.design.patterns.gof.behavioral.template_method.real.Facebook;
import com.elksa.design.patterns.gof.behavioral.template_method.real.SocialNetwork;
import com.elksa.design.patterns.gof.behavioral.template_method.real.Twitter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GofTemplateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);

        // Real
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork network = null;
        String userName = "template";
        String password = "mypassword";

        // Enter the message.
       String message = "Hello I'm a cute little message";

        //Choosing Facebook to post message
        int choice = 1;

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
