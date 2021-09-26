package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myText : TextView
    lateinit var buttonOne : Button
    lateinit var buttonTwo : Button
    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.tvNum)
        buttonOne = findViewById(R.id.bPlus)
        buttonTwo = findViewById(R.id.bMinus)

        buttonOne.setOnClickListener{(operation(true))}
        buttonTwo.setOnClickListener{(operation(false))}

    }

    fun operation (add : Boolean){
        if (add){
            number++

        }else {
            number --
        }

        myText.text = number.toString()
    }

}