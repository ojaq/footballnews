package com.ojaq.footballnews.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ojaq.footballnews.fragments.BundesFragment
import com.ojaq.footballnews.fragments.LaLigaFragment
import com.ojaq.footballnews.fragments.Ligue1Fragment
import com.ojaq.footballnews.fragments.PremierFragment
import com.ojaq.footballnews.fragments.SerieAFragment

//SectionPagerAdapter inherits FragmentStateAdapter to override instance of adapter
//this class will be used to set Fragment Position in ViewPager2
class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    //getItemCount set mount of fragment which will display in adapter
    override fun getItemCount() = 5

    //fragment position left to right
    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> PremierFragment()
            1 -> LaLigaFragment()
            2 -> SerieAFragment()
            3 -> BundesFragment()
            4 -> Ligue1Fragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

}