package com.elksa.design.patterns.gof.behavioral.template_method.real;

/**
 * The 'AbstractClass' abstract class
 */
public abstract class SocialNetwork {

    protected String username;
    protected String password;

    public boolean post(String message) {

        boolean result = false;

        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (login(username, password)) {
            // Send the post data.
            result =  sendData(message.getBytes());
            logOut();
        }

        return result;
    }

    abstract boolean login(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
