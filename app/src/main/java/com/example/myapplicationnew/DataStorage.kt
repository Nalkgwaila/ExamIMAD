package com.example.myapplicationnew


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.recyclerview.widget.RecyclerView

class DataStorage : ComponentActivity() {
    private lateinit var runData: Array<Array<String>>
    val dates = arrayOf<String>()
    val distances = arrayOf<Double>()
    val times = arrayOf<Double>()
    val pacers = arrayOf<Double>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
        var dates = mutableListOf<String>()
        var distances = mutableListOf<Double>()
        var times = mutableListOf<Double>()
        var pacers = mutableListOf<Double>()

        dates.add("2024-04-02,")
        distances. add(6.0)
        times.add(5.0)
        pacers.add(8.0)

        dates.add("2024-04-03,")
        distances. add(2.0)
        times.add(5.0)
        pacers.add(8.0)


        dates.add("2024-04-04,")
        distances. add(4.0)
        times.add(5.0)
        pacers.add(8.0)

        dates.add("2024-04-05,")
        distances. add(0.0)
        times.add(5.0)
        pacers.add(8.0)

        dates.add("2024-04-06,")
        distances. add(0.0)
        times.add(5.0)
        pacers.add(8.0)

        dates.add("2024-04-07,")
        distances. add(0.0)
        times.add(5.0)
        pacers.add(8.0)

        dates.add("2024-04-08,")
        distances. add(0.0)
        times.add(5.0)
        pacers.add(8.0)



        }
    fun addRunningData(date: String, distance: Double,) {
        dates.add(date)
        distances.add(distance)
        times.add (times)
        pacers.add(pacers)
    }
    fun calculateTotalDistance() : Double {
        return distances.sum ()
    }
    fun displayRunningData () {
        for (i in dates. indices) {
            println("Date: ${dates[i]}, Distance : ${distances[i]}")

            fun main() {
                addRunningData("2024-04-02",  0.6)
                addRunningData("2024-04-03", 2.0)
                addRunningData("2024-04-04", 4.0)
                addRunningData("2024-04-05", 0.0)
                addRunningData("2024-04-06", 0.0)
                addRunningData("2024-04-07", 0.0)
                addRunningData("2024-04-08", 0.0)





            }
        }
    }


}