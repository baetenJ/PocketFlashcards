package com.example.pocketflashcards

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.view.LayoutInflater
import android.view.ViewGroup


class MainActivity : AppCompatActivity() {

    private lateinit var popupWindow: PopupWindow
    private lateinit var preferencePopUp: PopupWindow

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addSet = findViewById<Button>(R.id.addStudySetButton)
        addSet.setOnClickListener {
            val intentOne = Intent(this, NewActivity::class.java)
            startActivity(intentOne)
        }
        val visitSets = findViewById<Button>(R.id.studySetButton)
        visitSets.setOnClickListener {
            val intentTwo = Intent(this, StudySets::class.java)
            startActivity(intentTwo)
        }
        val helpbutton = findViewById<ImageButton>(R.id.helpbutton)
        helpbutton.setOnClickListener{
            showPopupWindow(it)
        }
        val preferencesbutton = findViewById<ImageButton>(R.id.preferencesbutton)
        preferencesbutton.setOnClickListener{
            val preferenceIntent = Intent(this, Preferences::class.java)
            startActivity(preferenceIntent)
        }
    }
    @SuppressLint("MissingInflatedId")
    private fun showPopupWindow(view: View) {
        // Inflate the popup layout
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView: View = inflater.inflate(R.layout.popuplayout, null)

        // Create the PopupWindow
        popupWindow = PopupWindow(
            popupView,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            true
        )
        popupWindow.showAsDropDown(view, -775, -1500)

    }

}
