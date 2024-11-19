package layout

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.myapplicationnew.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val runData = arrayOf("Date", "Distance (km)")
            arrayOf("2024-04-02, Morning: 0.6, Afternoon: 1,5")
            arrayOf("2024-04-03, Morning: 2.0, Afternoon: 2.0")
            arrayOf("2024-04-04, Morning: 4.0, Afternoon: 3,5")
            arrayOf("2024-04-05, Morning: 0.0, Afternoon: 0.0")
            arrayOf("2024-04-06, Morning: 0.0, Afternoon: 0.0")
            arrayOf("2024-04-07, Morning: 0.0, Afternoon: 0")
            arrayOf("2024-04-08, Morning: 0, Afternoon: 2")
            val btnClear = findViewById<Button>(R.id.btnClear_data)
        }




        }


        }
