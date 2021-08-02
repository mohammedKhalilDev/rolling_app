package com.m2000k.rolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //catching views
        val rollBTN = findViewById(R.id.button) as Button
        val tv = findViewById(R.id.textView) as TextView
        val img:ImageView = findViewById(R.id.imageView) as ImageView


        rollBTN.setOnClickListener {

            //get the random num between 1..6
            val dise =  DiceRoller(6)
            val theOption =dise.roll();

            //show the random num in the text view
            tv.setText(theOption.toString())

            //choose the img accourding to the random number
            val imgRes = when(theOption){
                1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else-> R.drawable.dice_6
            }
            //showing the img with description
            img.contentDescription = theOption.toString()
            img.setImageResource(imgRes)

        }
    }

}