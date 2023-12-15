package com.example.pocketflashcards

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewTerms : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewterms)

        val coursename = findViewById<TextView>(R.id.coursename)
        val termtitle = findViewById<TextView>(R.id.termtitle)
        val termdescription = findViewById<TextView>(R.id.termdesc)

        coursename.text = intent.getStringExtra("coursename")
        termtitle.text = intent.getStringExtra("termtitle")
        termdescription.text = intent.getStringExtra("termdesc")

    }
}