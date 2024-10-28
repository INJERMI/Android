package com.seongeun.mission4

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import android.webkit.RenderProcessGoneDetail
import androidx.appcompat.app.AppCompatActivity
import com.seongeun.mission4.databinding.ActivityMainBinding
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    var total = 0
    var isPlaying = false

    val handler = object:Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            val minute = String.format("%01d", (total / 1000) / 60)
            val second = String.format("%02d", (total / 1000) % 60)
            val millisecond = String.format("%02d", (total % 1000) / 10)

            binding.timeTv.text = "$minute:$second.$millisecond"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            isPlaying = true
            binding.startBtn.visibility = View.GONE
            binding.pauseBtn.visibility = View.VISIBLE
            thread(start = true) {
                while (isPlaying) {
                    Thread.sleep(10) //10ms단위로 업데이트
                    if(isPlaying) {
                        total = total + 10 //초 단위로 증가
                        handler.sendEmptyMessage(0)
                    }
                }
            }
        }
        binding.pauseBtn.setOnClickListener {
            binding.startBtn.visibility = View.VISIBLE
            binding.pauseBtn.visibility = View.GONE
            if (isPlaying) {
                isPlaying = false
                binding.timeTv.text = String.format("%02d:%02d.%02d", (total / 1000) / 60, (total / 1000) % 60, (total % 1000) / 10)
            }
        }
        binding.clearBtn.setOnClickListener {
                isPlaying = false
                total = 0
                binding.timeTv.text = "00:00,00"

        }

    }

}