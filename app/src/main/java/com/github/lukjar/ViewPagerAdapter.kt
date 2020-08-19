package com.github.lukjar

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MyMapFragment()
            1 -> ColorFragment.newInstance(Color.RED)
            2 -> ColorFragment.newInstance(Color.BLACK)
            else -> ColorFragment.newInstance(Color.BLUE)
        }
    }
}
