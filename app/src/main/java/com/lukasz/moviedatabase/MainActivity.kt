package com.lukasz.moviedatabase

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import com.lukasz.moviedatabase.Adapter.PagerAdapter
import com.lukasz.moviedatabase.WebApi.RetrofitBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val client  = RetrofitBuilder().getMyWebService()


        tabLayout.addTab(tabLayout.newTab().setText("Popular"))
        tabLayout.addTab(tabLayout.newTab().setText("Top"))
        tabLayout.addTab(tabLayout.newTab().setText("Upcomming"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val pageAdapter = PagerAdapter(supportFragmentManager, tabLayout.tabCount)
        pager.adapter = pageAdapter
        pager.setOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }
}
