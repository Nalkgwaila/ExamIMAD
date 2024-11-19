package layout

import android.app.AlertDialog
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import android . content.Context
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception


class ErrorHandling : ComponentActivity() {
    fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
        fun validateInput(date: String, distance: String, time:String,pace:String ) :
            Boolean {
        if (date.isEmpty() || distance.isEmpty() || time.isEmpty() || pace.isEmpty()) {
            showError("Please fill in all fields.")
            return false
        }



        return true

        try {

        }catch (e: Exception) {
            showError("An error occured: ${e.message}")
        }
        fun showError(message: String) {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()



    }

            fun showFeedBack(message: String)  {


                AlertDialog.Builder (this)
                    .setTitle("Error")
                    .setMessage("message")
                    .setPositiveButton("OK") { _, _  ->}
                    .show()

                }

            }            }






