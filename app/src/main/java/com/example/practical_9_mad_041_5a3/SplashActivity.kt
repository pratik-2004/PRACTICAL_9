package com.example.practical_9_mad_041_5a3

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var guni_imgg: ImageView
    lateinit var logo_animation: Animation
    lateinit var log_animation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        guni_imgg=findViewById<ImageView>(R.id.uvpce)
        guni_imgg.setBackgroundResource(R.drawable.uvpce_logo_animation)

        log_animation = guni_imgg.background as AnimationDrawable
        logo_animation = AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logo_animation.setAnimationListener(this)
    }
    //imaglogo.startanimation  if condition of has focused

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            guni_imgg.startAnimation(logo_animation)
            log_animation.start()

        }
        else
        {
            log_animation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        Intent(this,MainActivity::class.java).apply { startActivity(this)}
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}