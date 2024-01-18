package com.example.petmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petmate.databinding.ActivityProfileCreationScreen4Binding
import com.example.petmate.databinding.ActivityProfileCreationScreen5Binding
import com.example.petmate.databinding.ActivityProfileCreationScreen6Binding

class profileCreationScreen5 : AppCompatActivity() {

    private lateinit var binding: ActivityProfileCreationScreen5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileCreationScreen5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen6::class.java)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, profileCreationScreen4::class.java)
            startActivity(intent)

        }
    }
}