package com.example.perverteradication

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dontTouchButton.setOnClickListener() {
            val soundFile = MediaPlayer.create(this, R.raw.myeye)
            soundFile.start()
        }

        callButton.setOnClickListener() {
            val intentVal = Intent(Intent.ACTION_DIAL)
            //intentVal.data = Uri.parse("tell:112")
            startActivity(intentVal)
        }
    }
}
