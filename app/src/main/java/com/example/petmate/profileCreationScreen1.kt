package com.example.petmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petmate.databinding.ActivityProfileCreationScreen1Binding

class profileCreationScreen1 : AppCompatActivity() {

    private lateinit var binding : ActivityProfileCreationScreen1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileCreationScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen2::class.java)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, otp_login::class.java)
            startActivity(intent)
        }
    }
}