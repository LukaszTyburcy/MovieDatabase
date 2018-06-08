package com.lukasz.moviedatabase.Fragments

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lukasz.moviedatabase.Adapter.MoviesAdapter
import com.lukasz.moviedatabase.R

/**
 * Created by Lukasz on 2018-06-07.
Upload Picture
 */
class TopMoviesFragment : android.support.v4.app.Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragments_layout,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewManager = GridLayoutManager(context,3)
        viewAdapter = MoviesAdapter(activity?.applicationContext!!)

        recyclerView = view.findViewById<RecyclerView>(R.id.movieRecycler).apply {

            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }
    }
}