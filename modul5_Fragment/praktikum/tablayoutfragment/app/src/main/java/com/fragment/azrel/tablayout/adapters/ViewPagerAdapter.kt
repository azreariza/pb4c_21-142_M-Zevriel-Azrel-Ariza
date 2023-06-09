package com.fragment.azrel.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fragment.azrel.tablayout.fragments.ChatFragment
import com.fragment.azrel.tablayout.fragments.StatusFragment
import com.fragment.azrel.tablayout.fragments.PanggilanFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
     return   when(position){
            0->{
                ChatFragment()
            }
            1->{
                StatusFragment()
            }
            2->{
                PanggilanFragment()
            }
            else->{
                Fragment()
            }

        }
    }
}