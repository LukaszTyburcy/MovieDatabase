package com.lukasz.moviedatabase.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.lukasz.moviedatabase.R

/**
 * Created by Lukasz on 2018-06-05.
Upload Picture
 */
class MoviesAdapter(context : Context) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    private var mInflater: LayoutInflater = LayoutInflater.from(context)
    private var mContext = context

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.movieThumbnailIV.setImageDrawable( mContext.resources.getDrawable(R.drawable.abc_btn_check_material))
        holder.titleTV.text = "Example title"

    } 

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = mInflater.inflate(R.layout.single_movie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val titleTV : TextView =view.findViewById(R.id.titleTV)
        val movieThumbnailIV : ImageView = view.findViewById(R.id.movieIV)
    }
}