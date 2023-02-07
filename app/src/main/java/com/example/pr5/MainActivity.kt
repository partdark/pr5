package com.example.pr5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewDebug.IntToString
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.function.IntToDoubleFunction
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val startGame : Button = findViewById(R.id.button)
        startGame.setOnClickListener {   var minText : EditText = findViewById(R.id.randomMin)
            var maxText : EditText = findViewById(R.id.randomMax)
            var m : Int = Integer.parseInt(minText.text.toString())
            var M : Int = Integer.parseInt(maxText.text.toString())
            val min : String
            var myAnswer : Int = Random.nextInt(m ,M)
            var textAnswer : TextView = findViewById(R.id.answer)
            textAnswer.text = myAnswer.toString()
            val smaller : Button = findViewById(R.id.needSmaller)
            smaller.setOnClickListener {
                M = Integer.parseInt(textAnswer.text.toString())
                myAnswer  = Random.nextInt(m ,M)
                textAnswer.text = myAnswer.toString()
            }
            val bigger : Button = findViewById(R.id.NeedBigger)
            bigger.setOnClickListener {   m = Integer.parseInt(textAnswer.text.toString())
                myAnswer  = Random.nextInt(m ,M)
                textAnswer.text = myAnswer.toString() }
            val tr : Button = findViewById(R.id.button4)
            tr.setOnClickListener { textAnswer.text = "скайнет победил человечество" }
        }



    }
    fun changer (view:View)
    {
        val rIntent = Intent (this, MainActivity2::class.java )
        startActivity(rIntent)
    }
}