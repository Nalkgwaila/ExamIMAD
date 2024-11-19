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

            val dailyKilometers = doubleArrayOf(0.6, 2.0, 4.0, 0.0, 1.5, 2.0,3.5,2.0)

            var totalKilometers = 0.0
            var averagekilometers = 0.0

            for(i in dailyKilometers.indices) {
                totalKilometers += dailyKilometers[i]
            }
             averagekilometers = totalKilometers/dailyKilometers


            println("Average kilometers per day: $averagekilometers")
            }


        }


    }

