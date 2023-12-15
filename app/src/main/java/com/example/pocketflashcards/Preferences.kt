package com.example.pocketflashcards

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup


class Preferences : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences_window)

        val colors = findViewById<RadioGroup>(R.id.colors)
        val sizes = findViewById<RadioGroup>(R.id.sizes)

        }
    }


