package com.seongeun.viewrandering

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seongeun.viewrandering.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = Handler(Looper.getMainLooper())

        val imageList = arrayListOf<Int>()

        imageList.add(R.drawable.bear)
        imageList.add(R.drawable.duke)
        imageList.add(R.drawable.just)
        imageList.add(R.drawable.duke)

        Thread{
            for(image in imageList){
                handler.post{
                    binding.iv.setImageResoure(image)
                }
//                runOnUiThread{
//                    binding.iv.setImageResoure(image)
//                }
                Thread.sleep(2000)
            }
        }

    }
}

