package com.example.ballshooter;

import android.view.SurfaceHolder;

public class GameLoop extends Thread {
    private boolean isRunning = false;

    public GameLoop(Game game, SurfaceHolder surfaceHolder) {
    }

    public double getAverageUPS() {
        return 0;
    }

    public double getAverageFPS() {
        return 0;
    }

    public void startLoop() {
        isRunning = true;
        start();
    }

    @Override
    public void run() {
        super.run();

        // Game Loop
        while (isRunning) {

            // Try to update and render game

            // Pause game Loop to not exceed target UPS

            // Skip frames to keep up with target UPS

            // Calculate
        }
    }
}