package com.lukasz.moviedatabase.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.lukasz.moviedatabase.Fragments.PopularMoviesFragment
import com.lukasz.moviedatabase.Fragments.TopMoviesFragment
import com.lukasz.moviedatabase.Fragments.UpcommingMoviesFragment

/**
 * Created by Lukasz on 2018-06-07.
Upload Picture
 */
class PagerAdapter(fm: FragmentManager, private val numberOfTabs : Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return when(position){
            0 -> TopMoviesFragment()
            1 -> PopularMoviesFragment()
            2 -> UpcommingMoviesFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return numberOfTabs

    }
}