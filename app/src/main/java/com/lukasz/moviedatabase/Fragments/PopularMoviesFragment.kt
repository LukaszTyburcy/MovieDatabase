package com.lukasz.moviedatabase.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lukasz.moviedatabase.R

/**
 * Created by Lukasz on 2018-06-08.
Upload Picture
 */
class PopularMoviesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragments_layout,container,false)
    }
}