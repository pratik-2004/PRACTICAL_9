package com.example.practical_9_mad_041_5a3

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation:AnimationDrawable
    lateinit var heartanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview = findViewById<ImageView>(R.id.imagealarm)
        imageview.setBackgroundResource(R.drawable.alarm_animation)
        alarmAnimation = imageview.background as AnimationDrawable
        val imageheart = findViewById<ImageView>(R.id.imageheart)
        imageheart.setBackgroundResource(R.drawable.heart_animation)
        heartanimation=imageheart.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
            alarmAnimation.start()
        else
            alarmAnimation.stop()
        super.onWindowFocusChanged(hasFocus)
    }
}