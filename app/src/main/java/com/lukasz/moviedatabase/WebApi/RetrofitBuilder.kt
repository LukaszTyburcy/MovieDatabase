package com.lukasz.moviedatabase.WebApi

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Lukasz on 2018-06-15.
Upload Picture
 */
class RetrofitBuilder {
    private  var baseUrl: String = "http://api.themoviedb.org/3/"
    private lateinit var retrofit: Retrofit
    private lateinit var myWebService : WebService

    fun getMyWebService() : WebService {

        val okHttpBuilder = OkHttpClient.Builder()
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        okHttpBuilder.addInterceptor(logging)

        retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        myWebService = retrofit.create(WebService::class.java)


        return myWebService
    }
}