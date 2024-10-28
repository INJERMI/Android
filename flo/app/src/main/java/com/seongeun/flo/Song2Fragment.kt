package com.seongeun.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.seongeun.flo.databinding.FragmentSong2Binding

class Song2Fragment : Fragment() {
    lateinit var binding : FragmentSong2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSong2Binding.inflate(inflater, container, false)

        return binding.root
    }

}

