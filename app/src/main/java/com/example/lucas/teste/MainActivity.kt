package com.example.lucas.teste

import android.content.Intent
import android.content.Intent.parseIntent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

//kotlinx.android.synthetic.main.activity_main.*
//kotlinx.android.synthetic.main.activity_main.view.*
//import kotlinx.android.synthetic.main.activity_main.myToast;
//import kotlinx.android.synthetic.main.<layout_name>.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe (view: View)
    {
        val myToast= Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

    fun countMe (view: View)
    {
        val numeroTextView = findViewById<TextView>(R.id.textViewResultadoTela2) as TextView

        /*val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.setText(count.toString())
        tambem funciona*/

        numeroTextView.setText((Integer.parseInt(numeroTextView.text.toString())+1).toString())
    }

    fun randomMe (view: View)
    {
        val numeroTextView= findViewById<TextView>(R.id.textViewResultadoTela2)
        val countString= numeroTextView.text.toString()
        val count= Integer.parseInt(countString)

        val randomIntent= Intent(this, Main2Activity::class.java)
        randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)
        startActivity(randomIntent)

    }
}
