package com.seongeun.mission1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
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
        //화면 클릭을 인식
        val image1 = findViewById<ImageView>(R.id.imageView5)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, image1Activity::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.imageView6)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, image2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.imageView7)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, image3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.imageView8)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, image4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.imageView9)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 사진 선택", Toast.LENGTH_LONG).show()
            val intent = Intent(this, image5Activity::class.java)
            startActivity(intent)
        }

    }
}

