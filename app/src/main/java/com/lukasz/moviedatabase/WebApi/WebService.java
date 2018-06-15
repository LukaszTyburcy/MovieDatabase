package com.lukasz.moviedatabase.WebApi;


import com.lukasz.moviedatabase.POJO.Movie;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Lukasz on 2018-06-15.
 * Upload Picture
 */

public interface WebService {

    @GET("/movie/popular?api_key=75259a6b8e95c5323c1e87426345cc1f")
    Callback<Movie.MovieResult> getPopularMovies();
}
