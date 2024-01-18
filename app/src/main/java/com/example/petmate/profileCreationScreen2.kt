package com.example.petmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petmate.databinding.ActivityProfileCreationScreen1Binding
import com.example.petmate.databinding.ActivityProfileCreationScreen2Binding

class profileCreationScreen2 : AppCompatActivity() {

    private lateinit var binding : ActivityProfileCreationScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileCreationScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen3::class.java)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen1::class.java)
            startActivity(intent)
        }
    }
}