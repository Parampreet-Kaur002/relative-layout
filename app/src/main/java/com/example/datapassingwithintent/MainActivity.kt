package com.example.datapassingwithintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    lateinit var switch1: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1 = findViewById(R.id.switch1)
        switch1.setOnCheckedChangeListener { compoundButton, isOn ->
            if(isOn){
                
            }else{}
        }
    }
}