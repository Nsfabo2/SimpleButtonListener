package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var XMLButton: Button
    lateinit var constraint: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //First button : XML button
        XMLButton= findViewById(R.id.XMLBtn)
        XMLButton.setOnClickListener {
            Toast.makeText(this, "XML button clicked !", Toast.LENGTH_LONG).show()
        }

        constraint = findViewById(R.id.ConLLO)

        //Second button :  Kotlin code button
        // https://www.journaldev.com/78/android-button-using-kotlin
        val KotlinButton = Button(this)
        KotlinButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT,
        )
        KotlinButton.text = "Kotlin"
        KotlinButton.setOnClickListener {
            Toast.makeText(this, "Kotlin button clicked !", Toast.LENGTH_LONG).show()

        }
        constraint.addView(KotlinButton)

    }//end oncreate

}//end class