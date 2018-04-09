package com.example.lucas.teste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*
import java.util.*

class Main2Activity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomNumber()
    }

    companion object
    {
        const val TOTAL_COUNT= "total_count"
    }

    fun showRandomNumber ()
    {
        val textViewResultadoTela2= findViewById<TextView>(R.id.textViewResultadoTela2)
        val textViewTexto= findViewById<TextView>(R.id.textViewTexto)

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random= Random()
        var randomInt= 0
        if (count > 0)
            randomInt= random.nextInt(count +1)

        textViewResultadoTela2.setText(Integer.toString(randomInt))
        textViewTexto.text= getString(R.string.random_heading, count)
    }
}
