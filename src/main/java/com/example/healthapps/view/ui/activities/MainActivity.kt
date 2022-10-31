package com.example.healthapps.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.healthapps.R
import com.example.healthapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.animationView.setAnimation(R.raw.logo1)
        binding.animationView.playAnimation()

        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed(
            {


                val intent= Intent( this,loginActivity::class.java)
                startActivity(intent)
                finish()

            }, 4000)


    }
}