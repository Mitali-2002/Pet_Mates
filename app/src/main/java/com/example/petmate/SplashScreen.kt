package com.example.petmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.petmate.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private var binding: ActivitySplashScreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        Handler().postDelayed({
            val intent = Intent(this, Login_page::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}