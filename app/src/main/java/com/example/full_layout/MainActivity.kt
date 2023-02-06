package com.example.full_layout

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.full_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imageButton3.setOnClickListener{
            val nuevaVista2 = Intent(this, Navigate::class.java)
            startActivity(nuevaVista2)
        }

        binding.imageButton4.setOnClickListener{
            Toast.makeText(this, "No se puede llamar, inserte número de teléfono", Toast.LENGTH_SHORT).show()
        }

        binding.imageButton5.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(i)
        }

        binding.imageButton6.setOnClickListener{
            binding.imageButton6.setBackgroundColor(Color.BLACK)
        }

        binding.imageButton7.setOnClickListener{
            val b = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/gonjim967"))
            startActivity(b)
        }

        binding.imageButton8.setOnClickListener{
            binding.imageButton8.setImageResource(R.drawable.youtube)
        }
    }
}