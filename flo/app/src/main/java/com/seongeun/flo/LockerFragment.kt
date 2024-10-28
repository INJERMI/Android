package com.seongeun.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.seongeun.flo.databinding.FragmentLockerBinding

class LockerFragment: Fragment() {
    lateinit var binding: FragmentLockerBinding
    private  val information = arrayListOf("저장곡", "음악파일")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerBinding.inflate(inflater, container, false)
        val LockerAdapter = LockerVPAdapter(this)
        binding.lockerContentVp.adapter = LockerAdapter

        TabLayoutMediator(binding.lockerContentTb, binding.lockerContentVp){
                tab, position ->
            tab.text = information[position]
        }.attach()
        return binding.root
    }

}