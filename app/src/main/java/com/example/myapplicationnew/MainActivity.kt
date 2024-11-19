package com.example.myapplicationnew

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationnew.ui.theme.MyApplicationNewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val appName = findViewById<TextView>(R.id.tvApp_name)
            val name = findViewById<TextView>(R.id.tvName)
            val studentnumber = findViewById<TextView>(R.id.tvStudent_number)


            val navigateButton = findViewById<Button>(R.id.btnNavigate)
            navigateButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }

}

