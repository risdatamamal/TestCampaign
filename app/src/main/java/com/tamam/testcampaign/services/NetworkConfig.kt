package com.tamam.testcampaign.services

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkConfig {
    // set interceptor
    private fun getInterceptor(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    private fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.tvmaze.com/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // Get service from ShowListService
    fun getServiceShowList(): ShowListService = getRetrofit().create(ShowListService::class.java)
//
//    // Get service from ShowDetailService
//    fun getServiceDetailShow(): ShowDetailService = getRetrofit().create(ShowDetailService::class.java)
}