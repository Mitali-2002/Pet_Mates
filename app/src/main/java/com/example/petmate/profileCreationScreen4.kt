package com.example.petmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petmate.databinding.ActivityProfileCreationScreen4Binding

class profileCreationScreen4 : AppCompatActivity() {

    private lateinit var binding: ActivityProfileCreationScreen4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileCreationScreen4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen5::class.java)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen3::class.java)
            startActivity(intent)
        }
    }
}