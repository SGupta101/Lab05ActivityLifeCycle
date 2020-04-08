package com.guptastuti.lab05activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPreferences.edit();
    private TextView mCreateShared = findViewById(R.id.createShared);
    private TextView mStartShared = findViewById(R.id.startShared);
    private TextView mResumeShared = findViewById(R.id.resumeShared);
    private TextView mPauseShared = findViewById(R.id.pauseShared);
    private TextView mStopShared = findViewById(R.id.stopShared);
    private TextView mDestroyShared = findViewById(R.id.destroyShared);
    private TextView mRestartShared = findViewById(R.id.restartShared);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        customClass.setCreateCount(customClass.getCreateCount());
        int intCreate = sharedPreferences.getInt("Create", 0);
        mCreateShared.setText(intCreate+1);
        editor.putInt("Create", intCreate+1);
        editor.apply();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    protected void onStart(){
//        customClass.setStartCount(customClass.getStartCount());
//        int intStart = sharedPreferences.getInt("Start", 0);
//        mStartShared.setText(intStart+1);
//        editor.putInt("Start", intStart+1);
//        editor.apply();
//        super.onStart();
//    }
//
//    @Override
//    protected void onResume(){
//        customClass.setResumeCount(customClass.getResumeCount());
//        int intResume = sharedPreferences.getInt("Resume", 0);
//        mResumeShared.setText(intResume+1);
//        editor.putInt("Resume", intResume+1);
//        editor.apply();
//        super.onResume();
//    }
//
//    @Override
//    protected void onPause(){
//        customClass.setPauseCount(customClass.getPauseCount());
//        int intPause = sharedPreferences.getInt("Pause", 0);
//        mPauseShared.setText(intPause+1);
//        editor.putInt("Pause", intPause+1);
//        editor.apply();
//        super.onPause();
//    }
//
//    @Override
//    protected void onStop(){
//        customClass.setStopCount(customClass.getStopCount());
//        int intStop = sharedPreferences.getInt("Stop", 0);
//        mStopShared.setText(intStop+1);
//        editor.putInt("Stop", intStop+1);
//        editor.apply();
//        super.onStop();
//    }
//
//    @Override
//    protected void onDestroy(){
//        customClass.setDestroyCount(customClass.getDestroyCount());
//        int intDestroy = sharedPreferences.getInt("Destroy", 0);
//        mDestroyShared.setText(intDestroy+1);
//        editor.putInt("Destroy", intDestroy+1);
//        editor.apply();
//        super.onDestroy();
//    }
//
//    @Override
//    protected void onRestart(){
//        customClass.setRestartCount(customClass.getRestartCount());
//        int intRestart = sharedPreferences.getInt("Restart", 0);
//        mRestartShared.setText(intRestart+1);
//        editor.putInt("Restart", intRestart+1);
//        editor.apply();
//        super.onRestart();
//    }

}
