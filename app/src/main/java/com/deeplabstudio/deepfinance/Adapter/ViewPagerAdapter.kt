package com.deeplabstudio.deepfinance.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.deeplabstudio.deepfinance.DataListFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifeecycle:Lifecycle): FragmentStateAdapter(fragmentManager, lifeecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                DataListFragment.newInstance("https://api.genelpara.com/embed/doviz.json")
            }
            1->{
                DataListFragment.newInstance("https://api.genelpara.com/embed/altin.json")
            }
            else ->{
                Fragment()
            }
        }
    }
}