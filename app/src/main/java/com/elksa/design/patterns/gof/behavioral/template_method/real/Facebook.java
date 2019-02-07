package com.elksa.design.patterns.gof.behavioral.template_method.real;

import android.util.Log;

public class Facebook extends SocialNetwork {

    private final String TAG = Facebook.class.getName();

    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    boolean login(String username, String password) {

        Log.d(TAG, "Checking user's parameters");
        Log.d(TAG, "\"Name: \"" + this.username);

        StringBuilder passwordBuilder = new StringBuilder(password);
        for (int i = 0; i < this.password.length(); i++) {
            passwordBuilder.append("*");
        }

        Log.d(TAG, "\"Password: \"" + passwordBuilder.toString());

        simulateNetworkLatency();

        Log.d(TAG, "LogIn success on Facebook");

        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        Log.d(TAG, "Message: '" + new String(data) + "' was posted on Facebook");
        return true;
    }

    @Override
    void logOut() {
        Log.d(TAG, "User " + username + " was logged out from Facebook");
    }
}
