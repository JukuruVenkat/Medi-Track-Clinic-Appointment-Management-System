package com.venkat.meditrack.util;

import java.util.TimerTask;

public class ReminderTask extends TimerTask {

    private String message;

    public ReminderTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Reminder: " + message);
    }
}