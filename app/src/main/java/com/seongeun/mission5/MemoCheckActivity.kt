package com.seongeun.mission5

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.seongeun.mission5.databinding.ActivityMainBinding
import com.seongeun.mission5.databinding.ActivityMemoCheckBinding

class MemoCheckActivity: AppCompatActivity() {
    lateinit var binding: ActivityMemoCheckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMemoCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("memo")){
            binding.memoCheckText.text = intent.getStringExtra("memo")!!
        }
    }
}