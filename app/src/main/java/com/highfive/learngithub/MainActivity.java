package com.highfive.learngithub;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.demo);
        mediaPlayer.seekTo(20000);
        mediaPlayer.start();
        mediaPlayer.pause();
        mediaPlayer.isPlaying();
    }
}