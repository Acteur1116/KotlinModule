package com.renard.music.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.renard.common.ui.fragment.BaseFragment

/**
 * Created by Riven_rabbit on 2019/3/25
 */
class MusicPagerAdapter (fm: FragmentManager, val titles:Array<String>, val fragments:List<BaseFragment>)
    : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

}