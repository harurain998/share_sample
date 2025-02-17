package com.example.share_sample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // idを取得
        val tx :TextView = findViewById(R.id.tv)
        val btn1 :Button = findViewById(R.id.btnDog)
        val btn2 :Button = findViewById(R.id.btnCat)
        val btn3 :Button = findViewById(R.id.btnClear)

        // クリックを処理
        btn1.setOnClickListener {
            tx.text = "いぬ"
        }

        btn2.setOnClickListener {
            tx.text = "ねこ"
        }

        btn3.setOnClickListener {
            tx.text = "・・・"
        }
    }
}