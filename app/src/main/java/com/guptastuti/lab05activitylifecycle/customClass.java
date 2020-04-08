package com.guptastuti.lab05activitylifecycle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;

public class customClass {
    private static int createCount, startCount, resumeCount, pauseCount, stopCount, destroyCount, restartCount = 0;

    public static int getStartCount() {
        return startCount;
    }

    public static void setStartCount(int startCount) {
        customClass.startCount = startCount;
    }

    public static int getCreateCount() {
        return createCount;
    }

    public static void setCreateCount(int createCount) {
        customClass.createCount = createCount;
    }

    public static int getResumeCount() {
        return resumeCount;
    }

    public static void setResumeCount(int resumeCount) {
        customClass.resumeCount = resumeCount;
    }

    public static int getPauseCount() {
        return pauseCount;
    }

    public static void setPauseCount(int pauseCount) {
        customClass.pauseCount = pauseCount;
    }

    public static int getStopCount() {
        return stopCount;
    }

    public static void setStopCount(int stopCount) {
        customClass.stopCount = stopCount;
    }

    public static int getDestroyCount() {
        return destroyCount;
    }

    public static void setDestroyCount(int destroyCount) {
        customClass.destroyCount = destroyCount;
    }

    public static int getRestartCount() {
        return restartCount;
    }

    public static void setRestartCount(int restartCount) {
        customClass.restartCount = restartCount;
    }
}
