package com.example.pocketflashcards


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newstudyset)

        val courseName = findViewById<TextView>(R.id.courseName)
        val newTermTitle = findViewById<TextView>(R.id.termInput)
        val newTermDescription = findViewById<TextView>(R.id.definitionInput)

        val addTerm = findViewById<Button>(R.id.addTerm)
        addTerm.setOnClickListener {
            val intentthree = Intent(this, ViewTerms::class.java)
            intentthree.putExtra("coursename", courseName.text.toString())
            intentthree.putExtra("termtitle", newTermTitle.text.toString())
            intentthree.putExtra("termdesc", newTermDescription.text.toString())
            startActivity(intentthree)
        }
    }
}
