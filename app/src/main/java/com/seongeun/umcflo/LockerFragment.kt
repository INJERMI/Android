package com.seongeun.umcflo

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.seongeun.umcflo.LockerVPAdapter
import com.seongeun.umcflo.databinding.FragmentHomeBinding
import com.seongeun.umcflo.databinding.FragmentLockerBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson

class LockerFragment : Fragment() {
    lateinit var binding: FragmentLockerBinding
    private val information = arrayListOf("저장한곡", "음악파일")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLockerBinding.inflate(inflater, container, false)

        val lockerAdapter = LockerVPAdapter(this)
        binding.lockerContentVp.adapter = lockerAdapter
        TabLayoutMediator(binding.lockerContentTb, binding.lockerContentVp) { tab, position ->
            tab.text = information[position]
        }.attach()

        val bottomSheetFragment = BottomSheetFragment()

        binding.lockerSelectAllTv.setOnClickListener {
            bottomSheetFragment.show(requireFragmentManager(), "BottomSheetDialog")
        }

        return binding.root
    }
}