package com.example.btsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_one_name.setOnClickListener() {
            Toast.makeText(this,"정국 버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }

        button_two_name.setOnClickListener() {
            Toast.makeText(this,"버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }

        button_three_name.setOnClickListener() {
            Toast.makeText(this,"버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
        button_four_name.setOnClickListener() {
            Toast.makeText(this,"버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
        button_five_name.setOnClickListener() {
            Toast.makeText(this,"버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
        button_six_name.setOnClickListener() {
            Toast.makeText(this,"버튼입니다.",Toast.LENGTH_LONG).show()
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }

    }
}
