package com.elksa.logcatreader;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LogcatReader {

    public String read() {

        Process logCat;
        StringBuilder log = new StringBuilder();

        try {
            logCat = Runtime.getRuntime().exec(new String[]{"logcat", "-d"});
            BufferedReader br = new BufferedReader(new InputStreamReader(logCat.getInputStream()),4*1024);
            String line;
            String separator = System.getProperty("line.separator");
            while ((line = br.readLine()) != null) {
                log.append(line);
                log.append(separator);
            }
        }
        catch (Exception e) {
            Log.e(LogcatReader.class.getName(), "Error reading log: " + e.toString());
            e.printStackTrace();
        }

        return log.toString();
    }

    public void clear() {

        try {
            Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
        }
        catch (Exception e) {
            Log.e(LogcatReader.class.getName(), "Error clearing log: " + e.toString());
            e.printStackTrace();
        }
    }
}
