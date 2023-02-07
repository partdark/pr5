package com.example.pr5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val startButton : Button = findViewById(R.id.buttonStart)
        var textTest : TextView = findViewById(R.id.textViewThinking)
        var answ : EditText = findViewById(R.id.answer)
        var rnd : Int = -3
        startButton.setOnClickListener {

            rnd = Random.nextInt(0,10)
        }
        val buttonN : Button = findViewById(R.id.buttonNew)
        buttonN.setOnClickListener {
           if (answ.text.isNotEmpty()) {
               if (rnd > Integer.parseInt(answ.text.toString()))
               {
                   textTest.text ="больше"
               }
               if (rnd < Integer.parseInt(answ.text.toString()))
               {
                   textTest.text ="меньше"
               }
               if (rnd == Integer.parseInt(answ.text.toString()))
               {
                   textTest.text ="скайнет проиграл"
               }
           }
        }



    }
    fun backer (view: View)
    {
        val rIntent = Intent (this, MainActivity::class.java )
        startActivity(rIntent)
    }
}