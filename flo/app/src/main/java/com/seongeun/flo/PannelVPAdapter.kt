package com.seongeun.flo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PannelVPAdapter(fragment:Fragment) : FragmentStateAdapter(fragment){
    private val fragmentlist : ArrayList<Fragment> = ArrayList()
    override fun getItemCount(): Int = fragmentlist.size
    override fun createFragment(position: Int): Fragment = fragmentlist[position] //0부터 getItemCount 까지 프래그먼트 생성
    fun addFragment(fragment: Fragment){
        fragmentlist.add(fragment)
        notifyItemInserted(fragmentlist.size-1)
    }
}