package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(){  // : دي معناها اكستند يعني وراثة
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MainActivity"
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val converterButton : Button = findViewById(R.id.convert_button)
        val amountEditText : TextInputEditText = findViewById(R.id.amount_edit_text)
        val resultView : TextInputEditText = findViewById(R.id.result_view)
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT
        converterButton.setOnClickListener {
            val amount = amountEditText.text.toString().toDouble()
            val result = (48.39) * amount
            resultView.setText(result.toString())
        }

    }

}


