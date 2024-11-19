package com.example.myapplicationnew

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


class DetailedViewScreen: ComponentActivity() {
    private lateinit var tvMorningRun : TextView
    private lateinit var tvAfternoonRun: TextView
    private lateinit var tvappName: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            tvMorningRun = findViewById(R.id.morning_run)
            tvAfternoonRun = findViewById(R.id.afternoon_run)
            tvappName = findViewById(R.id.tvApp_name)


            val MorningRunData = intent.getStringArrayListExtra("Morning Run Data ")
            val AfternoonRunData = intent.getStringArrayListExtra("Afternoon Run Data ")
            val appNameData = intent.getStringArrayListExtra("appNameData")

            val dailyKilometers4 = doubleArrayOf(0.6, 2.0, 4.0, 0.0, 1.5, 2.0,3.5,2.0)
            val totalKilometers3 : Int= 100
            val  totalKilometersDouble : Double = totalKilometers3 .toDouble()

            var totalKilometers = 0.0
            var averagekilometers = 0.0

            for(i in dailyKilometers4.indices) {
                totalKilometers += dailyKilometers4[i]
            }

            var totalKilomters: Double = 100.0
            var dailyKilometers: Double = 5.9
               var averageKilometers2 = totalKilometers / dailyKilometers

            println("Average kilometers per day: $averagekilometers")
            }


        }


    }

