package com.dong.nativeapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.dong.nativeapp.databinding.ActivityMainBinding
import com.dong.nativelibrary.canvas.nativeCanvas

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.root.nativeCanvas {
           val rectF= RectF(100f,100f,200f,200f)
           drawRect(rectF, Paint(Paint.ANTI_ALIAS_FLAG).apply {
               color= Color.RED
               style=Paint.Style.FILL
           })
        }
    }
}